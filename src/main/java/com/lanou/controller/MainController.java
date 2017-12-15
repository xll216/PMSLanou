package com.lanou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 蓝鸥科技有限公司  www.lanou3g.com.
 */
@Controller
public class MainController {

    @RequestMapping(value = "/login")
    public String loginPage(){
        return "login";
    }
}
