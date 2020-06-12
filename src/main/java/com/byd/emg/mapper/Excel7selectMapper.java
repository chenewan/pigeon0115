package com.byd.emg.mapper;

import org.apache.ibatis.annotations.Param;
import com.byd.emg.pojo.Excel7select;

import java.util.List;

public interface Excel7selectMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Excel7select record);

    int insertSelective(Excel7select record);

    Excel7select selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Excel7select record);

    int updateByPrimaryKey(Excel7select record);

    List<Excel7select> selectExcel7selectByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertExcel7selectList(@Param("excel7selectList") List<Excel7select> excel7selectList);

    void deleteByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertAfterSelect(@Param("excel7selectList") List<Excel7select> excel7selectList);
}