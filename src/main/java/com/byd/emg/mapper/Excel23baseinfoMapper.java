package com.byd.emg.mapper;

import org.apache.ibatis.annotations.Param;
import com.byd.emg.pojo.Excel23baseinfo;

import java.util.List;

public interface Excel23baseinfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Excel23baseinfo record);

    int insertSelective(Excel23baseinfo record);

    Excel23baseinfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Excel23baseinfo record);

    int updateByPrimaryKey(Excel23baseinfo record);

    List<Excel23baseinfo> selectExcel23baseinfoByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertExcel23baseinfoList(@Param("excel23baseinfoList") List<Excel23baseinfo> excel23baseinfoList);

    void deleteByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertAfterSelect(@Param("excel23baseinfoList") List<Excel23baseinfo> excel23baseinfoList);
}