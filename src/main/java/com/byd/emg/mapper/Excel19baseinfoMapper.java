package com.byd.emg.mapper;

import org.apache.ibatis.annotations.Param;
import com.byd.emg.pojo.Excel19baseinfo;

import java.util.List;

public interface Excel19baseinfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Excel19baseinfo record);

    int insertSelective(Excel19baseinfo record);

    Excel19baseinfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Excel19baseinfo record);

    int updateByPrimaryKey(Excel19baseinfo record);

    List<Excel19baseinfo> selectExcel19baseinfoByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertExcel19baseinfoList(@Param("excel19baseinfoList") List<Excel19baseinfo> excel19baseinfoList);

    void deleteByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertAfterSelect(@Param("excel19baseinfoList") List<Excel19baseinfo> excel19baseinfoList);
}