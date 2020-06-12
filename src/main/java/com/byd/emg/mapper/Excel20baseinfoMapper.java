package com.byd.emg.mapper;

import org.apache.ibatis.annotations.Param;
import com.byd.emg.pojo.Excel20baseinfo;

import java.util.List;

public interface Excel20baseinfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Excel20baseinfo record);

    int insertSelective(Excel20baseinfo record);

    Excel20baseinfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Excel20baseinfo record);

    int updateByPrimaryKey(Excel20baseinfo record);

    List<Excel20baseinfo> selectExcel20baseinfoByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertExcel20baseinfoList(@Param("excel20baseinfoList") List<Excel20baseinfo> excel20baseinfoList);

    void deleteByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertAfterSelect(@Param("excel20baseinfoList") List<Excel20baseinfo> excel20baseinfoList);
}