package com.byd.emg.mapper;

import org.apache.ibatis.annotations.Param;
import com.byd.emg.pojo.Excel12baseinfo;

import java.util.List;

public interface Excel12baseinfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Excel12baseinfo record);

    int insertSelective(Excel12baseinfo record);

    Excel12baseinfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Excel12baseinfo record);

    int updateByPrimaryKey(Excel12baseinfo record);

    List<Excel12baseinfo> selectExcel12baseinfoByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertExcel12baseinfoList(@Param("excel12baseinfoList") List<Excel12baseinfo> excel12baseinfoList);

    void deleteByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertAfterSelect(@Param("excel12baseinfoList") List<Excel12baseinfo> excel12baseinfoList);
}