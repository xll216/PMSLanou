package com.lanou.controller;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lanou.domain.RdmsProjBase;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

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
    public String projectApply(String baseData, String otherData) throws IOException {
        /*拼接一下两段字符串*/
        String data = baseData.substring(0, (baseData.length() - 1)) + "," + otherData.substring(1, otherData.length());

        ObjectMapper mapper = new ObjectMapper();
        // 设置输入时忽略在JSON字符串中存在但Java对象实际没有的属性
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);

        RdmsProjBase projBase = mapper.readValue(data, RdmsProjBase.class);
        System.out.println(projBase);


        return "成果";
    }

}
