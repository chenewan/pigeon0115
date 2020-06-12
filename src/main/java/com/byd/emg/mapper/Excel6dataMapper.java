package com.byd.emg.mapper;

import org.apache.ibatis.annotations.Param;
import com.byd.emg.pojo.Excel6data;

import java.util.List;

public interface Excel6dataMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Excel6data record);

    int insertSelective(Excel6data record);

    Excel6data selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Excel6data record);

    int updateByPrimaryKey(Excel6data record);

    List<Excel6data> selectExcel6dataByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertExcel6dataList(@Param("excel6dataList") List<Excel6data> excel6dataList);

    void deleteByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertAfterSelect(@Param("excel6dataList") List<Excel6data> excel6dataList);
}