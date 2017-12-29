package com.lanou.controller;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lanou.domain.PMSBaseStaff;
import com.lanou.domain.RdmsProjBase;
import com.lanou.domain.SysBusiAttachment;
import com.lanou.result.ProjectApplyBean;
import com.lanou.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

/**
 * Created by 蓝鸥科技有限公司  www.lanou3g.com.
 */
@Controller
@RequestMapping("/pro")
public class ProjectBaseController {
    @Resource
    private UserService userService;

    @RequestMapping("/ProjectApply")
    public String pagerProjectApply() {
        return "project_base/ProjectApply";
    }

    @RequestMapping("/ProjectBaseInfor")
    public String pagerProjectBaseInfor() {
        return "project_base/ProjectBaseInfor";
    }

    @RequestMapping("/ProjectOtherInfor")
    public String pagerProjectOtherInfor() {
        return "project_base/ProjectOtherInfor";
    }

    @RequestMapping(value = "/projectApplyCommit", produces = "application/json; charset=utf-8")
    @ResponseBody
    public String projectApply(@RequestParam("projFile") CommonsMultipartFile projFile, String baseData, String otherData, String other
            , HttpServletRequest request) throws IOException {

        /*拼接一下两段字符串*/
        String data = baseData.substring(0, (baseData.length() - 1)) + "," + otherData.substring(1, otherData.length());


        ObjectMapper mapper = new ObjectMapper();
        // 设置输入时忽略在JSON字符串中存在但Java对象实际没有的属性
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);

        /*格式化提交的数据对象*/
        ProjectApplyBean applyBean = mapper.readValue(data, ProjectApplyBean.class);

        RdmsProjBase projBase = mapper.readValue(data, RdmsProjBase.class);

        /*当前登录用户*/
        PMSBaseStaff loginStaff = userService.selectStaffByStaffID(1);

        /*将附件存储起来 并将文件的相关信息存储一下*/
        String realPath = request.getSession().getServletContext().getRealPath("/") + "upload/";
        SysBusiAttachment attachment = dealAttachment(projFile, realPath, loginStaff.getStaffid() + "");//保存附件

        applyBean.setLoginStaff(loginStaff);//绑定登录用户
        applyBean.setAttachment(attachment);//绑定提交的附件对象

        userService.projectApply(applyBean, projBase);

        return "success";
    }

    /**
     * 文件处理
     *
     * @param file 文件对象
     **/
    public SysBusiAttachment dealAttachment(CommonsMultipartFile file, String realPath, String uploadUser) {
        if (!file.isEmpty()) {
            try {
                // 文件保存路径
                File root = new File(realPath);
                if (!root.exists() || !root.isDirectory()) {
                    root.mkdirs();
                }
                String filePath = realPath + file.getOriginalFilename();
                // 转存文件
                file.transferTo(new File(filePath));

                SysBusiAttachment attachment = new SysBusiAttachment();
                attachment.setSysname("蓝鸥业务流程申请平台");
                attachment.setFilename(file.getOriginalFilename());//文件名称
                attachment.setFilesize(file.getSize() + "");//文件大小
                attachment.setUri(filePath);//路径
                attachment.setUploadtime(new Date());//上传时间
                attachment.setEffectFlag("true");//有效标识
                attachment.setUploaduser(uploadUser);//上传用户取当前登录的员工号

                return attachment;

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return null;
    }

}
