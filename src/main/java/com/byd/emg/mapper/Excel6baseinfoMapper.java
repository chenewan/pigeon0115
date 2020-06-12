package com.byd.emg.mapper;

import org.apache.ibatis.annotations.Param;
import com.byd.emg.pojo.Excel6baseinfo;

import java.util.List;

public interface Excel6baseinfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Excel6baseinfo record);

    int insertSelective(Excel6baseinfo record);

    Excel6baseinfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Excel6baseinfo record);

    int updateByPrimaryKey(Excel6baseinfo record);

    List<Excel6baseinfo> selectExcel6baseinfoByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertExcel6baseinfoList(@Param("excel6baseinfoList") List<Excel6baseinfo> excel6baseinfoList);

    void deleteByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertAfterSelect(@Param("excel6baseinfoList") List<Excel6baseinfo> excel6baseinfoList);
}