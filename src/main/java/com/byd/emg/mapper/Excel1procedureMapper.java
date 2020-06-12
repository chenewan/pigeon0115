package com.byd.emg.mapper;

import com.byd.emg.pojo.Excel1procedure;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Excel1procedureMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Excel1procedure record);

    int insertSelective(Excel1procedure record);

    Excel1procedure selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Excel1procedure record);

    int updateByPrimaryKey(Excel1procedure record);

    List<Excel1procedure> selectExcel1procedureByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertExcel1procedureList(@Param("excel1procedureList") List<Excel1procedure> excel1procedureList);

    void deleteByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertAfterSelect(@Param("excel1procedureList")List<Excel1procedure> excel1procedureList);
}