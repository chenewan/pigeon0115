package com.byd.emg.mapper;

import org.apache.ibatis.annotations.Param;
import com.byd.emg.pojo.Excel9procedure;

import java.util.List;

public interface Excel9procedureMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Excel9procedure record);

    int insertSelective(Excel9procedure record);

    Excel9procedure selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Excel9procedure record);

    int updateByPrimaryKey(Excel9procedure record);

    List<Excel9procedure> selectExcel9procedureByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertExcel9procedureList(@Param("excel9procedureList") List<Excel9procedure> excel9procedureList);

    void deleteByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertAfterSelect(@Param("excel9procedureList") List<Excel9procedure> excel9procedureList);
}