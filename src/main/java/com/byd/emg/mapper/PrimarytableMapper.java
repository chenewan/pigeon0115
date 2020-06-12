package com.byd.emg.mapper;

import com.byd.emg.pojo.Primarytable;

public interface PrimarytableMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Primarytable record);

    int insertSelective(Primarytable record);

    Primarytable selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Primarytable record);

    int updateByPrimaryKey(Primarytable record);

    int selectTop1TableNo();
}