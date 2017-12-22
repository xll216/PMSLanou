package com.lanou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 蓝鸥科技有限公司  www.lanou3g.com.
 */
@Controller
@RequestMapping("/pro")
public class ProjectBaseController {

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

    @RequestMapping(value = "/projectApplyCommit", produces = "text/html; charset=utf-8")
    @ResponseBody
    public String projectApply(String baseData, String otherData) {
        System.out.println(baseData);
        System.out.println(otherData);

        return "成果";
    }

}
