package com.byd.emg.mapper;

import org.apache.ibatis.annotations.Param;
import com.byd.emg.pojo.Excel20data;

import java.util.List;

public interface Excel20dataMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Excel20data record);

    int insertSelective(Excel20data record);

    Excel20data selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Excel20data record);

    int updateByPrimaryKey(Excel20data record);

    List<Excel20data> selectExcel20dataByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertExcel20dataList(@Param("excel20dataList") List<Excel20data> excel20dataList);

    void deleteByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertAfterSelect(@Param("excel20dataList") List<Excel20data> excel20dataList);
}