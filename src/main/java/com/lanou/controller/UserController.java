package com.lanou.controller;

import com.lanou.domain.PMSBaseDepartment;
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

    @RequestMapping("/upload")
    public String pagerFileUpload() {
        return "user/FileUpload";
    }

    /**************功能******************/

    @RequestMapping("/getDepartmentByCondition")
    @ResponseBody
    public List<PMSBaseDepartment> getAllDepartment(SearchBean searchBean) {
        List<PMSBaseDepartment> departments = userService.selectBySelecttive(searchBean);
        return departments;
    }

    @RequestMapping("/fileUpload")
    @ResponseBody
    public String fileUpload(@RequestParam("Fdata") CommonsMultipartFile Fdata, String a) {
        System.out.println(Fdata);
        return "success";
    }
}
