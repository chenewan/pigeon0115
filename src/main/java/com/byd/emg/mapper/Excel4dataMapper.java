package com.byd.emg.mapper;

import com.byd.emg.pojo.Excel4data;

import java.util.List;

import org.apache.ibatis.annotations.Param;
public interface Excel4dataMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Excel4data record);

    int insertSelective(Excel4data record);

    Excel4data selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Excel4data record);

    int updateByPrimaryKey(Excel4data record);

    List<Excel4data> selectExcel4dataByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertExcel4dataList(@Param("excel4dataList") List<Excel4data> excel4dataList);

    void deleteByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertAfterSelect(@Param("excel4dataList") List<Excel4data> excel4dataList);
}