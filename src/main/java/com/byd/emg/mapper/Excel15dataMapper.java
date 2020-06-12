package com.byd.emg.mapper;

import org.apache.ibatis.annotations.Param;
import com.byd.emg.pojo.Excel15data;

import java.util.List;

public interface Excel15dataMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Excel15data record);

    int insertSelective(Excel15data record);

    Excel15data selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Excel15data record);

    int updateByPrimaryKey(Excel15data record);

    List<Excel15data> selectExcel15dataByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertExcel15dataList(@Param("excel15dataList") List<Excel15data> excel15dataList);

    void deleteByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertAfterSelect(@Param("excel15dataList") List<Excel15data> excel15dataList);
}