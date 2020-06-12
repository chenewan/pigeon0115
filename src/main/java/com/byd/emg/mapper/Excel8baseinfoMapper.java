package com.byd.emg.mapper;

import org.apache.ibatis.annotations.Param;
import com.byd.emg.pojo.Excel8baseinfo;

import java.util.List;

public interface Excel8baseinfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Excel8baseinfo record);

    int insertSelective(Excel8baseinfo record);

    Excel8baseinfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Excel8baseinfo record);

    int updateByPrimaryKey(Excel8baseinfo record);

    List<Excel8baseinfo> selectExcel8baseinfoByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertExcel8baseinfoList(@Param("excel8baseinfoList") List<Excel8baseinfo> excel8baseinfoList);

    void deleteByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertAfterSelect(@Param("excel8baseinfoList") List<Excel8baseinfo> excel8baseinfoList);
}