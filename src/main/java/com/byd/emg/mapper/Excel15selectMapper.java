package com.byd.emg.mapper;

import org.apache.ibatis.annotations.Param;
import com.byd.emg.pojo.Excel15select;

import java.util.List;

public interface Excel15selectMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Excel15select record);

    int insertSelective(Excel15select record);

    Excel15select selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Excel15select record);

    int updateByPrimaryKey(Excel15select record);

    List<Excel15select> selectExcel15selectByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertExcel15selectList(@Param("excel15selectList") List<Excel15select> excel15selectList);

    void deleteByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertAfterSelect(@Param("excel15selectList") List<Excel15select> excel15selectList);
}