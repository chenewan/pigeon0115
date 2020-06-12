package com.byd.emg.mapper;

import org.apache.ibatis.annotations.Param;
import com.byd.emg.pojo.Excel16baseinfo;

import java.util.List;

public interface Excel16baseinfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Excel16baseinfo record);

    int insertSelective(Excel16baseinfo record);

    Excel16baseinfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Excel16baseinfo record);

    int updateByPrimaryKey(Excel16baseinfo record);

    List<Excel16baseinfo> selectExcel16baseinfoByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertExcel16baseinfoList(@Param("excel16baseinfoList") List<Excel16baseinfo> excel16baseinfoList);

    void deleteByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertAfterSelect(@Param("excel16baseinfoList") List<Excel16baseinfo> excel16baseinfoList);
}