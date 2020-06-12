package com.byd.emg.service.impl;

import com.byd.emg.common.DBTypeEnum;
import com.byd.emg.common.DbContextHolder;
import com.byd.emg.mapper.*;
import com.byd.emg.pojo.*;
import com.byd.emg.service.WinccToJavaService;
import com.byd.emg.vo.AllExcelTable;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
//@Log4j
public class WinccToJavaServiceImpl implements WinccToJavaService {
    @Autowired
    private Excel10baseinfoMapper excel10baseinfoMapper;
    @Autowired
    private Excel10dataMapper excel10dataMapper;
    @Autowired
    private Excel11baseinfoMapper excel11baseinfoMapper;
    @Autowired
    private Excel11dataMapper excel11dataMapper;
    @Autowired
    private Excel11selectMapper excel11selectMapper;
    @Autowired
    private Excel12baseinfoMapper excel12baseinfoMapper;
    @Autowired
    private Excel12beginendMapper excel12beginendMapper;
    @Autowired
    private Excel12dataMapper excel12dataMapper;
    @Autowired
    private Excel13baseinfoMapper excel13baseinfoMapper;
    @Autowired
    private Excel13procedureMapper excel13procedureMapper;
    @Autowired
    private Excel14baseinfoMapper excel14baseinfoMapper;
    @Autowired
    private Excel14dataMapper excel14dataMapper;
    @Autowired
    private Excel15baseinfoMapper excel15baseinfoMapper;
    @Autowired
    private Excel15dataMapper excel15dataMapper;
    @Autowired
    private Excel15selectMapper excel15selectMapper;
    @Autowired
    private Excel16baseinfoMapper excel16baseinfoMapper;
    @Autowired
    private Excel16beginendMapper excel16beginendMapper;
    @Autowired
    private Excel16dataMapper excel16dataMapper;
    @Autowired
    private Excel17baseinfoMapper excel17baseinfoMapper;
    @Autowired
    private Excel17dataMapper excel17dataMapper;
    @Autowired
    private Excel18baseinfoMapper excel18baseinfoMapper;
    @Autowired
    private Excel18dataMapper excel18dataMapper;
    @Autowired
    private Excel19baseinfoMapper excel19baseinfoMapper;
    @Autowired
    private Excel19dataMapper excel19dataMapper;
    @Autowired
    private Excel1baseinfoMapper excel1baseinfoMapper;
    @Autowired
    private Excel1procedureMapper excel1procedureMapper;
    @Autowired
    private Excel20baseinfoMapper excel20baseinfoMapper;
    @Autowired
    private Excel20dataMapper excel20dataMapper;
    @Autowired
    private Excel21baseinfoMapper excel21baseinfoMapper;
    @Autowired
    private Excel21dataMapper excel21dataMapper;
    @Autowired
    private Excel22baseinfoMapper excel22baseinfoMapper;
    @Autowired
    private Excel22dataMapper excel22dataMapper;
    @Autowired
    private Excel23baseinfoMapper excel23baseinfoMapper;
    @Autowired
    private Excel23dataMapper excel23dataMapper;
    @Autowired
    private Excel24baseinfoMapper excel24baseinfoMapper;
    @Autowired
    private Excel24dataMapper excel24dataMapper;
    @Autowired
    private Excel24selectMapper excel24selectMapper;
    @Autowired
    private Excel25baseinfoMapper excel25baseinfoMapper;
    @Autowired
    private Excel25dataMapper excel25dataMapper;
    @Autowired
    private Excel26baseinfoMapper excel26baseinfoMapper;
    @Autowired
    private Excel26dataMapper excel26dataMapper;
    @Autowired
    private Excel2baseinfoMapper excel2baseinfoMapper;
    @Autowired
    private Excel2dataMapper excel2dataMapper;
    @Autowired
    private Excel3baseinfoMapper excel3baseinfoMapper;
    @Autowired
    private Excel3dataMapper excel3dataMapper;
    @Autowired
    private Excel3selectMapper excel3selectMapper;
    @Autowired
    private Excel4baseinfoMapper excel4baseinfoMapper;
    @Autowired
    private Excel4beginendMapper excel4beginendMapper;
    @Autowired
    private Excel4dataMapper excel4dataMapper;
    @Autowired
    private Excel5baseinfoMapper excel5baseinfoMapper;
    @Autowired
    private Excel5procedureMapper excel5procedureMapper;
    @Autowired
    private Excel6baseinfoMapper excel6baseinfoMapper;
    @Autowired
    private Excel6dataMapper excel6dataMapper;
    @Autowired
    private Excel7baseinfoMapper excel7baseinfoMapper;
    @Autowired
    private Excel7dataMapper excel7dataMapper;
    @Autowired
    private Excel7selectMapper excel7selectMapper;
    @Autowired
    private Excel8baseinfoMapper excel8baseinfoMapper;
    @Autowired
    private Excel8beginendMapper excel8beginendMapper;
    @Autowired
    private Excel8dataMapper excel8dataMapper;
    @Autowired
    private Excel9baseinfoMapper excel9baseinfoMapper;
    @Autowired
    private Excel9procedureMapper excel9procedureMapper;

