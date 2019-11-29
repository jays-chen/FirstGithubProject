package com.example.service;

import com.example.bean.TEST_TABLE;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface userTableService {


    public List<TEST_TABLE> getData();


}
