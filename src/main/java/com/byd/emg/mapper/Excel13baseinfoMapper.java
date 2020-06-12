package com.byd.emg.mapper;

import org.apache.ibatis.annotations.Param;
import com.byd.emg.pojo.Excel13baseinfo;

import java.util.List;

public interface Excel13baseinfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Excel13baseinfo record);

    int insertSelective(Excel13baseinfo record);

    Excel13baseinfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Excel13baseinfo record);

    int updateByPrimaryKey(Excel13baseinfo record);

    List<Excel13baseinfo> selectExcel13baseinfoByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertExcel13baseinfoList(@Param("excel13baseinfoList") List<Excel13baseinfo> excel13baseinfoList);

    void deleteByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertAfterSelect(@Param("excel13baseinfoList") List<Excel13baseinfo> excel13baseinfoList);
}