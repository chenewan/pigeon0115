package com.byd.emg.mapper;

import org.apache.ibatis.annotations.Param;
import com.byd.emg.pojo.Excel11select;

import java.util.List;

public interface Excel11selectMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Excel11select record);

    int insertSelective(Excel11select record);

    Excel11select selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Excel11select record);

    int updateByPrimaryKey(Excel11select record);

    List<Excel11select> selectExcel11selectByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertExcel11selectList(@Param("excel11selectList") List<Excel11select> excel11selectList);

    void deleteByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertAfterSelect(@Param("excel11selectList") List<Excel11select> excel11selectList);
}