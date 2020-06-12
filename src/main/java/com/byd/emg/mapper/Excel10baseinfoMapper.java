package com.byd.emg.mapper;

import org.apache.ibatis.annotations.Param;
import com.byd.emg.pojo.Excel10baseinfo;

import java.util.List;

public interface Excel10baseinfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Excel10baseinfo record);

    int insertSelective(Excel10baseinfo record);

    Excel10baseinfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Excel10baseinfo record);

    int updateByPrimaryKey(Excel10baseinfo record);

    List<Excel10baseinfo> selectExcel10baseinfoByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertExcel10baseinfoList(@Param("excel10baseinfoList") List<Excel10baseinfo> excel10baseinfoList);

    void deleteByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertAfterSelect(@Param("excel10baseinfoList") List<Excel10baseinfo> excel10baseinfoList);
}