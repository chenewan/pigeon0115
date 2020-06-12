package com.byd.emg.mapper;

import org.apache.ibatis.annotations.Param;
import com.byd.emg.pojo.Excel11data;

import java.util.List;

public interface Excel11dataMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Excel11data record);

    int insertSelective(Excel11data record);

    Excel11data selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Excel11data record);

    int updateByPrimaryKey(Excel11data record);

    List<Excel11data> selectExcel11dataByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertExcel11dataList(@Param("excel11dataList")List<Excel11data> excel11dataList);

    void deleteByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertAfterSelect(@Param("excel11dataList")List<Excel11data> excel11dataList);
}