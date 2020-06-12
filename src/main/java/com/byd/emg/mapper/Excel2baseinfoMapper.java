package com.byd.emg.mapper;

import com.byd.emg.pojo.Excel2baseinfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Excel2baseinfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Excel2baseinfo record);

    int insertSelective(Excel2baseinfo record);

    Excel2baseinfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Excel2baseinfo record);

    int updateByPrimaryKey(Excel2baseinfo record);

    List<Excel2baseinfo> selectExcel2baseinfoByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertExcel2baseinfoList(@Param("excel2baseinfoList") List<Excel2baseinfo> excel2baseinfoList);

    void deleteByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertAfterSelect(@Param("excel2baseinfoList")List<Excel2baseinfo> excel2baseinfoList);
}