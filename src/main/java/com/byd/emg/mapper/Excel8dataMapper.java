package com.byd.emg.mapper;

import org.apache.ibatis.annotations.Param;
import com.byd.emg.pojo.Excel8data;

import java.util.List;

public interface Excel8dataMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Excel8data record);

    int insertSelective(Excel8data record);

    Excel8data selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Excel8data record);

    int updateByPrimaryKey(Excel8data record);

    List<Excel8data> selectExcel8dataByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertExcel8dataList(@Param("excel8dataList") List<Excel8data> excel8dataList);

    void deleteByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertAfterSelect(@Param("excel8dataList") List<Excel8data> excel8dataList);
}