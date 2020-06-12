package com.byd.emg.mapper;

import org.apache.ibatis.annotations.Param;
import com.byd.emg.pojo.Excel21baseinfo;

import java.util.List;

public interface Excel21baseinfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Excel21baseinfo record);

    int insertSelective(Excel21baseinfo record);

    Excel21baseinfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Excel21baseinfo record);

    int updateByPrimaryKey(Excel21baseinfo record);

    List<Excel21baseinfo> selectExcel21baseinfoByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertExcel21baseinfoList(@Param("excel21baseinfoList") List<Excel21baseinfo> excel21baseinfoList);

    void deleteByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertAfterSelect(@Param("excel21baseinfoList") List<Excel21baseinfo> excel21baseinfoList);
}