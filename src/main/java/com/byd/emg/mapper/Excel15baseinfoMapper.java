package com.byd.emg.mapper;

import org.apache.ibatis.annotations.Param;
import com.byd.emg.pojo.Excel15baseinfo;

import java.util.List;

public interface Excel15baseinfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Excel15baseinfo record);

    int insertSelective(Excel15baseinfo record);

    Excel15baseinfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Excel15baseinfo record);

    int updateByPrimaryKey(Excel15baseinfo record);

    List<Excel15baseinfo> selectExcel15baseinfoByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertExcel15baseinfoList(@Param("excel15baseinfoList") List<Excel15baseinfo> excel15baseinfoList);

    void deleteByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertAfterSelect(@Param("excel15baseinfoList") List<Excel15baseinfo> excel15baseinfoList);
}