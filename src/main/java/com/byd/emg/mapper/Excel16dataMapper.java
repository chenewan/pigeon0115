package com.byd.emg.mapper;

import org.apache.ibatis.annotations.Param;
import com.byd.emg.pojo.Excel16data;

import java.util.List;

public interface Excel16dataMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Excel16data record);

    int insertSelective(Excel16data record);

    Excel16data selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Excel16data record);

    int updateByPrimaryKey(Excel16data record);

    List<Excel16data> selectExcel16dataByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertExcel16dataList(@Param("excel16dataList") List<Excel16data> excel16dataList);

    void deleteByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertAfterSelect(@Param("excel16dataList") List<Excel16data> excel16dataList);
}