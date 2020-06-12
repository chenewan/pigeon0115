package com.byd.emg.mapper;

import org.apache.ibatis.annotations.Param;
import com.byd.emg.pojo.Excel4baseinfo;

import java.util.List;

public interface Excel4baseinfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Excel4baseinfo record);

    int insertSelective(Excel4baseinfo record);

    Excel4baseinfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Excel4baseinfo record);

    int updateByPrimaryKey(Excel4baseinfo record);

    List<Excel4baseinfo> selectExcel4baseinfoByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertExcel4baseinfoList(@Param("excel4baseinfoList") List<Excel4baseinfo> excel4baseinfoList);

    void deleteByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertAfterSelect(@Param("excel4baseinfoList") List<Excel4baseinfo> excel4baseinfoList);
}