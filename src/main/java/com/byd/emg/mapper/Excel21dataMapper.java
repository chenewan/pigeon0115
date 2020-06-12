package com.byd.emg.mapper;

import org.apache.ibatis.annotations.Param;
import com.byd.emg.pojo.Excel21data;

import java.util.List;

public interface Excel21dataMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Excel21data record);

    int insertSelective(Excel21data record);

    Excel21data selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Excel21data record);

    int updateByPrimaryKey(Excel21data record);

    List<Excel21data> selectExcel21dataByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertExcel21dataList(@Param("excel21dataList") List<Excel21data> excel21dataList);

    void deleteByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertAfterSelect(@Param("excel21dataList") List<Excel21data> excel21dataList);
}