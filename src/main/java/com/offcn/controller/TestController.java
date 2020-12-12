package com.offcn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class TestController {

    @GetMapping("/setSession")
    public String setSession(HttpSession session){
        session.setAttribute("msg","demo1");
        return "设置session结束";
    }

    @GetMapping("/getSession")
    public String getSession(HttpSession session){
        String msg = (String) session.getAttribute("msg");
        return msg;
    }
}
