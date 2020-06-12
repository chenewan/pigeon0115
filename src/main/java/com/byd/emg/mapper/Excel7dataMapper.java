package com.byd.emg.mapper;

import org.apache.ibatis.annotations.Param;
import com.byd.emg.pojo.Excel7data;

import java.util.List;

public interface Excel7dataMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Excel7data record);

    int insertSelective(Excel7data record);

    Excel7data selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Excel7data record);

    int updateByPrimaryKey(Excel7data record);

    List<Excel7data> selectExcel7dataByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertExcel7dataList(@Param("excel7dataList") List<Excel7data> excel7dataList);

    void deleteByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertAfterSelect(@Param("excel7dataList") List<Excel7data> excel7dataList);
}