    @Override
    public AllExcelTable selectAllExcelTableByTime(String dbnum,String beginDT, String endDT ) {
        AllExcelTable allExcelTable = new AllExcelTable();
        //使用db1

            if (dbnum.equals("db1")) {
                DbContextHolder.setDbType(DBTypeEnum.db1);
            } else if (dbnum.equals("db2")) {
                DbContextHolder.setDbType(DBTypeEnum.db2);
            } else if (dbnum.equals("db3")) {
                DbContextHolder.setDbType(DBTypeEnum.db3);
            } else if (dbnum.equals("db4")) {
                DbContextHolder.setDbType(DBTypeEnum.db4);
            } else if (dbnum.equals("db5")) {
                DbContextHolder.setDbType(DBTypeEnum.db5);
            }

            List<Excel1baseinfo> excel1baseinfoList = excel1baseinfoMapper.selectExcel1baseinfoByTime(beginDT, endDT);

            List<Excel2baseinfo> excel2baseinfoList = (excel2baseinfoMapper.selectExcel2baseinfoByTime(beginDT, endDT));
            List<Excel3baseinfo> excel3baseinfoList = (excel3baseinfoMapper.selectExcel3baseinfoByTime(beginDT, endDT));
            List<Excel4baseinfo> excel4baseinfoList = (excel4baseinfoMapper.selectExcel4baseinfoByTime(beginDT, endDT));
            List<Excel5baseinfo> excel5baseinfoList = (excel5baseinfoMapper.selectExcel5baseinfoByTime(beginDT, endDT));
            List<Excel6baseinfo> excel6baseinfoList = (excel6baseinfoMapper.selectExcel6baseinfoByTime(beginDT, endDT));
            List<Excel7baseinfo> excel7baseinfoList = (excel7baseinfoMapper.selectExcel7baseinfoByTime(beginDT, endDT));
            List<Excel8baseinfo> excel8baseinfoList = (excel8baseinfoMapper.selectExcel8baseinfoByTime(beginDT, endDT));
            List<Excel9baseinfo> excel9baseinfoList = (excel9baseinfoMapper.selectExcel9baseinfoByTime(beginDT, endDT));
            List<Excel10baseinfo> excel10baseinfoList = (excel10baseinfoMapper.selectExcel10baseinfoByTime(beginDT, endDT));
            List<Excel11baseinfo> excel11baseinfoList = (excel11baseinfoMapper.selectExcel11baseinfoByTime(beginDT, endDT));
            List<Excel12baseinfo> excel12baseinfoList = (excel12baseinfoMapper.selectExcel12baseinfoByTime(beginDT, endDT));
            List<Excel13baseinfo> excel13baseinfoList = (excel13baseinfoMapper.selectExcel13baseinfoByTime(beginDT, endDT));
            List<Excel14baseinfo> excel14baseinfoList = (excel14baseinfoMapper.selectExcel14baseinfoByTime(beginDT, endDT));
            List<Excel15baseinfo> excel15baseinfoList = (excel15baseinfoMapper.selectExcel15baseinfoByTime(beginDT, endDT));
            List<Excel16baseinfo> excel16baseinfoList = (excel16baseinfoMapper.selectExcel16baseinfoByTime(beginDT, endDT));
            List<Excel17baseinfo> excel17baseinfoList = (excel17baseinfoMapper.selectExcel17baseinfoByTime(beginDT, endDT));
            List<Excel18baseinfo> excel18baseinfoList = (excel18baseinfoMapper.selectExcel18baseinfoByTime(beginDT, endDT));
            List<Excel19baseinfo> excel19baseinfoList = (excel19baseinfoMapper.selectExcel19baseinfoByTime(beginDT, endDT));
            List<Excel20baseinfo> excel20baseinfoList = (excel20baseinfoMapper.selectExcel20baseinfoByTime(beginDT, endDT));
            List<Excel21baseinfo> excel21baseinfoList = (excel21baseinfoMapper.selectExcel21baseinfoByTime(beginDT, endDT));
            List<Excel22baseinfo> excel22baseinfoList = (excel22baseinfoMapper.selectExcel22baseinfoByTime(beginDT, endDT));
            List<Excel23baseinfo> excel23baseinfoList = (excel23baseinfoMapper.selectExcel23baseinfoByTime(beginDT, endDT));
            List<Excel24baseinfo> excel24baseinfoList = (excel24baseinfoMapper.selectExcel24baseinfoByTime(beginDT, endDT));
            List<Excel25baseinfo> excel25baseinfoList = (excel25baseinfoMapper.selectExcel25baseinfoByTime(beginDT, endDT));
            List<Excel26baseinfo> excel26baseinfoList = (excel26baseinfoMapper.selectExcel26baseinfoByTime(beginDT, endDT));

            List<Excel2data> excel2dataList = (excel2dataMapper.selectExcel2dataByTime(beginDT, endDT));
            List<Excel3data> excel3dataList = (excel3dataMapper.selectExcel3dataByTime(beginDT, endDT));
            List<Excel4data> excel4dataList = (excel4dataMapper.selectExcel4dataByTime(beginDT, endDT));
            List<Excel6data> excel6dataList = (excel6dataMapper.selectExcel6dataByTime(beginDT, endDT));
            List<Excel7data> excel7dataList = (excel7dataMapper.selectExcel7dataByTime(beginDT, endDT));
            List<Excel8data> excel8dataList = (excel8dataMapper.selectExcel8dataByTime(beginDT, endDT));
            List<Excel10data> excel10dataList = (excel10dataMapper.selectExcel10dataByTime(beginDT, endDT));
            List<Excel11data> excel11dataList = (excel11dataMapper.selectExcel11dataByTime(beginDT, endDT));
            List<Excel12data> excel12dataList = (excel12dataMapper.selectExcel12dataByTime(beginDT, endDT));
            List<Excel14data> excel14dataList = (excel14dataMapper.selectExcel14dataByTime(beginDT, endDT));
            List<Excel15data> excel15dataList = (excel15dataMapper.selectExcel15dataByTime(beginDT, endDT));
            List<Excel16data> excel16dataList = (excel16dataMapper.selectExcel16dataByTime(beginDT, endDT));
            List<Excel17data> excel17dataList = (excel17dataMapper.selectExcel17dataByTime(beginDT, endDT));
            List<Excel18data> excel18dataList = (excel18dataMapper.selectExcel18dataByTime(beginDT, endDT));
            List<Excel19data> excel19dataList = (excel19dataMapper.selectExcel19dataByTime(beginDT, endDT));
            List<Excel20data> excel20dataList = (excel20dataMapper.selectExcel20dataByTime(beginDT, endDT));
            List<Excel21data> excel21dataList = (excel21dataMapper.selectExcel21dataByTime(beginDT, endDT));
            List<Excel22data> excel22dataList = (excel22dataMapper.selectExcel22dataByTime(beginDT, endDT));
            List<Excel23data> excel23dataList = (excel23dataMapper.selectExcel23dataByTime(beginDT, endDT));
            List<Excel24data> excel24dataList = (excel24dataMapper.selectExcel24dataByTime(beginDT, endDT));
            List<Excel25data> excel25dataList = (excel25dataMapper.selectExcel25dataByTime(beginDT, endDT));
            List<Excel26data> excel26dataList = (excel26dataMapper.selectExcel26dataByTime(beginDT, endDT));

            List<Excel1procedure> excel1procedureList = (excel1procedureMapper.selectExcel1procedureByTime(beginDT, endDT));
            List<Excel9procedure> excel9procedureList = (excel9procedureMapper.selectExcel9procedureByTime(beginDT, endDT));
            List<Excel5procedure> excel5procedureList = (excel5procedureMapper.selectExcel5procedureByTime(beginDT, endDT));
            List<Excel13procedure> excel13procedureList = (excel13procedureMapper.selectExcel13procedureByTime(beginDT, endDT));

            List<Excel3select> excel3selectList = (excel3selectMapper.selectExcel3selectByTime(beginDT, endDT));
            List<Excel7select> excel7selectList = (excel7selectMapper.selectExcel7selectByTime(beginDT, endDT));
            List<Excel11select> excel11selectList = (excel11selectMapper.selectExcel11selectByTime(beginDT, endDT));
            List<Excel15select> excel15selectList = (excel15selectMapper.selectExcel15selectByTime(beginDT, endDT));
            List<Excel24select> excel24selectList = (excel24selectMapper.selectExcel24selectByTime(beginDT, endDT));

            List<Excel4beginend> excel4beginendList = (excel4beginendMapper.selectExcel4beginendByTime(beginDT, endDT));
            List<Excel8beginend> excel8beginendList = (excel8beginendMapper.selectExcel8beginendByTime(beginDT, endDT));
            List<Excel12beginend> excel12beginendList = (excel12beginendMapper.selectExcel12beginendByTime(beginDT, endDT));
            List<Excel16beginend> excel16beginendList = (excel16beginendMapper.selectExcel16beginendByTime(beginDT, endDT));


            allExcelTable.setExcel1baseinfoList(excel1baseinfoList == null ? new ArrayList<Excel1baseinfo>() : excel1baseinfoList);
            allExcelTable.setExcel2baseinfoList(excel2baseinfoList == null ? new ArrayList<Excel2baseinfo>() : excel2baseinfoList);
            allExcelTable.setExcel3baseinfoList(excel3baseinfoList == null ? new ArrayList<Excel3baseinfo>() : excel3baseinfoList);
            allExcelTable.setExcel4baseinfoList(excel4baseinfoList == null ? new ArrayList<Excel4baseinfo>() : excel4baseinfoList);
            allExcelTable.setExcel5baseinfoList(excel5baseinfoList == null ? new ArrayList<Excel5baseinfo>() : excel5baseinfoList);
            allExcelTable.setExcel6baseinfoList(excel6baseinfoList == null ? new ArrayList<Excel6baseinfo>() : excel6baseinfoList);
            allExcelTable.setExcel7baseinfoList(excel7baseinfoList == null ? new ArrayList<Excel7baseinfo>() : excel7baseinfoList);
            allExcelTable.setExcel8baseinfoList(excel8baseinfoList == null ? new ArrayList<Excel8baseinfo>() : excel8baseinfoList);
            allExcelTable.setExcel9baseinfoList(excel9baseinfoList == null ? new ArrayList<Excel9baseinfo>() : excel9baseinfoList);
            allExcelTable.setExcel10baseinfoList(excel10baseinfoList == null ? new ArrayList<Excel10baseinfo>() : excel10baseinfoList);
            allExcelTable.setExcel11baseinfoList(excel11baseinfoList == null ? new ArrayList<Excel11baseinfo>() : excel11baseinfoList);
            allExcelTable.setExcel12baseinfoList(excel12baseinfoList == null ? new ArrayList<Excel12baseinfo>() : excel12baseinfoList);
            allExcelTable.setExcel13baseinfoList(excel13baseinfoList == null ? new ArrayList<Excel13baseinfo>() : excel13baseinfoList);
            allExcelTable.setExcel14baseinfoList(excel14baseinfoList == null ? new ArrayList<Excel14baseinfo>() : excel14baseinfoList);
            allExcelTable.setExcel15baseinfoList(excel15baseinfoList == null ? new ArrayList<Excel15baseinfo>() : excel15baseinfoList);
            allExcelTable.setExcel16baseinfoList(excel16baseinfoList == null ? new ArrayList<Excel16baseinfo>() : excel16baseinfoList);
            allExcelTable.setExcel17baseinfoList(excel17baseinfoList == null ? new ArrayList<Excel17baseinfo>() : excel17baseinfoList);
            allExcelTable.setExcel18baseinfoList(excel18baseinfoList == null ? new ArrayList<Excel18baseinfo>() : excel18baseinfoList);
            allExcelTable.setExcel19baseinfoList(excel19baseinfoList == null ? new ArrayList<Excel19baseinfo>() : excel19baseinfoList);
            allExcelTable.setExcel20baseinfoList(excel20baseinfoList == null ? new ArrayList<Excel20baseinfo>() : excel20baseinfoList);
            allExcelTable.setExcel21baseinfoList(excel21baseinfoList == null ? new ArrayList<Excel21baseinfo>() : excel21baseinfoList);
            allExcelTable.setExcel22baseinfoList(excel22baseinfoList == null ? new ArrayList<Excel22baseinfo>() : excel22baseinfoList);
            allExcelTable.setExcel23baseinfoList(excel23baseinfoList == null ? new ArrayList<Excel23baseinfo>() : excel23baseinfoList);
            allExcelTable.setExcel24baseinfoList(excel24baseinfoList == null ? new ArrayList<Excel24baseinfo>() : excel24baseinfoList);
            allExcelTable.setExcel25baseinfoList(excel25baseinfoList == null ? new ArrayList<Excel25baseinfo>() : excel25baseinfoList);
            allExcelTable.setExcel26baseinfoList(excel26baseinfoList == null ? new ArrayList<Excel26baseinfo>() : excel26baseinfoList);

            allExcelTable.setExcel2dataList(excel2dataList == null ? new ArrayList<Excel2data>() : excel2dataList);
            allExcelTable.setExcel3dataList(excel3dataList == null ? new ArrayList<Excel3data>() : excel3dataList);
            allExcelTable.setExcel4dataList(excel4dataList == null ? new ArrayList<Excel4data>() : excel4dataList);
            allExcelTable.setExcel6dataList(excel6dataList == null ? new ArrayList<Excel6data>() : excel6dataList);
            allExcelTable.setExcel7dataList(excel7dataList == null ? new ArrayList<Excel7data>() : excel7dataList);
            allExcelTable.setExcel8dataList(excel8dataList == null ? new ArrayList<Excel8data>() : excel8dataList);
            allExcelTable.setExcel10dataList(excel10dataList == null ? new ArrayList<Excel10data>() : excel10dataList);
            allExcelTable.setExcel11dataList(excel11dataList == null ? new ArrayList<Excel11data>() : excel11dataList);
            allExcelTable.setExcel12dataList(excel12dataList == null ? new ArrayList<Excel12data>() : excel12dataList);
            allExcelTable.setExcel14dataList(excel14dataList == null ? new ArrayList<Excel14data>() : excel14dataList);
            allExcelTable.setExcel15dataList(excel15dataList == null ? new ArrayList<Excel15data>() : excel15dataList);
            allExcelTable.setExcel16dataList(excel16dataList == null ? new ArrayList<Excel16data>() : excel16dataList);
            allExcelTable.setExcel17dataList(excel17dataList == null ? new ArrayList<Excel17data>() : excel17dataList);
            allExcelTable.setExcel18dataList(excel18dataList == null ? new ArrayList<Excel18data>() : excel18dataList);
            allExcelTable.setExcel19dataList(excel19dataList == null ? new ArrayList<Excel19data>() : excel19dataList);
            allExcelTable.setExcel20dataList(excel20dataList == null ? new ArrayList<Excel20data>() : excel20dataList);
            allExcelTable.setExcel21dataList(excel21dataList == null ? new ArrayList<Excel21data>() : excel21dataList);
            allExcelTable.setExcel22dataList(excel22dataList == null ? new ArrayList<Excel22data>() : excel22dataList);
            allExcelTable.setExcel23dataList(excel23dataList == null ? new ArrayList<Excel23data>() : excel23dataList);
            allExcelTable.setExcel24dataList(excel24dataList == null ? new ArrayList<Excel24data>() : excel24dataList);
            allExcelTable.setExcel25dataList(excel25dataList == null ? new ArrayList<Excel25data>() : excel25dataList);
            allExcelTable.setExcel26dataList(excel26dataList == null ? new ArrayList<Excel26data>() : excel26dataList);

            allExcelTable.setExcel1procedureList(excel1procedureList == null ? new ArrayList<Excel1procedure>() : excel1procedureList);
            allExcelTable.setExcel9procedureList(excel9procedureList == null ? new ArrayList<Excel9procedure>() : excel9procedureList);
            allExcelTable.setExcel5procedureList(excel5procedureList == null ? new ArrayList<Excel5procedure>() : excel5procedureList);
            allExcelTable.setExcel13procedureList(excel13procedureList == null ? new ArrayList<Excel13procedure>() : excel13procedureList);

            allExcelTable.setExcel3selectList(excel3selectList == null ? new ArrayList<Excel3select>() : excel3selectList);
            allExcelTable.setExcel7selectList(excel7selectList == null ? new ArrayList<Excel7select>() : excel7selectList);
            allExcelTable.setExcel11selectList(excel11selectList == null ? new ArrayList<Excel11select>() : excel11selectList);
            allExcelTable.setExcel15selectList(excel15selectList == null ? new ArrayList<Excel15select>() : excel15selectList);
            allExcelTable.setExcel24selectList(excel24selectList == null ? new ArrayList<Excel24select>() : excel24selectList);

            allExcelTable.setExcel4beginendList(excel4beginendList == null ? new ArrayList<Excel4beginend>() : excel4beginendList);
            allExcelTable.setExcel8beginendList(excel8beginendList == null ? new ArrayList<Excel8beginend>() : excel8beginendList);
            allExcelTable.setExcel12beginendList(excel12beginendList == null ? new ArrayList<Excel12beginend>() : excel12beginendList);
            allExcelTable.setExcel16beginendList(excel16beginendList == null ? new ArrayList<Excel16beginend>() : excel16beginendList);


        return allExcelTable;
    }

