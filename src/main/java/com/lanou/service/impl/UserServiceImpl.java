package com.lanou.service.impl;

import com.lanou.domain.*;
import com.lanou.mapper.*;
import com.lanou.result.ProjectApplyBean;
import com.lanou.service.UserService;
import com.lanou.util.PmsTools;
import com.lanou.util.SearchBean;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created by 蓝鸥科技有限公司  www.lanou3g.com.
 */
@Service("UserService")
public class UserServiceImpl implements UserService {
    @Resource
    private PMSBaseDepartmentMapper pmsBaseDepartmentMapper;
    @Resource
    private PMSBaseStaffMapper pmsBaseStaffMapper;

    @Resource
    private PmsFlowApplyMapper pmsFlowApplyMapper;

    @Resource
    private PmsFlowBusiRelaMapper pmsFlowBusiRelaMapper;

    @Resource
    private RdmsProjBudgetMapper rdmsProjBudgetMapper;

    @Resource
    private RdmsProjBaseMapper rdmsProjBaseMapper;

    @Resource
    private PmsBusiExtItemMapper pmsBusiExtItemMapper;

    @Resource
    private SysBusiAttachmentMapper sysBusiAttachmentMapper;

    /**
     * 查询所有部门列表
     **/
    @Override
    public List<PMSBaseDepartment> selectAll() {
        return pmsBaseDepartmentMapper.selectAll();
    }

    /**
     * 根据条件查询部门列表
     *
     * @param searchBean 查询条件
     **/
    @Override
    public List<PMSBaseDepartment> getDepartmentByCondition(SearchBean searchBean) {
        return pmsBaseDepartmentMapper.selectBySelecttive(searchBean);
    }

    /**
     * 根据条件查询员工列表
     *
     * @param searchBean 查询条件
     **/
    @Override
    public List<PMSBaseStaff> getStaffByCondition(SearchBean searchBean) {
        return pmsBaseStaffMapper.selectBySelecttive(searchBean);
    }

    /**
     * 根据部门id 查询部门对象
     *
     * @param depid 部门id
     **/
    @Override
    public PMSBaseDepartment selectDepartmentByDepId(Integer depid) {
        return pmsBaseDepartmentMapper.selectByPrimaryKey(depid);
    }

    /**
     * 根据员工id查询员工对象
     *
     * @param staffid 员工id
     **/
    @Override
    public PMSBaseStaff selectStaffByStaffID(Integer staffid) {
        return pmsBaseStaffMapper.selectByPrimaryKey(staffid);
    }

    /**
     * 科研项目申报
     *
     * @param applyBean 页面传递过来的数据
     **/
    @Override
    public boolean projectApply(ProjectApplyBean applyBean, RdmsProjBase rdmsProjBase) throws IOException {

        /*1、项目基本表对象*/
        RdmsProjBase projBase = insertProjBase(rdmsProjBase, applyBean.getLoginStaff());

        /*2、审批对象 必填字段*/
        PMSBaseStaff flowStaff = selectStaffByStaffID(Integer.parseInt(applyBean.getStaffNo()));

        /*3、存储预算信息、立项报告书*/
        insertProjBudget(applyBean, projBase.getProjId());

        /*4、开始发起申请流程*/
        PmsFlowApply apply = insertFlowApply(applyBean.getLoginStaff());

        /*5、流程与业务关联信息*/
        insertFlowBusiRela(apply.getAppId(), projBase.getProjId());

        return true;
    }

    /**
     * 流程与业务关联信息
     *
     * @param appID  申请标识 即PmsFlowApply表中的主键
     * @param busiID 关联业务标识 即RdmsProjBase表中的主键
     **/
    private void insertFlowBusiRela(String appID, String busiID) {
        PmsFlowBusiRela busiRela = new PmsFlowBusiRela();
        busiRela.setRelaId("R" + PmsTools.getRandomString(pmsFlowBusiRelaMapper.selectMaxKey()));//流程与业务关联标识 可以采用随机字符串的方式
        busiRela.setAppId(appID);//申请标识
        busiRela.setRelaBusiTable("RDMS_PROJ_BASE");//关联业务表
        busiRela.setRelaBusiId(busiID);//关联业务id

        /*插入数据库*/
        pmsFlowBusiRelaMapper.insert(busiRela);
    }


    /**
     * 更新并保存科研项目申请中的项目信息
     *
     * @param projBase 科研项目基本信息对象
     **/
    private RdmsProjBase insertProjBase(RdmsProjBase projBase, PMSBaseStaff loginStaff) throws IOException {
        /*主键 随机字符串*/
        projBase.setProjId("P" + PmsTools.getRandomString(rdmsProjBaseMapper.selectMaxKey()));

        PMSBaseDepartment department1 = selectDepartmentByDepId(
                Integer.parseInt(projBase.getAppOrgNo()));//项目申报单位
        PMSBaseDepartment department2 = selectDepartmentByDepId(
                Integer.parseInt(projBase.getUniteAppOrgNo()));//联合申报单位
//        PMSBaseStaff baseStaff = selectStaffByStaffID(1);//创建人信息
        projBase.setCreateStaffNo(loginStaff.getStaffid() + "");//创建人编号
        projBase.setCreateStaffName(loginStaff.getStaffname());//创建人姓名
        projBase.setCreateDate(new Date());//创建时间
        projBase.setPrimeStaffNo(loginStaff.getStaffid() + "");//项目负责人编号
//        projBase.setPrimeUserDesc("primeUserDesc");//项目负责人描述
        projBase.setAppOrgName(department1.getDepname());//更新项目申报单位
        projBase.setUniteAppOrgName(department2.getDepname());//更新联合申报单位

        /*执行数据库插入操作*/
        rdmsProjBaseMapper.insert(projBase);

        return projBase;
    }

