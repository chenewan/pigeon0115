package com.byd.emg.mapper;

import org.apache.ibatis.annotations.Param;
import com.byd.emg.pojo.Excel14baseinfo;

import java.util.List;

public interface Excel14baseinfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Excel14baseinfo record);

    int insertSelective(Excel14baseinfo record);

    Excel14baseinfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Excel14baseinfo record);

    int updateByPrimaryKey(Excel14baseinfo record);

    List<Excel14baseinfo> selectExcel14baseinfoByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertExcel14baseinfoList(@Param("excel14baseinfoList") List<Excel14baseinfo> excel14baseinfoList);

    void deleteByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertAfterSelect(@Param("excel14baseinfoList") List<Excel14baseinfo> excel14baseinfoList);
}