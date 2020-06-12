package com.byd.emg.mapper;

import org.apache.ibatis.annotations.Param;
import com.byd.emg.pojo.Excel11baseinfo;

import java.util.List;

public interface Excel11baseinfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Excel11baseinfo record);

    int insertSelective(Excel11baseinfo record);

    Excel11baseinfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Excel11baseinfo record);

    int updateByPrimaryKey(Excel11baseinfo record);

    List<Excel11baseinfo> selectExcel11baseinfoByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertExcel11baseinfoList(@Param("excel11baseinfoList") List<Excel11baseinfo> excel11baseinfoList);

    void deleteByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertAfterSelect(@Param("excel11baseinfoList") List<Excel11baseinfo> excel11baseinfoList);
}