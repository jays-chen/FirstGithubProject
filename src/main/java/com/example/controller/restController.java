package com.example.controller;

import com.example.bean.TEST_TABLE;
import com.example.service.userTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*
* 此类用于返回数据用
* */
@RestController
public class restController {

    @Autowired
    private userTableService userTableService;

    @RequestMapping("/getData")
    public List<TEST_TABLE> getData()
    {
        List<TEST_TABLE> utList =  userTableService.getData();
        return utList;
    }

}