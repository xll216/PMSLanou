package com.lanou.controller;

import com.lanou.domain.PMSBaseDepartment;
import com.lanou.domain.PMSBaseStaff;
import com.lanou.service.UserService;
import com.lanou.util.SearchBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 蓝鸥科技有限公司  www.lanou3g.com.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;


    /**************页面*****************/

    @RequestMapping("/PersonCenter")
    public String pagerPersonCenter() {
        return "user/PersonCenter";
    }

    @RequestMapping("/TaskWaiting")
    public String pagerTaskWaiting() {
        return "user/TaskWaiting";
    }

    @RequestMapping("/TaskFinish")
    public String pagerTaskFinish() {
        return "user/TaskFinish";
    }

    @RequestMapping("/SelectDepartmentWindow")
    public String pagerSelectDepartmentWindow() {
        return "user/SelectDepartmentWindow";
    }

    @RequestMapping("/SelectStaffWindow")
    public String pagerSelectStaffWindow() {
        return "user/SelectStaffWindow";
    }

    @RequestMapping("/upload")
    public String pagerFileUpload() {
        return "user/FileUpload";
    }

    /**************功能******************/

    /**
     * 根据条件查询部门
     *
     * @param searchBean 条件对象
     **/
    @RequestMapping("/getDepartmentByCondition")
    @ResponseBody
    public List<PMSBaseDepartment> getAllDepartment(SearchBean searchBean) {
        List<PMSBaseDepartment> departments = userService.getDepartmentByCondition(searchBean);
        return departments;
    }

    /**
     * 根据条件查询员工
     *
     * @param searchBean 条件对象
     **/
    @RequestMapping("/getStaffByCondition")
    @ResponseBody
    public List<PMSBaseStaff> getStaffByCondition(SearchBean searchBean) {
        List<PMSBaseStaff> staffs = userService.getStaffByCondition(searchBean);
        return staffs;
    }

    @RequestMapping("/fileUpload")
    @ResponseBody
    public String fileUpload(@RequestParam("Fdata") CommonsMultipartFile Fdata, String a) {
        System.out.println(Fdata);
        return "success";
    }
}
