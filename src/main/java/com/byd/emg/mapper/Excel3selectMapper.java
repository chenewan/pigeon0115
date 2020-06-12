package com.byd.emg.mapper;

import org.apache.ibatis.annotations.Param;
import com.byd.emg.pojo.Excel3select;

import java.util.List;

public interface Excel3selectMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Excel3select record);

    int insertSelective(Excel3select record);

    Excel3select selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Excel3select record);

    int updateByPrimaryKey(Excel3select record);

    List<Excel3select> selectExcel3selectByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertExcel3selectList(@Param("excel3selectList") List<Excel3select> excel3selectList);

    void deleteByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertAfterSelect(@Param("excel3selectList") List<Excel3select> excel3selectList);
}