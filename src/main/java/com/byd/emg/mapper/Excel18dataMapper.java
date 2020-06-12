package com.byd.emg.mapper;

import org.apache.ibatis.annotations.Param;
import com.byd.emg.pojo.Excel18data;

import java.util.List;

public interface Excel18dataMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Excel18data record);

    int insertSelective(Excel18data record);

    Excel18data selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Excel18data record);

    int updateByPrimaryKey(Excel18data record);

    List<Excel18data> selectExcel18dataByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertExcel18dataList(@Param("excel18dataList") List<Excel18data> excel18dataList);

    void deleteByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertAfterSelect(@Param("excel18dataList") List<Excel18data> excel18dataList);
}