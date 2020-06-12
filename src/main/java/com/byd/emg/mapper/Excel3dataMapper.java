package com.byd.emg.mapper;

import org.apache.ibatis.annotations.Param;
import com.byd.emg.pojo.Excel3data;

import java.util.List;

public interface Excel3dataMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Excel3data record);

    int insertSelective(Excel3data record);

    Excel3data selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Excel3data record);

    int updateByPrimaryKey(Excel3data record);

    List<Excel3data> selectExcel3dataByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertExcel3dataList(@Param("excel3dataList") List<Excel3data> excel3dataList);

    void deleteByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertAfterSelect(@Param("excel3dataList") List<Excel3data> excel3dataList);
}