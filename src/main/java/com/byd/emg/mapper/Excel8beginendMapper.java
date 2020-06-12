package com.byd.emg.mapper;

import org.apache.ibatis.annotations.Param;
import com.byd.emg.pojo.Excel8beginend;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Excel8beginendMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Excel8beginend record);

    int insertSelective(Excel8beginend record);

    Excel8beginend selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Excel8beginend record);

    int updateByPrimaryKey(Excel8beginend record);

    List<Excel8beginend> selectExcel8beginendByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertExcel8beginendList(@Param("excel8beginendList") List<Excel8beginend> excel8beginendList);

    void deleteByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertAfterSelect(@Param("excel8beginendList")List<Excel8beginend> excel8beginendList);
}