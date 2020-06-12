package com.byd.emg.mapper;

import org.apache.ibatis.annotations.Param;
import com.byd.emg.pojo.Excel22baseinfo;

import java.util.List;

public interface Excel22baseinfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Excel22baseinfo record);

    int insertSelective(Excel22baseinfo record);

    Excel22baseinfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Excel22baseinfo record);

    int updateByPrimaryKey(Excel22baseinfo record);

    List<Excel22baseinfo> selectExcel22baseinfoByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertExcel22baseinfoList(@Param("excel22baseinfoList") List<Excel22baseinfo> excel22baseinfoList);

    void deleteByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertAfterSelect(@Param("excel22baseinfoList") List<Excel22baseinfo> excel22baseinfoList);
}