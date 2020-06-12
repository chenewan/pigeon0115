package com.byd.emg.mapper;

import org.apache.ibatis.annotations.Param;
import com.byd.emg.pojo.Excel7baseinfo;

import java.util.List;

public interface Excel7baseinfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Excel7baseinfo record);

    int insertSelective(Excel7baseinfo record);

    Excel7baseinfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Excel7baseinfo record);

    int updateByPrimaryKey(Excel7baseinfo record);

    List<Excel7baseinfo> selectExcel7baseinfoByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertExcel7baseinfoList(@Param("excel7baseinfoList") List<Excel7baseinfo> excel7baseinfoList);

    void deleteByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertAfterSelect(@Param("excel7baseinfoList")List<Excel7baseinfo> excel7baseinfoList);
}