package com.byd.emg.mapper;

import com.byd.emg.pojo.Excel1baseinfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Excel1baseinfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Excel1baseinfo record);

    int insertSelective(Excel1baseinfo record);

    Excel1baseinfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Excel1baseinfo record);

    int updateByPrimaryKey(Excel1baseinfo record);

    List<Excel1baseinfo> selectExcel1baseinfoByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    int insertExcel1baseinfoList(@Param("excel1baseinfoList") List<Excel1baseinfo> excel1baseinfoList);

    int deleteByTime(@Param("beginDT") String beginDT, @Param("endDT") String endDT);

    void insertAfterSelect(@Param("excel1baseinfoList")List<Excel1baseinfo> excel1baseinfoList);
}