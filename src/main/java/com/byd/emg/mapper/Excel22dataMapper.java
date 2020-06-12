package com.byd.emg.mapper;

import org.apache.ibatis.annotations.Param;
import com.byd.emg.pojo.Excel22data;

import java.util.List;

public interface Excel22dataMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Excel22data record);

    int insertSelective(Excel22data record);

    Excel22data selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Excel22data record);

    int updateByPrimaryKey(Excel22data record);

    List<Excel22data> selectExcel22dataByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertExcel22dataList(@Param("excel22dataList") List<Excel22data> excel22dataList);

    void deleteByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertAfterSelect(@Param("excel22dataList") List<Excel22data> excel22dataList);
}