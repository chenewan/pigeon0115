package com.byd.emg.mapper;

import org.apache.ibatis.annotations.Param;
import com.byd.emg.pojo.Excel24baseinfo;

import java.util.List;

public interface Excel24baseinfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Excel24baseinfo record);

    int insertSelective(Excel24baseinfo record);

    Excel24baseinfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Excel24baseinfo record);

    int updateByPrimaryKey(Excel24baseinfo record);

    List<Excel24baseinfo> selectExcel24baseinfoByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertExcel24baseinfoList(@Param("excel24baseinfoList") List<Excel24baseinfo> excel24baseinfoList);

    void deleteByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertAfterSelect(@Param("excel24baseinfoList") List<Excel24baseinfo> excel24baseinfoList);
}