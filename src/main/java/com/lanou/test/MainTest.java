package com.lanou.test;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lanou.controller.UserController;
import com.lanou.domain.PMSBaseDepartment;
import com.lanou.domain.PMSBaseStaff;
import com.lanou.domain.RdmsProjBase;
import com.lanou.mapper.PMSBaseDepartmentMapper;
import com.lanou.mapper.RdmsProjBaseMapper;
import com.lanou.mapper.RdmsProjBudgetMapper;
import com.lanou.result.ProjectApplyBean;
import com.lanou.service.UserService;
import com.lanou.util.PmsTools;
import com.lanou.util.SearchBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.List;

/**
 * Created by 蓝鸥科技有限公司  www.lanou3g.com.
 */
@RunWith(SpringJUnit4ClassRunner.class)  //使用junit4进行测试
@ContextConfiguration
        ({"/SSM-*.xml"}) //加载配置文件
public class MainTest {
    @Resource
    private RdmsProjBaseMapper rdmsProjBaseMapper;

    @Resource
    private PMSBaseDepartmentMapper pmsBaseDepartmentMapper;

    @Resource
    private UserController userController;

    @Resource
    private UserService userService;

    @Resource
    private RdmsProjBudgetMapper rdmsProjBudgetMapper;

    @Test
    public void test() {

        String value = "ARTIFICIAL_MAC_DRILL;BIMS_BUSI_OBJ;CARGO_DEPOSIT_DETAIL;" +
                "CARGO_DEPOSIT_PERMIT;CARGO_TRANS_MEASURE;CARGO_TRANS_PERMIT;" +
                "CONTROLAREA_PASSPERMIT;FC_PASSAGE_PERMIT;FIREPROTDOOR_OPEN_PERMIT;" +
                "FIREUSING_PERMIT;FIRE_DISCONNECT_PERMIT;FIRE_DISCONNECT_WORK;" +
                "FIRE_PROTECTIVE;FIRE_PROTECTIVE_DETAIL;FIRE_PROTECTIVE_EXT;" +
                "FIRE_PROTECTIVE_PROTECT;GUARANTEE_PERMIT;HRADIATION_RISK_ANALY;" +
                "HRADIATION_RX_RISKCONTROL;HRADIATION_USERRADIATION;HRADIATION_WORK_CHECK;" +
                "HRADIATION_WORK_PERMIT;HRADIATION_WORK_PROTWORK;NEWOPEN_HOLE;PMS_BIMS_STORE;" +
                "PMS_BUSI_EXT_ITEM;PMS_BUSI_EXT_ITEMVAL;PMS_BUSI_PRINT;PMS_FLOWAPP_OPERLOG;" +
                "PMS_FLOW_APPLY;PMS_FLOW_BUSI_RELA;PMS_MAC;PMS_PLANT;PMS_RAY_USER;PMS_RELA_STAFF;" +
                "PMS_ROOM;PMS_SYS_ATTACHMENT;RAY_PERMIT;RAY_PERMIT_DETAIL;RDMS_PROJ_BASE;" +
                "RDMS_PROJ_BUDGET;RDMS_PROJ_CHANGE;RDMS_PROJ_CONTRACT;RECEIVE_METER_ANALY;" +
                "SPECIAL_WORK_PERMIT;SPECWORK_PERMIT;SYS_BUSI_ATTACHMENT;SYS_SEND_MAIL;" +
                "URGENT_PAYMENT;VEHICLE_PERMIT;";
        System.out.println("***" + value + "****");
        String data = value.toLowerCase();
        System.out.println("********");
        System.out.println("***" + data + "****");

    }

