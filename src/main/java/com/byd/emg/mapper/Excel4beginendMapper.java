package com.byd.emg.mapper;

import org.apache.ibatis.annotations.Param;
import com.byd.emg.pojo.Excel4beginend;

import java.util.List;

public interface Excel4beginendMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Excel4beginend record);

    int insertSelective(Excel4beginend record);

    Excel4beginend selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Excel4beginend record);

    int updateByPrimaryKey(Excel4beginend record);

    List<Excel4beginend> selectExcel4beginendByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertExcel4beginendList(@Param("excel4beginendList") List<Excel4beginend> excel4beginendList);

    void deleteByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertAfterSelect(@Param("excel4beginendList") List<Excel4beginend> excel4beginendList);
}