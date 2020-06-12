package com.byd.emg.mapper;

import org.apache.ibatis.annotations.Param;
import com.byd.emg.pojo.Excel18baseinfo;

import java.util.List;

public interface Excel18baseinfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Excel18baseinfo record);

    int insertSelective(Excel18baseinfo record);

    Excel18baseinfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Excel18baseinfo record);

    int updateByPrimaryKey(Excel18baseinfo record);

    List<Excel18baseinfo> selectExcel18baseinfoByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertExcel18baseinfoList(@Param("excel18baseinfoList") List<Excel18baseinfo> excel18baseinfoList);

    void deleteByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertAfterSelect(@Param("excel18baseinfoList") List<Excel18baseinfo> excel18baseinfoList);
}