    @Test
    public void test1() throws IOException {
        String baseData = "{\"projName\":\"业务流程管理平台\",\"appOrgName\":\"蓝鸥公司\",\"uniteAppOrgName\":\"蓝鸥子公司\",\"purpose\":\"建设科管理系统\",\"safeDesc\":\"系统安全\",\"reliableDesc\":\"三重保障\",\"econDesc\":\"提高办公效率\",\"otherDesc\":\"2016建设需要\",\"achievementDesc\":\"蓝鸥测试数据\",\"realUser\":\"蓝鸥测试数据\",\"potentialUser\":\"蓝鸥测试数据\",\"cycle\":\"10\",\"content\":\"蓝鸥测试数据\",\"totalBudget\":\"1200.00\",\"budgetFee\":\"1200.00\"}";

        String otherData = "{\"primeUserDesc\":\"蓝鸥测试数据\",\"projType\":\"cb01,cb03\",\"rightDesc\":\"蓝鸥测试数据\",\"benefitsDesc\":\"蓝鸥测试数据\",\"fixedAssets\":\"蓝鸥测试数据\",\"acceptStand\":\"蓝鸥测试数据\",\"projFile\":\"\",\"staffNo\":\"李四\"}";


        String data = baseData.substring(0, (baseData.length() - 1)) + "," + otherData.substring(1, otherData.length());

//        System.out.println(data);

        ObjectMapper mapper = new ObjectMapper();
        // 设置输入时忽略在JSON字符串中存在但Java对象实际没有的属性
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        RdmsProjBase base = mapper.readValue(data, RdmsProjBase.class);
        System.out.println(base);


    }

    @Test
    public void test2() {
//        System.out.println(pmsBaseDepartmentMapper);
//        List<PMSBaseDepartment> departments=pmsBaseDepartmentMapper.selectAll();
//
//        for (PMSBaseDepartment department : departments) {
//            System.out.println(department);
//        }

        SearchBean searchBean = new SearchBean();
        searchBean.setKey("YP");
        List<PMSBaseDepartment> departments = pmsBaseDepartmentMapper.selectBySelecttive(null);
        System.out.println(departments);


    }

    @Test
    public void test3() throws IOException {
        String data = "{\"projName\":\"业务流程管理平台\",\"appOrgNo\":\"2\",\"uniteAppOrgNo\":\"3\",\"purpose\":\"建设科管理系统\",\"safeDesc\":\"系统安全\",\"reliableDesc\":\"三重保障\",\"econDesc\":\"提高办公效率\",\"otherDesc\":\"2016建设需要\",\"achievementDesc\":\"蓝鸥测试数据\",\"realUser\":\"蓝鸥测试数据\",\"potentialUser\":\"蓝鸥测试数据\",\"cycle\":\"10\",\"content\":\"蓝鸥测试数据\",\"totalBudget\":\"1200.00\",\"budgetFee\":\"1200.00\",\"primeUserDesc\":\"蓝鸥测试数据\",\"projType\":\"cb01,cb03\",\"rightDesc\":\"蓝鸥测试数据\",\"benefitsDesc\":\"蓝鸥测试数据\",\"fixedAssets\":\"蓝鸥测试数据\",\"acceptStand\":\"蓝鸥测试数据\",\"projFile\":\"C:\\\\fakepath\\\\idea.png\",\"staffNo\":\"3\"}";

        ObjectMapper mapper = new ObjectMapper();
        // 设置输入时忽略在JSON字符串中存在但Java对象实际没有的属性
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);

        /*格式化提交的数据对象*/
        ProjectApplyBean applyBean = mapper.readValue(data, ProjectApplyBean.class);

        RdmsProjBase projBase = mapper.readValue(data, RdmsProjBase.class);

        /*当前登录用户*/
        PMSBaseStaff loginStaff = userService.selectStaffByStaffID(1);

        /*将附件存储起来 并将文件的相关信息存储一下*/
//        String realPath = request.getSession().getServletContext().getRealPath("/") + "upload/";
//        SysBusiAttachment attachment = dealAttachment(projFile, realPath, loginStaff.getStaffid() + "");//保存附件
//
//        applyBean.setAttachment(attachment);//绑定提交的附件对象
        applyBean.setLoginStaff(loginStaff);//绑定登录用户

        userService.projectApply(applyBean, projBase);
    }


    @Test
    public void test4() {
        System.out.println(PmsTools.getRandomString(pmsBaseDepartmentMapper.selectMaxKey()));
    }

}
