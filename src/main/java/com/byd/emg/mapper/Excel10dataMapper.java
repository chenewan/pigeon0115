package com.byd.emg.mapper;

import org.apache.ibatis.annotations.Param;
import com.byd.emg.pojo.Excel10data;

import java.util.List;

public interface Excel10dataMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Excel10data record);

    int insertSelective(Excel10data record);

    Excel10data selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Excel10data record);

    int updateByPrimaryKey(Excel10data record);

    List<Excel10data> selectExcel10dataByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertExcel10dataList(@Param("excel10dataList") List<Excel10data> excel10dataList);

    void deleteByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertAfterSelect(@Param("excel10dataList") List<Excel10data> excel10dataList);
}