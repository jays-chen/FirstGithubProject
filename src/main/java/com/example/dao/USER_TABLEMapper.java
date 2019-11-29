package com.example.dao;

import com.example.bean.USER_TABLE;
import java.util.List;

public interface USER_TABLEMapper {
    int deleteByPrimaryKey(String id);

    int insert(USER_TABLE record);

    USER_TABLE selectByPrimaryKey(String id);

    List<USER_TABLE> selectAll();

    int updateByPrimaryKey(USER_TABLE record);
}