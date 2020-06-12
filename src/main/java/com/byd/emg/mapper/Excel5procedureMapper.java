package com.byd.emg.mapper;

import org.apache.ibatis.annotations.Param;
import com.byd.emg.pojo.Excel5procedure;

import java.util.List;

public interface Excel5procedureMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Excel5procedure record);

    int insertSelective(Excel5procedure record);

    Excel5procedure selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Excel5procedure record);

    int updateByPrimaryKey(Excel5procedure record);

    List<Excel5procedure> selectExcel5procedureByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertExcel5procedureList(@Param("excel5procedureList") List<Excel5procedure> excel5procedureList);

    void deleteByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertAfterSelect(@Param("excel5procedureList") List<Excel5procedure> excel5procedureList);
}