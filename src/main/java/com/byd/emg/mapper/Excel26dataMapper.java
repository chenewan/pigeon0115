package com.byd.emg.mapper;

import org.apache.ibatis.annotations.Param;
import com.byd.emg.pojo.Excel26data;

import java.util.List;

public interface Excel26dataMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Excel26data record);

    int insertSelective(Excel26data record);

    Excel26data selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Excel26data record);

    int updateByPrimaryKey(Excel26data record);

    List<Excel26data> selectExcel26dataByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertExcel26dataList(@Param("excel26dataList") List<Excel26data> excel26dataList);

    void deleteByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertAfterSelect(@Param("excel26dataList") List<Excel26data> excel26dataList);
}