package com.byd.emg.mapper;

import org.apache.ibatis.annotations.Param;
import com.byd.emg.pojo.Excel24data;

import java.util.List;

public interface Excel24dataMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Excel24data record);

    int insertSelective(Excel24data record);

    Excel24data selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Excel24data record);

    int updateByPrimaryKey(Excel24data record);

    List<Excel24data> selectExcel24dataByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertExcel24dataList(@Param("excel24dataList") List<Excel24data> excel24dataList);

    void deleteByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertAfterSelect(@Param("excel24dataList") List<Excel24data> excel24dataList);
}