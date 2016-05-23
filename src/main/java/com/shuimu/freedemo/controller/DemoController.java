package com.shuimu.freedemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController{

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "YZ!";
    }

    @RequestMapping("/tt")
    @ResponseBody
    String homett() {
        return "YZ tt!";
    }

}
