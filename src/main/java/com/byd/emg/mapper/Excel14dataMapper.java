package com.byd.emg.mapper;

import org.apache.ibatis.annotations.Param;
import com.byd.emg.pojo.Excel14data;

import java.util.List;

public interface Excel14dataMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Excel14data record);

    int insertSelective(Excel14data record);

    Excel14data selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Excel14data record);

    int updateByPrimaryKey(Excel14data record);

    List<Excel14data> selectExcel14dataByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertExcel14dataList(@Param("excel14dataList") List<Excel14data> excel14dataList);

    void deleteByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertAfterSelect(@Param("excel14dataList") List<Excel14data> excel14dataList);
}