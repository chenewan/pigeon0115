package com.byd.emg.mapper;

import org.apache.ibatis.annotations.Param;
import com.byd.emg.pojo.Excel17baseinfo;

import java.util.List;

public interface Excel17baseinfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Excel17baseinfo record);

    int insertSelective(Excel17baseinfo record);

    Excel17baseinfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Excel17baseinfo record);

    int updateByPrimaryKey(Excel17baseinfo record);

    List<Excel17baseinfo> selectExcel17baseinfoByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertExcel17baseinfoList(@Param("excel17baseinfoList") List<Excel17baseinfo> excel17baseinfoList);

    void deleteByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertAfterSelect(@Param("excel17baseinfoList") List<Excel17baseinfo> excel17baseinfoList);
}