    @Override
    public void deleteAllExcelTableByTime(String dbnum, String beginDT, String endDT) {
        if (dbnum.equals("db1")) {
            DbContextHolder.setDbType(DBTypeEnum.db1);
        } else if (dbnum.equals("db2")) {
            DbContextHolder.setDbType(DBTypeEnum.db2);
        } else if (dbnum.equals("db3")) {
            DbContextHolder.setDbType(DBTypeEnum.db3);
        } else if (dbnum.equals("db4")) {
            DbContextHolder.setDbType(DBTypeEnum.db4);
        } else if (dbnum.equals("db5")) {
            DbContextHolder.setDbType(DBTypeEnum.db5);
        }

        excel1baseinfoMapper.deleteByTime(beginDT,endDT);
        excel2baseinfoMapper.deleteByTime(beginDT,endDT);
        excel3baseinfoMapper.deleteByTime(beginDT,endDT);
        excel4baseinfoMapper.deleteByTime(beginDT,endDT);
        excel5baseinfoMapper.deleteByTime(beginDT,endDT);
        excel6baseinfoMapper.deleteByTime(beginDT,endDT);
        excel7baseinfoMapper.deleteByTime(beginDT,endDT);
        excel8baseinfoMapper.deleteByTime(beginDT,endDT);
        excel9baseinfoMapper.deleteByTime(beginDT,endDT);
        excel10baseinfoMapper.deleteByTime(beginDT,endDT);
        excel11baseinfoMapper.deleteByTime(beginDT,endDT);
        excel12baseinfoMapper.deleteByTime(beginDT,endDT);
        excel13baseinfoMapper.deleteByTime(beginDT,endDT);
        excel14baseinfoMapper.deleteByTime(beginDT,endDT);
        excel15baseinfoMapper.deleteByTime(beginDT,endDT);
        excel16baseinfoMapper.deleteByTime(beginDT,endDT);
        excel17baseinfoMapper.deleteByTime(beginDT,endDT);
        excel18baseinfoMapper.deleteByTime(beginDT,endDT);
        excel19baseinfoMapper.deleteByTime(beginDT,endDT);
        excel20baseinfoMapper.deleteByTime(beginDT,endDT);
        excel21baseinfoMapper.deleteByTime(beginDT,endDT);
        excel22baseinfoMapper.deleteByTime(beginDT,endDT);
        excel23baseinfoMapper.deleteByTime(beginDT,endDT);
        excel24baseinfoMapper.deleteByTime(beginDT,endDT);
        excel25baseinfoMapper.deleteByTime(beginDT,endDT);
        excel26baseinfoMapper.deleteByTime(beginDT,endDT);

        excel2dataMapper.deleteByTime(beginDT,endDT);
        excel3dataMapper.deleteByTime(beginDT,endDT);
        excel4dataMapper.deleteByTime(beginDT,endDT);
        excel6dataMapper.deleteByTime(beginDT,endDT);
        excel7dataMapper.deleteByTime(beginDT,endDT);
        excel8dataMapper.deleteByTime(beginDT,endDT);
        excel10dataMapper.deleteByTime(beginDT,endDT);
        excel11dataMapper.deleteByTime(beginDT,endDT);
        excel12dataMapper.deleteByTime(beginDT,endDT);
        excel14dataMapper.deleteByTime(beginDT,endDT);
        excel15dataMapper.deleteByTime(beginDT,endDT);
        excel16dataMapper.deleteByTime(beginDT,endDT);
        excel17dataMapper.deleteByTime(beginDT,endDT);
        excel18dataMapper.deleteByTime(beginDT,endDT);
        excel19dataMapper.deleteByTime(beginDT,endDT);
        excel20dataMapper.deleteByTime(beginDT,endDT);
        excel21dataMapper.deleteByTime(beginDT,endDT);
        excel22dataMapper.deleteByTime(beginDT,endDT);
        excel23dataMapper.deleteByTime(beginDT,endDT);
        excel24dataMapper.deleteByTime(beginDT,endDT);
        excel25dataMapper.deleteByTime(beginDT,endDT);
        excel26dataMapper.deleteByTime(beginDT,endDT);

        excel1procedureMapper.deleteByTime(beginDT,endDT);
        excel9procedureMapper.deleteByTime(beginDT,endDT);
        excel5procedureMapper.deleteByTime(beginDT,endDT);
        excel13procedureMapper.deleteByTime(beginDT,endDT);

        excel3selectMapper.deleteByTime(beginDT,endDT);
        excel7selectMapper.deleteByTime(beginDT,endDT);
        excel11selectMapper.deleteByTime(beginDT,endDT);
        excel15selectMapper.deleteByTime(beginDT,endDT);
        excel24selectMapper.deleteByTime(beginDT,endDT);

        excel4beginendMapper.deleteByTime(beginDT,endDT);
        excel8beginendMapper.deleteByTime(beginDT,endDT);
        excel12beginendMapper.deleteByTime(beginDT,endDT);
        excel16beginendMapper.deleteByTime(beginDT,endDT);
    }
}
