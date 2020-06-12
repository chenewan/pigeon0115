package com.byd.emg.mapper;

import org.apache.ibatis.annotations.Param;
import com.byd.emg.pojo.Excel16beginend;

import java.util.List;

public interface Excel16beginendMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Excel16beginend record);

    int insertSelective(Excel16beginend record);

    Excel16beginend selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Excel16beginend record);

    int updateByPrimaryKey(Excel16beginend record);

    List<Excel16beginend> selectExcel16beginendByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertExcel16beginendList(@Param("excel16beginendList") List<Excel16beginend> excel16beginendList);

    void deleteByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertAfterSelect(@Param("excel16beginendList") List<Excel16beginend> excel16beginendList);
}