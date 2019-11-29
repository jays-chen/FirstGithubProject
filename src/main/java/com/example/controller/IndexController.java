package com.example.controller;

import com.example.service.userTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
*此类用于访问页面用
* */
@Controller
public class IndexController {

    @Autowired
    private userTableService userTableService;

    @RequestMapping("/index")
    public String index() {
        return "webSecketTestHtml";
    }
    @RequestMapping("/index1")
    public String index1() {
        return "webSecketTestHtml1";
    }

}