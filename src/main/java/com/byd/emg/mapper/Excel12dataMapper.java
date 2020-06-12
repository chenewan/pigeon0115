package com.byd.emg.mapper;

import org.apache.ibatis.annotations.Param;
import com.byd.emg.pojo.Excel12data;

import java.util.List;

public interface Excel12dataMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Excel12data record);

    int insertSelective(Excel12data record);

    Excel12data selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Excel12data record);

    int updateByPrimaryKey(Excel12data record);

    List<Excel12data> selectExcel12dataByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertExcel12dataList(@Param("excel12dataList") List<Excel12data> excel12dataList);

    void deleteByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertAfterSelect(@Param("excel12dataList") List<Excel12data> excel12dataList);
}