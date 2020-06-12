package com.byd.emg.mapper;

import org.apache.ibatis.annotations.Param;
import com.byd.emg.pojo.Excel12beginend;

import java.util.List;

public interface Excel12beginendMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Excel12beginend record);

    int insertSelective(Excel12beginend record);

    Excel12beginend selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Excel12beginend record);

    int updateByPrimaryKey(Excel12beginend record);

    List<Excel12beginend> selectExcel12beginendByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertExcel12beginendList(@Param("excel12beginendList") List<Excel12beginend> excel12beginendList);

    void deleteByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertAfterSelect(@Param("excel12beginendList") List<Excel12beginend> excel12beginendList);
}