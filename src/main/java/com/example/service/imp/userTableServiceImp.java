package com.example.service.imp;

import com.example.bean.TEST_TABLE;
import com.example.dao.TEST_TABLEMapper;
import com.example.service.userTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userTableServiceImp implements userTableService {
    @Autowired
    private TEST_TABLEMapper tt;

    public List<TEST_TABLE> getData()
    {

        return tt.selectAll();
    };

}/*@Override
    public List<userTable> findAllUser() {

    }*/
