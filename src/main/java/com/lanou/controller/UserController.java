package com.lanou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 蓝鸥科技有限公司  www.lanou3g.com.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/PersonCenter")
    public String pagerPersonCenter() {
        return "user/PersonCenter";
    }

    @RequestMapping("/TaskWaiting")
    public String pagerTaskWaiting(){
        return "user/TaskWaiting";
    }

    @RequestMapping("/TaskFinish")
    public String pagerTaskFinish(){
        return "user/TaskFinish";
    }
}
