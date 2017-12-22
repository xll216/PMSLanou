package com.lanou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 蓝鸥科技有限公司  www.lanou3g.com.
 */
@Controller
@RequestMapping("/system")
public class SystemController {

    @RequestMapping("/AdvancedQuery")
    public String pagerAdvancedQuery() {
        return "system/AdvancedQuery";
    }

    @RequestMapping("/ProcessQuery")
    public String pagerProcessQuery(){
        return "system/ProcessQuery";
    }
}
