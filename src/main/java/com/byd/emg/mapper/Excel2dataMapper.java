package com.byd.emg.mapper;

import com.byd.emg.pojo.Excel2data;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Excel2dataMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Excel2data record);

    int insertSelective(Excel2data record);

    Excel2data selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Excel2data record);

    int updateByPrimaryKey(Excel2data record);

    List<Excel2data> selectExcel2dataByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertExcel2dataList(@Param("excel2dataList") List<Excel2data> excel2dataList);

    void deleteByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertAfterSelect(@Param("excel2dataList") List<Excel2data> excel2dataList);
}