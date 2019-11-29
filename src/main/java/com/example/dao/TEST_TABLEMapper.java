package com.example.dao;

import com.example.bean.TEST_TABLE;
import java.util.List;

public interface TEST_TABLEMapper {
    int deleteByPrimaryKey(String rwid);

    int insert(TEST_TABLE record);

    TEST_TABLE selectByPrimaryKey(String rwid);

    List<TEST_TABLE> selectAll();

    int updateByPrimaryKey(TEST_TABLE record);
}