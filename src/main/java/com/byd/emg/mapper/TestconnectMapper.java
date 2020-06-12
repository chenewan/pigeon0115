package com.byd.emg.mapper;

import com.byd.emg.pojo.Testconnect;

public interface TestconnectMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Testconnect record);

    int insertSelective(Testconnect record);

    Testconnect selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Testconnect record);

    int updateByPrimaryKey(Testconnect record);
}