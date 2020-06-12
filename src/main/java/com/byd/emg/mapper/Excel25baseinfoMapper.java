package com.byd.emg.mapper;

import org.apache.ibatis.annotations.Param;
import com.byd.emg.pojo.Excel25baseinfo;

import java.util.List;

public interface Excel25baseinfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Excel25baseinfo record);

    int insertSelective(Excel25baseinfo record);

    Excel25baseinfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Excel25baseinfo record);

    int updateByPrimaryKey(Excel25baseinfo record);

    List<Excel25baseinfo> selectExcel25baseinfoByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertExcel25baseinfoList(@Param("excel25baseinfoList") List<Excel25baseinfo> excel25baseinfoList);

    void deleteByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertAfterSelect(@Param("excel25baseinfoList") List<Excel25baseinfo> excel25baseinfoList);
}