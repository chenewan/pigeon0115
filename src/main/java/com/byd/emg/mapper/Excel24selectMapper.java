package com.byd.emg.mapper;

import org.apache.ibatis.annotations.Param;
import com.byd.emg.pojo.Excel24select;

import java.util.List;

public interface Excel24selectMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Excel24select record);

    int insertSelective(Excel24select record);

    Excel24select selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Excel24select record);

    int updateByPrimaryKey(Excel24select record);

    List<Excel24select> selectExcel24selectByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertExcel24selectList(@Param("excel24selectList") List<Excel24select> excel24selectList);

    void deleteByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertAfterSelect(@Param("excel24selectList") List<Excel24select> excel24selectList);
}