package com.byd.emg.mapper;

import org.apache.ibatis.annotations.Param;
import com.byd.emg.pojo.Excel25data;

import java.util.List;

public interface Excel25dataMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Excel25data record);

    int insertSelective(Excel25data record);

    Excel25data selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Excel25data record);

    int updateByPrimaryKey(Excel25data record);

    List<Excel25data> selectExcel25dataByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertExcel25dataList(@Param("excel25dataList") List<Excel25data> excel25dataList);

    void deleteByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertAfterSelect(@Param("excel25dataList") List<Excel25data> excel25dataList);
}