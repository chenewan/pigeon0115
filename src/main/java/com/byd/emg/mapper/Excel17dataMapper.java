package com.byd.emg.mapper;

import org.apache.ibatis.annotations.Param;
import com.byd.emg.pojo.Excel17data;

import java.util.List;

public interface Excel17dataMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Excel17data record);

    int insertSelective(Excel17data record);

    Excel17data selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Excel17data record);

    int updateByPrimaryKey(Excel17data record);

    List<Excel17data> selectExcel17dataByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertExcel17dataList(@Param("excel17dataList") List<Excel17data> excel17dataList);

    void deleteByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertAfterSelect(@Param("excel17dataList") List<Excel17data> excel17dataList);
}