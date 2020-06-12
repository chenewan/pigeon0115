package com.byd.emg.mapper;

import com.byd.emg.pojo.Excel3baseinfo;

import org.apache.ibatis.annotations.Param;
import java.util.List;

public interface Excel3baseinfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Excel3baseinfo record);

    int insertSelective(Excel3baseinfo record);

    Excel3baseinfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Excel3baseinfo record);

    int updateByPrimaryKey(Excel3baseinfo record);

    List<Excel3baseinfo> selectExcel3baseinfoByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertExcel3baseinfoList(@Param("excel3baseinfoList") List<Excel3baseinfo> excel3baseinfoList);

    void deleteByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertAfterSelect(@Param("excel3baseinfoList") List<Excel3baseinfo> excel3baseinfoList);
}