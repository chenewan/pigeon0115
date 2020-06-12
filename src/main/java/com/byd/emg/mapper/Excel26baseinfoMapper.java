package com.byd.emg.mapper;

import org.apache.ibatis.annotations.Param;
import com.byd.emg.pojo.Excel26baseinfo;

import java.util.List;

public interface Excel26baseinfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Excel26baseinfo record);

    int insertSelective(Excel26baseinfo record);

    Excel26baseinfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Excel26baseinfo record);

    int updateByPrimaryKey(Excel26baseinfo record);

    List<Excel26baseinfo> selectExcel26baseinfoByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertExcel26baseinfoList(@Param("excel26baseinfoList") List<Excel26baseinfo> excel26baseinfoList);

    void deleteByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertAfterSelect(@Param("excel26baseinfoList") List<Excel26baseinfo> excel26baseinfoList);
}