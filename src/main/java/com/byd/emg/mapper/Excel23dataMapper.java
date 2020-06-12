package com.byd.emg.mapper;

import org.apache.ibatis.annotations.Param;
import com.byd.emg.pojo.Excel23data;

import java.util.List;

public interface Excel23dataMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Excel23data record);

    int insertSelective(Excel23data record);

    Excel23data selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Excel23data record);

    int updateByPrimaryKey(Excel23data record);

    List<Excel23data> selectExcel23dataByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertExcel23dataList(@Param("excel23dataList") List<Excel23data> excel23dataList);

    void deleteByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertAfterSelect(@Param("excel23dataList") List<Excel23data> excel23dataList);
}