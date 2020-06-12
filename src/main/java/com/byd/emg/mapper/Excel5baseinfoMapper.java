package com.byd.emg.mapper;

import org.apache.ibatis.annotations.Param;
import com.byd.emg.pojo.Excel5baseinfo;

import java.util.List;

public interface Excel5baseinfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Excel5baseinfo record);

    int insertSelective(Excel5baseinfo record);

    Excel5baseinfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Excel5baseinfo record);

    int updateByPrimaryKey(Excel5baseinfo record);

    List<Excel5baseinfo> selectExcel5baseinfoByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertExcel5baseinfoList(@Param("excel5baseinfoList") List<Excel5baseinfo> excel5baseinfoList);

    void deleteByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertAfterSelect(@Param("excel5baseinfoList") List<Excel5baseinfo> excel5baseinfoList);
}