    /***
     * 插入流程申请记录
     * @param loginStaff 申请员工 当前登录员工
     * **/
    private PmsFlowApply insertFlowApply(PMSBaseStaff loginStaff) {
        PmsFlowApply apply = new PmsFlowApply();
        /*流程申请标识 主键 随机字符串*/
        String appID = "F" + PmsTools.getRandomString(pmsFlowApplyMapper.selectMaxKey());
        apply.setAppId(appID);//申请标识
        apply.setAppNo(appID);//申请编号

        apply.setProcessinstid(1);//流程实例标识
        apply.setAppType("科研项目申报");//申请类型
        apply.setTheme("科研项目申报");//申请主题
        apply.setApplyDate(new Date());//申请时间
        apply.setFlowAppStaffNo(loginStaff.getStaffid() + "");//系统申请人员编号
        apply.setFlowAppStaffName(loginStaff.getStaffname());//系统申请人员名称
        apply.setBusiappStaffNo(loginStaff.getStaffid() + "");//业务申请人员
        apply.setBusiappStaffName(loginStaff.getStaffname());//业务申请人员名称
        /*需要有一个业务申请人部门标识 即申请人所在部门*/
        PMSBaseDepartment department = selectDepartmentByDepId(loginStaff.getDeptid());
        apply.setBusiappDeptId(department.getDepid() + "");//业务申请人员部门编号
        apply.setBusiappDeptName(department.getDepname());//业务申请人员部门名称
        apply.setDataOrgNo(department.getDepid() + "");//数据页面单位

        apply.setBusiLinkDesc(loginStaff.getLinkTel());//业务申请人联系内容
        apply.setAppYm("201712");//申请年月
        apply.setPrintFlag("true");//是否打印
        apply.setCanPrintFlag("true");//是否可以打印
        apply.setStatus("部门经理审批");//流程状态
        apply.setEffectFlag("true");//是否有效
        apply.setCreateStaffNo(loginStaff.getStaffid() + "");//创建人
        apply.setCreateStaffName(loginStaff.getStaffname());//创建人姓名
        apply.setCreateDate(new Date());//创建时间

        /*插入数据*/
        pmsFlowApplyMapper.insert(apply);
        return apply;
    }

    /**
     * 处理项目申请中的经费
     **/
    private void insertProjBudget(ProjectApplyBean applyBean, String busiId) {
        /*3.1 公司经费*/
        if (!StringUtils.isBlank(applyBean.getBudgetFee1())) {
            try {
                RdmsProjBudget budget = new RdmsProjBudget();
                /*随机主键id*/
                budget.setBudDetailId("B" + PmsTools.getRandomString(rdmsProjBudgetMapper.selectMaxKey()));

                budget.setBusiTable("RDMS_PROJ_BASE");//业务表
                budget.setBusiId(busiId);//业务标识
                budget.setBudgetType("公司经费");
                BigDecimal budgetFee = BigDecimal.valueOf(
                        Double.parseDouble(applyBean.getBudgetFee1()));
                budget.setBudgetFee(budgetFee);
                /*执行插入操作*/
                rdmsProjBudgetMapper.insert(budget);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        /*3.2 外部支持经费*/
        if (!StringUtils.isBlank(applyBean.getBudgetFee2())) {
            try {
                RdmsProjBudget budget = new RdmsProjBudget();
                /*随机主键id*/
                budget.setBudDetailId("B" + PmsTools.getRandomString(rdmsProjBudgetMapper.selectMaxKey()));

                budget.setBusiTable("RDMS_PROJ_BASE");//业务表
                budget.setBusiId(busiId);//业务标识
                budget.setBudgetType("外部支持经费");
                BigDecimal budgetFee = BigDecimal.valueOf(
                        Double.parseDouble(applyBean.getBudgetFee2()));
                budget.setBudgetFee(budgetFee);
                /*执行插入操作*/
                rdmsProjBudgetMapper.insert(budget);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        /*3.3 国家经费*/
        if (!StringUtils.isBlank(applyBean.getBudgetFee3())) {
            try {
                RdmsProjBudget budget = new RdmsProjBudget();
                /*随机主键id*/
                budget.setBudDetailId("B" + PmsTools.getRandomString(rdmsProjBudgetMapper.selectMaxKey()));

                budget.setBusiTable("RDMS_PROJ_BASE");//业务表
                budget.setBusiId(busiId);//业务标识
                budget.setBudgetType("国家经费");
                BigDecimal budgetFee = BigDecimal.valueOf(
                        Double.parseDouble(applyBean.getBudgetFee3()));
                budget.setBudgetFee(budgetFee);
                /*执行插入操作*/
                rdmsProjBudgetMapper.insert(budget);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        /*3.4 立项报告书*/
        if (applyBean.getAttachment() != null) {
            try {
                /*现保存附件*/
                /*主键 随机字符串*/
                applyBean.getAttachment().setAttachid("A" + PmsTools.getRandomString(sysBusiAttachmentMapper.selectMaxKey()));
                sysBusiAttachmentMapper.insert(applyBean.getAttachment());

                PmsBusiExtItem extItem = new PmsBusiExtItem();
                /*主键id*/
                extItem.setExtItemId("E" + PmsTools.getRandomString(pmsBusiExtItemMapper.selectMaxKey()));
                extItem.setBusiTable("RDMS_PROJ_BASE");
                extItem.setBusiId(busiId);
                extItem.setExtType("立项报告书");
                extItem.setExtPropCode(applyBean.getAttachment().getAttachid());
                extItem.setExtPropValue(applyBean.getAttachment().getUri());

                /*保存业务申请中的附件信息*/
                pmsBusiExtItemMapper.insert(extItem);

            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
    }
}
