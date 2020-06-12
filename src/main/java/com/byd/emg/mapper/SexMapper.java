package com.byd.emg.mapper;

import com.byd.emg.pojo.Sex;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SexMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Sex record);

    int insertSelective(Sex record);

    Sex selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(Sex record);

    int updateByPrimaryKey(Sex record);
}