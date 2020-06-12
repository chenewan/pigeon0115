package com.byd.emg.mapper;

import org.apache.ibatis.annotations.Param;
import com.byd.emg.pojo.Excel19data;

import java.util.List;

public interface Excel19dataMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Excel19data record);

    int insertSelective(Excel19data record);

    Excel19data selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Excel19data record);

    int updateByPrimaryKey(Excel19data record);

    List<Excel19data> selectExcel19dataByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertExcel19dataList(@Param("excel19dataList") List<Excel19data> excel19dataList);

    void deleteByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertAfterSelect(@Param("excel19dataList") List<Excel19data> excel19dataList);
}