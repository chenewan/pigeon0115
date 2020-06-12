package com.byd.emg.mapper;

import org.apache.ibatis.annotations.Param;
import com.byd.emg.pojo.Excel13procedure;

import java.util.List;

public interface Excel13procedureMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Excel13procedure record);

    int insertSelective(Excel13procedure record);

    Excel13procedure selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Excel13procedure record);

    int updateByPrimaryKey(Excel13procedure record);

    List<Excel13procedure> selectExcel13procedureByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertExcel13procedureList(@Param("excel13procedureList") List<Excel13procedure> excel13procedureList);

    void deleteByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertAfterSelect(@Param("excel13procedureList") List<Excel13procedure> excel13procedureList);
}