package com.byd.emg.mapper;

import org.apache.ibatis.annotations.Param;
import com.byd.emg.pojo.Excel9baseinfo;

import java.util.List;

public interface Excel9baseinfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Excel9baseinfo record);

    int insertSelective(Excel9baseinfo record);

    Excel9baseinfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Excel9baseinfo record);

    int updateByPrimaryKey(Excel9baseinfo record);

    List<Excel9baseinfo> selectExcel9baseinfoByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertExcel9baseinfoList(@Param("excel9baseinfoList") List<Excel9baseinfo> excel9baseinfoList);

    void deleteByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertAfterSelect(@Param("excel9baseinfoList") List<Excel9baseinfo> excel9baseinfoList);
}