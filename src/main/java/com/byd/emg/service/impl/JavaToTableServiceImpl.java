package com.byd.emg.service.impl;

import com.byd.emg.common.DBTypeEnum;
import com.byd.emg.common.DbContextHolder;
import com.byd.emg.mapper.*;
import com.byd.emg.pojo.Excel1baseinfo;
import com.byd.emg.service.JavaToTableService;
import com.byd.emg.service.TestConnectService;
import com.byd.emg.service.WinccToJavaService;
import com.byd.emg.vo.AllExcelTable;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//@Log4j
public class JavaToTableServiceImpl implements JavaToTableService {
    @Autowired
    private PrimarytableMapper primarytableMapper;
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
    @Autowired
    private WinccToJavaService winccToJavaService;
    @Autowired
    private TestConnectService testConnectService;

    @Override
    public AllExcelTable selectAllExcelTableByTime(String dbnum,String beginDT, String endDT ) {
        AllExcelTable allExcelTable = new AllExcelTable();
        //使用db1
        if(dbnum.equals("db1")){
            DbContextHolder.setDbType(DBTypeEnum.db1);
        }else if(dbnum.equals("db2")){
            DbContextHolder.setDbType(DBTypeEnum.db2);
        }else if(dbnum.equals("db3")){
            DbContextHolder.setDbType(DBTypeEnum.db3);
        }else if(dbnum.equals("db4")){
            DbContextHolder.setDbType(DBTypeEnum.db4);
        }else{
            DbContextHolder.setDbType(DBTypeEnum.db5);
        }

        allExcelTable.setExcel1baseinfoList(excel1baseinfoMapper.selectExcel1baseinfoByTime(beginDT,endDT));
        allExcelTable.setExcel2baseinfoList(excel2baseinfoMapper.selectExcel2baseinfoByTime(beginDT,endDT));
        allExcelTable.setExcel3baseinfoList(excel3baseinfoMapper.selectExcel3baseinfoByTime(beginDT,endDT));
        allExcelTable.setExcel4baseinfoList(excel4baseinfoMapper.selectExcel4baseinfoByTime(beginDT,endDT));
        allExcelTable.setExcel5baseinfoList(excel5baseinfoMapper.selectExcel5baseinfoByTime(beginDT,endDT));
        allExcelTable.setExcel6baseinfoList(excel6baseinfoMapper.selectExcel6baseinfoByTime(beginDT,endDT));
        allExcelTable.setExcel7baseinfoList(excel7baseinfoMapper.selectExcel7baseinfoByTime(beginDT,endDT));
        allExcelTable.setExcel8baseinfoList(excel8baseinfoMapper.selectExcel8baseinfoByTime(beginDT,endDT));
        allExcelTable.setExcel9baseinfoList(excel9baseinfoMapper.selectExcel9baseinfoByTime(beginDT,endDT));
        allExcelTable.setExcel10baseinfoList(excel10baseinfoMapper.selectExcel10baseinfoByTime(beginDT,endDT));
        allExcelTable.setExcel11baseinfoList(excel11baseinfoMapper.selectExcel11baseinfoByTime(beginDT,endDT));
        allExcelTable.setExcel12baseinfoList(excel12baseinfoMapper.selectExcel12baseinfoByTime(beginDT,endDT));
        allExcelTable.setExcel13baseinfoList(excel13baseinfoMapper.selectExcel13baseinfoByTime(beginDT,endDT));
        allExcelTable.setExcel14baseinfoList(excel14baseinfoMapper.selectExcel14baseinfoByTime(beginDT,endDT));
        allExcelTable.setExcel15baseinfoList(excel15baseinfoMapper.selectExcel15baseinfoByTime(beginDT,endDT));
        allExcelTable.setExcel16baseinfoList(excel16baseinfoMapper.selectExcel16baseinfoByTime(beginDT,endDT));
        allExcelTable.setExcel17baseinfoList(excel17baseinfoMapper.selectExcel17baseinfoByTime(beginDT,endDT));
        allExcelTable.setExcel18baseinfoList(excel18baseinfoMapper.selectExcel18baseinfoByTime(beginDT,endDT));
        allExcelTable.setExcel19baseinfoList(excel19baseinfoMapper.selectExcel19baseinfoByTime(beginDT,endDT));
        allExcelTable.setExcel20baseinfoList(excel20baseinfoMapper.selectExcel20baseinfoByTime(beginDT,endDT));
        allExcelTable.setExcel21baseinfoList(excel21baseinfoMapper.selectExcel21baseinfoByTime(beginDT,endDT));
        allExcelTable.setExcel22baseinfoList(excel22baseinfoMapper.selectExcel22baseinfoByTime(beginDT,endDT));
        allExcelTable.setExcel23baseinfoList(excel23baseinfoMapper.selectExcel23baseinfoByTime(beginDT,endDT));
        allExcelTable.setExcel24baseinfoList(excel24baseinfoMapper.selectExcel24baseinfoByTime(beginDT,endDT));
        allExcelTable.setExcel25baseinfoList(excel25baseinfoMapper.selectExcel25baseinfoByTime(beginDT,endDT));
        allExcelTable.setExcel26baseinfoList(excel26baseinfoMapper.selectExcel26baseinfoByTime(beginDT,endDT));

        allExcelTable.setExcel2dataList(excel2dataMapper.selectExcel2dataByTime(beginDT,endDT));
        allExcelTable.setExcel3dataList(excel3dataMapper.selectExcel3dataByTime(beginDT,endDT));
        allExcelTable.setExcel4dataList(excel4dataMapper.selectExcel4dataByTime(beginDT,endDT));
        allExcelTable.setExcel6dataList(excel6dataMapper.selectExcel6dataByTime(beginDT,endDT));
        allExcelTable.setExcel7dataList(excel7dataMapper.selectExcel7dataByTime(beginDT,endDT));
        allExcelTable.setExcel8dataList(excel8dataMapper.selectExcel8dataByTime(beginDT,endDT));
        allExcelTable.setExcel10dataList(excel10dataMapper.selectExcel10dataByTime(beginDT,endDT));
        allExcelTable.setExcel11dataList(excel11dataMapper.selectExcel11dataByTime(beginDT,endDT));
        allExcelTable.setExcel12dataList(excel12dataMapper.selectExcel12dataByTime(beginDT,endDT));
        allExcelTable.setExcel14dataList(excel14dataMapper.selectExcel14dataByTime(beginDT,endDT));
        allExcelTable.setExcel15dataList(excel15dataMapper.selectExcel15dataByTime(beginDT,endDT));
        allExcelTable.setExcel16dataList(excel16dataMapper.selectExcel16dataByTime(beginDT,endDT));
        allExcelTable.setExcel17dataList(excel17dataMapper.selectExcel17dataByTime(beginDT,endDT));
        allExcelTable.setExcel18dataList(excel18dataMapper.selectExcel18dataByTime(beginDT,endDT));
        allExcelTable.setExcel19dataList(excel19dataMapper.selectExcel19dataByTime(beginDT,endDT));
        allExcelTable.setExcel20dataList(excel20dataMapper.selectExcel20dataByTime(beginDT,endDT));
        allExcelTable.setExcel21dataList(excel21dataMapper.selectExcel21dataByTime(beginDT,endDT));
        allExcelTable.setExcel22dataList(excel22dataMapper.selectExcel22dataByTime(beginDT,endDT));
        allExcelTable.setExcel23dataList(excel23dataMapper.selectExcel23dataByTime(beginDT,endDT));
        allExcelTable.setExcel24dataList(excel24dataMapper.selectExcel24dataByTime(beginDT,endDT));
        allExcelTable.setExcel25dataList(excel25dataMapper.selectExcel25dataByTime(beginDT,endDT));
        allExcelTable.setExcel26dataList(excel26dataMapper.selectExcel26dataByTime(beginDT,endDT));

        allExcelTable.setExcel1procedureList(excel1procedureMapper.selectExcel1procedureByTime(beginDT,endDT));
        allExcelTable.setExcel9procedureList(excel9procedureMapper.selectExcel9procedureByTime(beginDT,endDT));
        allExcelTable.setExcel5procedureList(excel5procedureMapper.selectExcel5procedureByTime(beginDT,endDT));
        allExcelTable.setExcel13procedureList(excel13procedureMapper.selectExcel13procedureByTime(beginDT,endDT));

        allExcelTable.setExcel3selectList(excel3selectMapper.selectExcel3selectByTime(beginDT,endDT));
        allExcelTable.setExcel7selectList(excel7selectMapper.selectExcel7selectByTime(beginDT,endDT));
        allExcelTable.setExcel11selectList(excel11selectMapper.selectExcel11selectByTime(beginDT,endDT));
        allExcelTable.setExcel15selectList(excel15selectMapper.selectExcel15selectByTime(beginDT,endDT));
        allExcelTable.setExcel24selectList(excel24selectMapper.selectExcel24selectByTime(beginDT,endDT));

        allExcelTable.setExcel4beginendList(excel4beginendMapper.selectExcel4beginendByTime(beginDT,endDT));
        allExcelTable.setExcel8beginendList(excel8beginendMapper.selectExcel8beginendByTime(beginDT,endDT));
        allExcelTable.setExcel12beginendList(excel12beginendMapper.selectExcel12beginendByTime(beginDT,endDT));
        allExcelTable.setExcel16beginendList(excel16beginendMapper.selectExcel16beginendByTime(beginDT,endDT));


        return allExcelTable;
    }

    @Override
    public int insertAllExcelToTable(String dbnum, AllExcelTable allExcelTable) {
        if(dbnum.equals("db1")){
            DbContextHolder.setDbType(DBTypeEnum.db1);
        }else if(dbnum.equals("db2")){
            DbContextHolder.setDbType(DBTypeEnum.db2);
        }else if(dbnum.equals("db3")){
            DbContextHolder.setDbType(DBTypeEnum.db3);
        }else if(dbnum.equals("db4")){
            DbContextHolder.setDbType(DBTypeEnum.db4);
        }else{
            DbContextHolder.setDbType(DBTypeEnum.db5);
        }
        int toIndex;
        if(allExcelTable.getExcel1baseinfoList().size()>0){
            toIndex=20;
            for(int j=0;j<allExcelTable.getExcel1baseinfoList().size();j+=20  ){
                if(j+20>allExcelTable.getExcel1baseinfoList().size()){
                    toIndex=allExcelTable.getExcel1baseinfoList().size()-j;
                }
            List newResult3 = allExcelTable.getExcel1baseinfoList().subList(j,j+toIndex);
            excel1baseinfoMapper.insertExcel1baseinfoList(newResult3);
            }
        }
        if(allExcelTable.getExcel2baseinfoList().size()>0){
            toIndex=20;
            for(int j=0;j<allExcelTable.getExcel2baseinfoList().size();j+=20  ) {
                if (j + 20 > allExcelTable.getExcel2baseinfoList().size()) {
                    toIndex = allExcelTable.getExcel2baseinfoList().size() - j;
                }
                List newResult3 = allExcelTable.getExcel2baseinfoList().subList(j, j + toIndex);
                excel2baseinfoMapper.insertExcel2baseinfoList(newResult3);
            }
        }
        if(allExcelTable.getExcel3baseinfoList().size()>0){
            toIndex=20;
            for(int j=0;j<allExcelTable.getExcel3baseinfoList().size();j+=20  ){
                if(j+20>allExcelTable.getExcel3baseinfoList().size()){
                    toIndex=allExcelTable.getExcel3baseinfoList().size()-j;
                }
                List newResult3 = allExcelTable.getExcel3baseinfoList().subList(j,j+toIndex);
                excel3baseinfoMapper.insertExcel3baseinfoList(newResult3);
            }
        }
        if(allExcelTable.getExcel4baseinfoList().size()>0){
            toIndex=20;
            for(int j=0;j<allExcelTable.getExcel4baseinfoList().size();j+=20  ){
                if(j+20>allExcelTable.getExcel4baseinfoList().size()){
                    toIndex=allExcelTable.getExcel4baseinfoList().size()-j;
                }
                List newResult3 = allExcelTable.getExcel4baseinfoList().subList(j,j+toIndex);
                excel4baseinfoMapper.insertExcel4baseinfoList(newResult3);
            }
        }
        if(allExcelTable.getExcel5baseinfoList().size()>0){
            toIndex=20;
            for(int j=0;j<allExcelTable.getExcel5baseinfoList().size();j+=20  ){
                if(j+20>allExcelTable.getExcel5baseinfoList().size()){
                    toIndex=allExcelTable.getExcel5baseinfoList().size()-j;
                }
                List newResult3 = allExcelTable.getExcel5baseinfoList().subList(j,j+toIndex);
                excel5baseinfoMapper.insertExcel5baseinfoList(newResult3);
            }
        }
        if(allExcelTable.getExcel6baseinfoList().size()>0){
            toIndex=20;
            for(int j=0;j<allExcelTable.getExcel6baseinfoList().size();j+=20  ){
                if(j+20>allExcelTable.getExcel6baseinfoList().size()){
                    toIndex=allExcelTable.getExcel6baseinfoList().size()-j;
                }
                List newResult3 = allExcelTable.getExcel6baseinfoList().subList(j,j+toIndex);
                excel6baseinfoMapper.insertExcel6baseinfoList(newResult3);
            }
        }
        if(allExcelTable.getExcel7baseinfoList().size()>0){
            toIndex=20;
            for(int j=0;j<allExcelTable.getExcel7baseinfoList().size();j+=20  ){
                if(j+20>allExcelTable.getExcel7baseinfoList().size()){
                    toIndex=allExcelTable.getExcel7baseinfoList().size()-j;
                }
                List newResult3 = allExcelTable.getExcel7baseinfoList().subList(j,j+toIndex);
                excel7baseinfoMapper.insertExcel7baseinfoList(newResult3);
            }
        }
        if(allExcelTable.getExcel8baseinfoList().size()>0){
            toIndex=20;
            for(int j=0;j<allExcelTable.getExcel8baseinfoList().size();j+=20  ){
                if(j+20>allExcelTable.getExcel8baseinfoList().size()){
                    toIndex=allExcelTable.getExcel8baseinfoList().size()-j;
                }
                List newResult3 = allExcelTable.getExcel8baseinfoList().subList(j,j+toIndex);
                excel8baseinfoMapper.insertExcel8baseinfoList(newResult3);
            }
        }
        if(allExcelTable.getExcel9baseinfoList().size()>0){
            toIndex=20;
            for(int j=0;j<allExcelTable.getExcel9baseinfoList().size();j+=20  ){
                if(j+20>allExcelTable.getExcel9baseinfoList().size()){
                    toIndex=allExcelTable.getExcel9baseinfoList().size()-j;
                }
                List newResult3 = allExcelTable.getExcel9baseinfoList().subList(j,j+toIndex);
                excel9baseinfoMapper.insertExcel9baseinfoList(newResult3);
            }
        }
        if(allExcelTable.getExcel10baseinfoList().size()>0){
            toIndex=20;
            for(int j=0;j<allExcelTable.getExcel10baseinfoList().size();j+=20  ){
                if(j+20>allExcelTable.getExcel10baseinfoList().size()){
                    toIndex=allExcelTable.getExcel10baseinfoList().size()-j;
                }
                List newResult3 = allExcelTable.getExcel10baseinfoList().subList(j,j+toIndex);
                excel10baseinfoMapper.insertExcel10baseinfoList(newResult3);
            }
        }
        if(allExcelTable.getExcel11baseinfoList().size()>0){
            toIndex=20;
            for(int j=0;j<allExcelTable.getExcel11baseinfoList().size();j+=20  ){
                if(j+20>allExcelTable.getExcel11baseinfoList().size()){
                    toIndex=allExcelTable.getExcel11baseinfoList().size()-j;
                }
                List newResult3 = allExcelTable.getExcel11baseinfoList().subList(j,j+toIndex);
                excel11baseinfoMapper.insertExcel11baseinfoList(newResult3);
            }
        }
        if(allExcelTable.getExcel12baseinfoList().size()>0){
            toIndex=20;
            for(int j=0;j<allExcelTable.getExcel12baseinfoList().size();j+=20  ){
                if(j+20>allExcelTable.getExcel12baseinfoList().size()){
                    toIndex=allExcelTable.getExcel12baseinfoList().size()-j;
                }
                List newResult3 = allExcelTable.getExcel12baseinfoList().subList(j,j+toIndex);
                excel12baseinfoMapper.insertExcel12baseinfoList(newResult3);
            }
        }
        if(allExcelTable.getExcel13baseinfoList().size()>0){
            toIndex=20;
            for(int j=0;j<allExcelTable.getExcel13baseinfoList().size();j+=20  ){
                if(j+20>allExcelTable.getExcel13baseinfoList().size()){
                    toIndex=allExcelTable.getExcel13baseinfoList().size()-j;
                }
                List newResult3 = allExcelTable.getExcel13baseinfoList().subList(j,j+toIndex);
                excel13baseinfoMapper.insertExcel13baseinfoList(newResult3);
            }
        }
        if(allExcelTable.getExcel14baseinfoList().size()>0){
            toIndex=20;
            for(int j=0;j<allExcelTable.getExcel14baseinfoList().size();j+=20  ){
                if(j+20>allExcelTable.getExcel14baseinfoList().size()){
                    toIndex=allExcelTable.getExcel14baseinfoList().size()-j;
                }
                List newResult3 = allExcelTable.getExcel14baseinfoList().subList(j,j+toIndex);
                excel14baseinfoMapper.insertExcel14baseinfoList(newResult3);
            }
        }
        if(allExcelTable.getExcel15baseinfoList().size()>0){
            toIndex=20;
            for(int j=0;j<allExcelTable.getExcel15baseinfoList().size();j+=20  ){
                if(j+20>allExcelTable.getExcel15baseinfoList().size()){
                    toIndex=allExcelTable.getExcel15baseinfoList().size()-j;
                }
                List newResult3 = allExcelTable.getExcel15baseinfoList().subList(j,j+toIndex);
                excel15baseinfoMapper.insertExcel15baseinfoList(newResult3);
            }
        }
        if(allExcelTable.getExcel16baseinfoList().size()>0){
            toIndex=20;
            for(int j=0;j<allExcelTable.getExcel16baseinfoList().size();j+=20  ){
                if(j+20>allExcelTable.getExcel16baseinfoList().size()){
                    toIndex=allExcelTable.getExcel16baseinfoList().size()-j;
                }
                List newResult3 = allExcelTable.getExcel16baseinfoList().subList(j,j+toIndex);
                excel16baseinfoMapper.insertExcel16baseinfoList(newResult3);
            }
        }
        if(allExcelTable.getExcel17baseinfoList().size()>0){
            toIndex=20;
            for(int j=0;j<allExcelTable.getExcel17baseinfoList().size();j+=20  ){
                if(j+20>allExcelTable.getExcel17baseinfoList().size()){
                    toIndex=allExcelTable.getExcel17baseinfoList().size()-j;
                }
                List newResult3 = allExcelTable.getExcel17baseinfoList().subList(j,j+toIndex);
                excel17baseinfoMapper.insertExcel17baseinfoList(newResult3);
            }
        }
        if(allExcelTable.getExcel18baseinfoList().size()>0){
            toIndex=20;
            for(int j=0;j<allExcelTable.getExcel18baseinfoList().size();j+=20  ){
                if(j+20>allExcelTable.getExcel18baseinfoList().size()){
                    toIndex=allExcelTable.getExcel18baseinfoList().size()-j;
                }
                List newResult3 = allExcelTable.getExcel18baseinfoList().subList(j,j+toIndex);
                excel18baseinfoMapper.insertExcel18baseinfoList(newResult3);
            }
        }
        if(allExcelTable.getExcel19baseinfoList().size()>0){
            toIndex=20;
            for(int j=0;j<allExcelTable.getExcel19baseinfoList().size();j+=20  ){
                if(j+20>allExcelTable.getExcel19baseinfoList().size()){
                    toIndex=allExcelTable.getExcel19baseinfoList().size()-j;
                }
                List newResult3 = allExcelTable.getExcel19baseinfoList().subList(j,j+toIndex);
                excel19baseinfoMapper.insertExcel19baseinfoList(newResult3);
            }
        }
        if(allExcelTable.getExcel20baseinfoList().size()>0){
            toIndex=20;
            for(int j=0;j<allExcelTable.getExcel20baseinfoList().size();j+=20  ){
                if(j+20>allExcelTable.getExcel20baseinfoList().size()){
                    toIndex=allExcelTable.getExcel20baseinfoList().size()-j;
                }
                List newResult3 = allExcelTable.getExcel20baseinfoList().subList(j,j+toIndex);
                excel20baseinfoMapper.insertExcel20baseinfoList(newResult3);
            }
        }
        if(allExcelTable.getExcel21baseinfoList().size()>0){
            toIndex=20;
            for(int j=0;j<allExcelTable.getExcel21baseinfoList().size();j+=20  ){
                if(j+20>allExcelTable.getExcel21baseinfoList().size()){
                    toIndex=allExcelTable.getExcel21baseinfoList().size()-j;
                }
                List newResult3 = allExcelTable.getExcel21baseinfoList().subList(j,j+toIndex);
                excel21baseinfoMapper.insertExcel21baseinfoList(newResult3);
            }
        }
        if(allExcelTable.getExcel22baseinfoList().size()>0){
            toIndex=20;
            for(int j=0;j<allExcelTable.getExcel22baseinfoList().size();j+=20  ){
                if(j+20>allExcelTable.getExcel22baseinfoList().size()){
                    toIndex=allExcelTable.getExcel22baseinfoList().size()-j;
                }
                List newResult3 = allExcelTable.getExcel22baseinfoList().subList(j,j+toIndex);
                excel22baseinfoMapper.insertExcel22baseinfoList(newResult3);
            }
        }
        if(allExcelTable.getExcel23baseinfoList().size()>0){
            toIndex=20;
            for(int j=0;j<allExcelTable.getExcel23baseinfoList().size();j+=20  ){
                if(j+20>allExcelTable.getExcel23baseinfoList().size()){
                    toIndex=allExcelTable.getExcel23baseinfoList().size()-j;
                }
                List newResult3 = allExcelTable.getExcel23baseinfoList().subList(j,j+toIndex);
                excel23baseinfoMapper.insertExcel23baseinfoList(newResult3);
            }
        }
        if(allExcelTable.getExcel24baseinfoList().size()>0){
            toIndex=20;
            for(int j=0;j<allExcelTable.getExcel24baseinfoList().size();j+=20  ){
                if(j+20>allExcelTable.getExcel24baseinfoList().size()){
                    toIndex=allExcelTable.getExcel24baseinfoList().size()-j;
                }
                List newResult3 = allExcelTable.getExcel24baseinfoList().subList(j,j+toIndex);
                excel24baseinfoMapper.insertExcel24baseinfoList(newResult3);
            }
        }
        if(allExcelTable.getExcel25baseinfoList().size()>0){
            toIndex=20;
            for(int j=0;j<allExcelTable.getExcel25baseinfoList().size();j+=20  ){
                if(j+20>allExcelTable.getExcel25baseinfoList().size()){
                    toIndex=allExcelTable.getExcel25baseinfoList().size()-j;
                }
                List newResult3 = allExcelTable.getExcel25baseinfoList().subList(j,j+toIndex);
                excel25baseinfoMapper.insertExcel25baseinfoList(newResult3);
            }
        }
        if(allExcelTable.getExcel26baseinfoList().size()>0){
            toIndex=20;
            for(int j=0;j<allExcelTable.getExcel26baseinfoList().size();j+=20  ){
                if(j+20>allExcelTable.getExcel26baseinfoList().size()){
                    toIndex=allExcelTable.getExcel26baseinfoList().size()-j;
                }
                List newResult3 = allExcelTable.getExcel26baseinfoList().subList(j,j+toIndex);
                excel26baseinfoMapper.insertExcel26baseinfoList(newResult3);
            }
        }

        if(allExcelTable.getExcel2dataList().size()>0){
            toIndex=20;
            for(int j=0;j<allExcelTable.getExcel2dataList().size();j+=20  ) {
                if (j + 20 > allExcelTable.getExcel2dataList().size()) {
                    toIndex = allExcelTable.getExcel2dataList().size() - j;
                }
                List newResult3 = allExcelTable.getExcel2dataList().subList(j, j + toIndex);
                excel2dataMapper.insertExcel2dataList(newResult3);
            }
        }
        if(allExcelTable.getExcel3dataList().size()>0){
            toIndex=20;
            for(int j=0;j<allExcelTable.getExcel3dataList().size();j+=20  ){
                if(j+20>allExcelTable.getExcel3dataList().size()){
                    toIndex=allExcelTable.getExcel3dataList().size()-j;
                }
                List newResult3 = allExcelTable.getExcel3dataList().subList(j,j+toIndex);
                excel3dataMapper.insertExcel3dataList(newResult3);
            }
        }
        if(allExcelTable.getExcel4dataList().size()>0){
            toIndex=20;
            for(int j=0;j<allExcelTable.getExcel4dataList().size();j+=20  ){
                if(j+20>allExcelTable.getExcel4dataList().size()){
                    toIndex=allExcelTable.getExcel4dataList().size()-j;
                }
                List newResult3 = allExcelTable.getExcel4dataList().subList(j,j+toIndex);
                excel4dataMapper.insertExcel4dataList(newResult3);
            }
        }
        if(allExcelTable.getExcel6dataList().size()>0){
            toIndex=20;
            for(int j=0;j<allExcelTable.getExcel6dataList().size();j+=20  ){
                if(j+20>allExcelTable.getExcel6dataList().size()){
                    toIndex=allExcelTable.getExcel6dataList().size()-j;
                }
                List newResult3 = allExcelTable.getExcel6dataList().subList(j,j+toIndex);
                excel6dataMapper.insertExcel6dataList(newResult3);
            }
        }
        if(allExcelTable.getExcel7dataList().size()>0){
            toIndex=20;
            for(int j=0;j<allExcelTable.getExcel7dataList().size();j+=20  ){
                if(j+20>allExcelTable.getExcel7dataList().size()){
                    toIndex=allExcelTable.getExcel7dataList().size()-j;
                }
                List newResult3 = allExcelTable.getExcel7dataList().subList(j,j+toIndex);
                excel7dataMapper.insertExcel7dataList(newResult3);
            }
        }
        if(allExcelTable.getExcel8dataList().size()>0){
            toIndex=20;
            for(int j=0;j<allExcelTable.getExcel8dataList().size();j+=20  ){
                if(j+20>allExcelTable.getExcel8dataList().size()){
                    toIndex=allExcelTable.getExcel8dataList().size()-j;
                }
                List newResult3 = allExcelTable.getExcel8dataList().subList(j,j+toIndex);
                excel8dataMapper.insertExcel8dataList(newResult3);
            }
        }
        if(allExcelTable.getExcel10dataList().size()>0){
            toIndex=20;
            for(int j=0;j<allExcelTable.getExcel10dataList().size();j+=20  ){
                if(j+20>allExcelTable.getExcel10dataList().size()){
                    toIndex=allExcelTable.getExcel10dataList().size()-j;
                }
                List newResult3 = allExcelTable.getExcel10dataList().subList(j,j+toIndex);
                excel10dataMapper.insertExcel10dataList(newResult3);
            }
        }
        if(allExcelTable.getExcel11dataList().size()>0){
            toIndex=20;
            for(int j=0;j<allExcelTable.getExcel11dataList().size();j+=20  ){
                if(j+20>allExcelTable.getExcel11dataList().size()){
                    toIndex=allExcelTable.getExcel11dataList().size()-j;
                }
                List newResult3 = allExcelTable.getExcel11dataList().subList(j,j+toIndex);
                excel11dataMapper.insertExcel11dataList(newResult3);
            }
        }
        if(allExcelTable.getExcel12dataList().size()>0){
            toIndex=20;
            for(int j=0;j<allExcelTable.getExcel12dataList().size();j+=20  ) {
                if (j + 20 > allExcelTable.getExcel12dataList().size()) {
                    toIndex = allExcelTable.getExcel12dataList().size() - j;
                }
                List newResult3 = allExcelTable.getExcel12dataList().subList(j, j + toIndex);
                excel12dataMapper.insertExcel12dataList(newResult3);
            }
        }
        if(allExcelTable.getExcel14dataList().size()>0){
            toIndex=20;
            for(int j=0;j<allExcelTable.getExcel14dataList().size();j+=20  ){
                if(j+20>allExcelTable.getExcel14dataList().size()){
                    toIndex=allExcelTable.getExcel14dataList().size()-j;
                }
                List newResult3 = allExcelTable.getExcel14dataList().subList(j,j+toIndex);
                excel14dataMapper.insertExcel14dataList(newResult3);
            }
        }
        if(allExcelTable.getExcel15dataList().size()>0){
            toIndex=20;
            for(int j=0;j<allExcelTable.getExcel15dataList().size();j+=20  ){
                if(j+20>allExcelTable.getExcel15dataList().size()){
                    toIndex=allExcelTable.getExcel15dataList().size()-j;
                }
                List newResult3 = allExcelTable.getExcel15dataList().subList(j,j+toIndex);
                excel15dataMapper.insertExcel15dataList(newResult3);
            }
        }
        if(allExcelTable.getExcel16dataList().size()>0){
            toIndex=20;
            for(int j=0;j<allExcelTable.getExcel16dataList().size();j+=20  ){
                if(j+20>allExcelTable.getExcel16dataList().size()){
                    toIndex=allExcelTable.getExcel16dataList().size()-j;
                }
                List newResult3 = allExcelTable.getExcel16dataList().subList(j,j+toIndex);
                excel16dataMapper.insertExcel16dataList(newResult3);
            }
        }
        if(allExcelTable.getExcel17dataList().size()>0){
            toIndex=20;
            for(int j=0;j<allExcelTable.getExcel17dataList().size();j+=20  ){
                if(j+20>allExcelTable.getExcel17dataList().size()){
                    toIndex=allExcelTable.getExcel17dataList().size()-j;
                }
                List newResult3 = allExcelTable.getExcel17dataList().subList(j,j+toIndex);
                excel17dataMapper.insertExcel17dataList(newResult3);
            }
        }
        if(allExcelTable.getExcel18dataList().size()>0){
            toIndex=20;
            for(int j=0;j<allExcelTable.getExcel18dataList().size();j+=20  ){
                if(j+20>allExcelTable.getExcel18dataList().size()){
                    toIndex=allExcelTable.getExcel18dataList().size()-j;
                }
                List newResult3 = allExcelTable.getExcel18dataList().subList(j,j+toIndex);
                excel18dataMapper.insertExcel18dataList(newResult3);
            }
        }
        if(allExcelTable.getExcel19dataList().size()>0){
            toIndex=20;
            for(int j=0;j<allExcelTable.getExcel19dataList().size();j+=20  ){
                if(j+20>allExcelTable.getExcel19dataList().size()){
                    toIndex=allExcelTable.getExcel19dataList().size()-j;
                }
                List newResult3 = allExcelTable.getExcel19dataList().subList(j,j+toIndex);
                excel19dataMapper.insertExcel19dataList(newResult3);
            }
        }
        if(allExcelTable.getExcel20dataList().size()>0){
            toIndex=20;
            for(int j=0;j<allExcelTable.getExcel20dataList().size();j+=20  ){
                if(j+20>allExcelTable.getExcel20dataList().size()){
                    toIndex=allExcelTable.getExcel20dataList().size()-j;
                }
                List newResult3 = allExcelTable.getExcel20dataList().subList(j,j+toIndex);
                excel20dataMapper.insertExcel20dataList(newResult3);
            }
        }
        if(allExcelTable.getExcel21dataList().size()>0){
            toIndex=20;
            for(int j=0;j<allExcelTable.getExcel21dataList().size();j+=20  ){
                if(j+20>allExcelTable.getExcel21dataList().size()){
                    toIndex=allExcelTable.getExcel21dataList().size()-j;
                }
                List newResult3 = allExcelTable.getExcel21dataList().subList(j,j+toIndex);
                excel21dataMapper.insertExcel21dataList(newResult3);
            }
        }
        if(allExcelTable.getExcel22dataList().size()>0){
            toIndex=20;
            for(int j=0;j<allExcelTable.getExcel22dataList().size();j+=20  ){
                if(j+20>allExcelTable.getExcel22dataList().size()){
                    toIndex=allExcelTable.getExcel22dataList().size()-j;
                }
                List newResult3 = allExcelTable.getExcel22dataList().subList(j,j+toIndex);
                excel22dataMapper.insertExcel22dataList(newResult3);
            }
        }
        if(allExcelTable.getExcel23dataList().size()>0){
            toIndex=20;
            for(int j=0;j<allExcelTable.getExcel23dataList().size();j+=20  ){
                if(j+20>allExcelTable.getExcel23dataList().size()){
                    toIndex=allExcelTable.getExcel23dataList().size()-j;
                }
                List newResult3 = allExcelTable.getExcel23dataList().subList(j,j+toIndex);
                excel23dataMapper.insertExcel23dataList(newResult3);
            }
        }
        if(allExcelTable.getExcel24dataList().size()>0){
            toIndex=20;
            for(int j=0;j<allExcelTable.getExcel24dataList().size();j+=20  ){
                if(j+20>allExcelTable.getExcel24dataList().size()){
                    toIndex=allExcelTable.getExcel24dataList().size()-j;
                }
                List newResult3 = allExcelTable.getExcel24dataList().subList(j,j+toIndex);
                excel24dataMapper.insertExcel24dataList(newResult3);
            }
        }
        if(allExcelTable.getExcel25dataList().size()>0){
            toIndex=20;
            for(int j=0;j<allExcelTable.getExcel25dataList().size();j+=20  ){
                if(j+20>allExcelTable.getExcel25dataList().size()){
                    toIndex=allExcelTable.getExcel25dataList().size()-j;
                }
                List newResult3 = allExcelTable.getExcel25dataList().subList(j,j+toIndex);
                excel25dataMapper.insertExcel25dataList(newResult3);
            }
        }
        if(allExcelTable.getExcel26dataList().size()>0){
            toIndex=20;
            for(int j=0;j<allExcelTable.getExcel26dataList().size();j+=20  ){
                if(j+20>allExcelTable.getExcel26dataList().size()){
                    toIndex=allExcelTable.getExcel26dataList().size()-j;
                }
                List newResult3 = allExcelTable.getExcel26dataList().subList(j,j+toIndex);
                excel26dataMapper.insertExcel26dataList(newResult3);
            }
        }



        if(allExcelTable.getExcel1procedureList().size()>0){
            toIndex=20;
            for(int j=0;j<allExcelTable.getExcel1procedureList().size();j+=20  ){
                if(j+20>allExcelTable.getExcel1procedureList().size()){
                    toIndex=allExcelTable.getExcel1procedureList().size()-j;
                }
                List newResult3 = allExcelTable.getExcel1procedureList().subList(j,j+toIndex);
                excel1procedureMapper.insertExcel1procedureList(newResult3);
            }
        }
        if(allExcelTable.getExcel5procedureList().size()>0){
            toIndex=20;
            for(int j=0;j<allExcelTable.getExcel5procedureList().size();j+=20  ){
                if(j+20>allExcelTable.getExcel5procedureList().size()){
                    toIndex=allExcelTable.getExcel5procedureList().size()-j;
                }
                List newResult3 = allExcelTable.getExcel5procedureList().subList(j,j+toIndex);
                excel5procedureMapper.insertExcel5procedureList(newResult3);
            }
        }
        if(allExcelTable.getExcel9procedureList().size()>0){
            toIndex=20;
            for(int j=0;j<allExcelTable.getExcel9procedureList().size();j+=20  ){
                if(j+20>allExcelTable.getExcel9procedureList().size()){
                    toIndex=allExcelTable.getExcel9procedureList().size()-j;
                }
                List newResult3 = allExcelTable.getExcel9procedureList().subList(j,j+toIndex);
                excel9procedureMapper.insertExcel9procedureList(newResult3);
            }
        }
        if(allExcelTable.getExcel13procedureList().size()>0){
            toIndex=20;
            for(int j=0;j<allExcelTable.getExcel13procedureList().size();j+=20  ){
                if(j+20>allExcelTable.getExcel13procedureList().size()){
                    toIndex=allExcelTable.getExcel13procedureList().size()-j;
                }
                List newResult3 = allExcelTable.getExcel13procedureList().subList(j,j+toIndex);
                excel13procedureMapper.insertExcel13procedureList(newResult3);
            }
        }

        if(allExcelTable.getExcel3selectList().size()>0){
            toIndex=20;
            for(int j=0;j<allExcelTable.getExcel3selectList().size();j+=20  ){
                if(j+20>allExcelTable.getExcel3selectList().size()){
                    toIndex=allExcelTable.getExcel3selectList().size()-j;
                }
                List newResult3 = allExcelTable.getExcel3selectList().subList(j,j+toIndex);
                excel3selectMapper.insertExcel3selectList(newResult3);
            }
        }
        if(allExcelTable.getExcel7selectList().size()>0){
            toIndex=20;
            for(int j=0;j<allExcelTable.getExcel7selectList().size();j+=20  ){
                if(j+20>allExcelTable.getExcel7selectList().size()){
                    toIndex=allExcelTable.getExcel7selectList().size()-j;
                }
                List newResult3 = allExcelTable.getExcel7selectList().subList(j,j+toIndex);
                excel7selectMapper.insertExcel7selectList(newResult3);
            }
        }
        if(allExcelTable.getExcel11selectList().size()>0){
            toIndex=20;
            for(int j=0;j<allExcelTable.getExcel11selectList().size();j+=20  ){
                if(j+20>allExcelTable.getExcel11selectList().size()){
                    toIndex=allExcelTable.getExcel11selectList().size()-j;
                }
                List newResult3 = allExcelTable.getExcel11selectList().subList(j,j+toIndex);
                excel11selectMapper.insertExcel11selectList(newResult3);
            }
        }
        if(allExcelTable.getExcel15selectList().size()>0){
            toIndex=20;
            for(int j=0;j<allExcelTable.getExcel15selectList().size();j+=20  ){
                if(j+20>allExcelTable.getExcel15selectList().size()){
                    toIndex=allExcelTable.getExcel15selectList().size()-j;
                }
                List newResult3 = allExcelTable.getExcel15selectList().subList(j,j+toIndex);
                excel15selectMapper.insertExcel15selectList(newResult3);
            }
        }
        if(allExcelTable.getExcel24selectList().size()>0){
            toIndex=20;
            for(int j=0;j<allExcelTable.getExcel24selectList().size();j+=20  ){
                if(j+20>allExcelTable.getExcel24selectList().size()){
                    toIndex=allExcelTable.getExcel24selectList().size()-j;
                }
                List newResult3 = allExcelTable.getExcel24selectList().subList(j,j+toIndex);
                excel24selectMapper.insertExcel24selectList(newResult3);
            }
        }


        if(allExcelTable.getExcel4beginendList().size()>0){
            toIndex=20;
            for(int j=0;j<allExcelTable.getExcel4beginendList().size();j+=20  ){
                if(j+20>allExcelTable.getExcel4beginendList().size()){
                    toIndex=allExcelTable.getExcel4beginendList().size()-j;
                }
                List newResult3 = allExcelTable.getExcel4beginendList().subList(j,j+toIndex);
                excel4beginendMapper.insertExcel4beginendList(newResult3);
            }
        }
        if(allExcelTable.getExcel8beginendList().size()>0){
            toIndex=20;
            for(int j=0;j<allExcelTable.getExcel8beginendList().size();j+=20  ){
                if(j+20>allExcelTable.getExcel8beginendList().size()){
                    toIndex=allExcelTable.getExcel8beginendList().size()-j;
                }
                List newResult3 = allExcelTable.getExcel8beginendList().subList(j,j+toIndex);
                excel8beginendMapper.insertExcel8beginendList(newResult3);
            }
        }
        if(allExcelTable.getExcel12beginendList().size()>0){
            toIndex=20;
            for(int j=0;j<allExcelTable.getExcel12beginendList().size();j+=20  ){
                if(j+20>allExcelTable.getExcel12beginendList().size()){
                    toIndex=allExcelTable.getExcel12beginendList().size()-j;
                }
                List newResult3 = allExcelTable.getExcel12beginendList().subList(j,j+toIndex);
                excel12beginendMapper.insertExcel12beginendList(newResult3);
            }
        }
        if(allExcelTable.getExcel16beginendList().size()>0){
            toIndex=20;
            for(int j=0;j<allExcelTable.getExcel16beginendList().size();j+=20  ){
                if(j+20>allExcelTable.getExcel16beginendList().size()){
                    toIndex=allExcelTable.getExcel16beginendList().size()-j;
                }
                List newResult3 = allExcelTable.getExcel16beginendList().subList(j,j+toIndex);
                excel16beginendMapper.insertExcel16beginendList(newResult3);
            }
        }


        return 0;
    }

    @Override
    public AllExcelTable compare2TableTo1(AllExcelTable allExcelTable1, AllExcelTable allExcelTable2) {
        AllExcelTable allExcelTable3 = new AllExcelTable();
        DbContextHolder.setDbType(DBTypeEnum.db5);
        int tableno = primarytableMapper.selectTop1TableNo();
        if(allExcelTable1.getExcel1baseinfoList()==null&&allExcelTable2.getExcel1baseinfoList()!=null){
            allExcelTable3=allExcelTable2;
            return allExcelTable3;
        }else if(allExcelTable2.getExcel1baseinfoList()==null&&allExcelTable1.getExcel1baseinfoList()!=null){
            allExcelTable3=allExcelTable1;
            return allExcelTable3;
        }else if(allExcelTable2.getExcel1baseinfoList()==null&&allExcelTable1.getExcel1baseinfoList()==null){
            return allExcelTable3;
        }
        if(tableno==1){
            if(allExcelTable1.getExcel1baseinfoList().size()>=allExcelTable2.getExcel1baseinfoList().size()){
                allExcelTable3.setExcel1baseinfoList(allExcelTable1.getExcel1baseinfoList());
            }else{
                allExcelTable3.setExcel1baseinfoList(allExcelTable2.getExcel1baseinfoList());
            }

            if(allExcelTable1.getExcel2baseinfoList().size()>=allExcelTable2.getExcel2baseinfoList().size()){
                allExcelTable3.setExcel2baseinfoList(allExcelTable1.getExcel2baseinfoList());
            }else{
                allExcelTable3.setExcel2baseinfoList(allExcelTable2.getExcel2baseinfoList());
            }

            if(allExcelTable1.getExcel3baseinfoList().size()>=allExcelTable2.getExcel3baseinfoList().size()){
                allExcelTable3.setExcel3baseinfoList(allExcelTable1.getExcel3baseinfoList());
            }else{
                allExcelTable3.setExcel3baseinfoList(allExcelTable2.getExcel3baseinfoList());
            }

            if(allExcelTable1.getExcel4baseinfoList().size()>=allExcelTable2.getExcel4baseinfoList().size()){
                allExcelTable3.setExcel4baseinfoList(allExcelTable1.getExcel4baseinfoList());
            }else{
                allExcelTable3.setExcel4baseinfoList(allExcelTable2.getExcel4baseinfoList());
            }

            if(allExcelTable1.getExcel5baseinfoList().size()>=allExcelTable2.getExcel5baseinfoList().size()){
                allExcelTable3.setExcel5baseinfoList(allExcelTable1.getExcel5baseinfoList());
            }else{
                allExcelTable3.setExcel5baseinfoList(allExcelTable2.getExcel5baseinfoList());
            }

            if(allExcelTable1.getExcel6baseinfoList().size()>=allExcelTable2.getExcel6baseinfoList().size()){
                allExcelTable3.setExcel6baseinfoList(allExcelTable1.getExcel6baseinfoList());
            }else{
                allExcelTable3.setExcel6baseinfoList(allExcelTable2.getExcel6baseinfoList());
            }

            if(allExcelTable1.getExcel7baseinfoList().size()>=allExcelTable2.getExcel7baseinfoList().size()){
                allExcelTable3.setExcel7baseinfoList(allExcelTable1.getExcel7baseinfoList());
            }else{
                allExcelTable3.setExcel7baseinfoList(allExcelTable2.getExcel7baseinfoList());
            }

            if(allExcelTable1.getExcel8baseinfoList().size()>=allExcelTable2.getExcel8baseinfoList().size()){
                allExcelTable3.setExcel8baseinfoList(allExcelTable1.getExcel8baseinfoList());
            }else{
                allExcelTable3.setExcel8baseinfoList(allExcelTable2.getExcel8baseinfoList());
            }

            if(allExcelTable1.getExcel9baseinfoList().size()>=allExcelTable2.getExcel9baseinfoList().size()){
                allExcelTable3.setExcel9baseinfoList(allExcelTable1.getExcel9baseinfoList());
            }else{
                allExcelTable3.setExcel9baseinfoList(allExcelTable2.getExcel9baseinfoList());
            }

            if(allExcelTable1.getExcel10baseinfoList().size()>=allExcelTable2.getExcel10baseinfoList().size()){
                allExcelTable3.setExcel10baseinfoList(allExcelTable1.getExcel10baseinfoList());
            }else{
                allExcelTable3.setExcel10baseinfoList(allExcelTable2.getExcel10baseinfoList());
            }

            if(allExcelTable1.getExcel11baseinfoList().size()>=allExcelTable2.getExcel11baseinfoList().size()){
                allExcelTable3.setExcel11baseinfoList(allExcelTable1.getExcel11baseinfoList());
            }else{
                allExcelTable3.setExcel11baseinfoList(allExcelTable2.getExcel11baseinfoList());
            }

            if(allExcelTable1.getExcel12baseinfoList().size()>=allExcelTable2.getExcel12baseinfoList().size()){
                allExcelTable3.setExcel12baseinfoList(allExcelTable1.getExcel12baseinfoList());
            }else{
                allExcelTable3.setExcel12baseinfoList(allExcelTable2.getExcel12baseinfoList());
            }

            if(allExcelTable1.getExcel13baseinfoList().size()>=allExcelTable2.getExcel13baseinfoList().size()){
                allExcelTable3.setExcel13baseinfoList(allExcelTable1.getExcel13baseinfoList());
            }else{
                allExcelTable3.setExcel13baseinfoList(allExcelTable2.getExcel13baseinfoList());
            }

            if(allExcelTable1.getExcel14baseinfoList().size()>=allExcelTable2.getExcel14baseinfoList().size()){
                allExcelTable3.setExcel14baseinfoList(allExcelTable1.getExcel14baseinfoList());
            }else{
                allExcelTable3.setExcel14baseinfoList(allExcelTable2.getExcel14baseinfoList());
            }

            if(allExcelTable1.getExcel15baseinfoList().size()>=allExcelTable2.getExcel15baseinfoList().size()){
                allExcelTable3.setExcel15baseinfoList(allExcelTable1.getExcel15baseinfoList());
            }else{
                allExcelTable3.setExcel15baseinfoList(allExcelTable2.getExcel15baseinfoList());
            }

            if(allExcelTable1.getExcel16baseinfoList().size()>=allExcelTable2.getExcel16baseinfoList().size()){
                allExcelTable3.setExcel16baseinfoList(allExcelTable1.getExcel16baseinfoList());
            }else{
                allExcelTable3.setExcel16baseinfoList(allExcelTable2.getExcel16baseinfoList());
            }

            if(allExcelTable1.getExcel17baseinfoList().size()>=allExcelTable2.getExcel17baseinfoList().size()){
                allExcelTable3.setExcel17baseinfoList(allExcelTable1.getExcel17baseinfoList());
            }else{
                allExcelTable3.setExcel17baseinfoList(allExcelTable2.getExcel17baseinfoList());
            }

            if(allExcelTable1.getExcel18baseinfoList().size()>=allExcelTable2.getExcel18baseinfoList().size()){
                allExcelTable3.setExcel18baseinfoList(allExcelTable1.getExcel18baseinfoList());
            }else{
                allExcelTable3.setExcel18baseinfoList(allExcelTable2.getExcel18baseinfoList());
            }

            if(allExcelTable1.getExcel19baseinfoList().size()>=allExcelTable2.getExcel19baseinfoList().size()){
                allExcelTable3.setExcel19baseinfoList(allExcelTable1.getExcel19baseinfoList());
            }else{
                allExcelTable3.setExcel19baseinfoList(allExcelTable2.getExcel19baseinfoList());
            }

            if(allExcelTable1.getExcel20baseinfoList().size()>=allExcelTable2.getExcel20baseinfoList().size()){
                allExcelTable3.setExcel20baseinfoList(allExcelTable1.getExcel20baseinfoList());
            }else{
                allExcelTable3.setExcel20baseinfoList(allExcelTable2.getExcel20baseinfoList());
            }

            if(allExcelTable1.getExcel21baseinfoList().size()>=allExcelTable2.getExcel21baseinfoList().size()){
                allExcelTable3.setExcel21baseinfoList(allExcelTable1.getExcel21baseinfoList());
            }else{
                allExcelTable3.setExcel21baseinfoList(allExcelTable2.getExcel21baseinfoList());
            }

            if(allExcelTable1.getExcel22baseinfoList().size()>=allExcelTable2.getExcel22baseinfoList().size()){
                allExcelTable3.setExcel22baseinfoList(allExcelTable1.getExcel22baseinfoList());
            }else{
                allExcelTable3.setExcel22baseinfoList(allExcelTable2.getExcel22baseinfoList());
            }

            if(allExcelTable1.getExcel23baseinfoList().size()>=allExcelTable2.getExcel23baseinfoList().size()){
                allExcelTable3.setExcel23baseinfoList(allExcelTable1.getExcel23baseinfoList());
            }else{
                allExcelTable3.setExcel23baseinfoList(allExcelTable2.getExcel23baseinfoList());
            }

            if(allExcelTable1.getExcel24baseinfoList().size()>=allExcelTable2.getExcel24baseinfoList().size()){
                allExcelTable3.setExcel24baseinfoList(allExcelTable1.getExcel24baseinfoList());
            }else{
                allExcelTable3.setExcel24baseinfoList(allExcelTable2.getExcel24baseinfoList());
            }

            if(allExcelTable1.getExcel25baseinfoList().size()>=allExcelTable2.getExcel25baseinfoList().size()){
                allExcelTable3.setExcel25baseinfoList(allExcelTable1.getExcel25baseinfoList());
            }else{
                allExcelTable3.setExcel25baseinfoList(allExcelTable2.getExcel25baseinfoList());
            }

            if(allExcelTable1.getExcel26baseinfoList().size()>=allExcelTable2.getExcel26baseinfoList().size()){
                allExcelTable3.setExcel26baseinfoList(allExcelTable1.getExcel26baseinfoList());
            }else{
                allExcelTable3.setExcel26baseinfoList(allExcelTable2.getExcel26baseinfoList());
            }

            if(allExcelTable1.getExcel2dataList().size()>=allExcelTable2.getExcel2dataList().size()){
                allExcelTable3.setExcel2dataList(allExcelTable1.getExcel2dataList());
            }else{
                allExcelTable3.setExcel2dataList(allExcelTable2.getExcel2dataList());
            }

            if(allExcelTable1.getExcel3dataList().size()>=allExcelTable2.getExcel3dataList().size()){
                allExcelTable3.setExcel3dataList(allExcelTable1.getExcel3dataList());
            }else{
                allExcelTable3.setExcel3dataList(allExcelTable2.getExcel3dataList());
            }

            if(allExcelTable1.getExcel4dataList().size()>=allExcelTable2.getExcel4dataList().size()){
                allExcelTable3.setExcel4dataList(allExcelTable1.getExcel4dataList());
            }else{
                allExcelTable3.setExcel4dataList(allExcelTable2.getExcel4dataList());
            }

            if(allExcelTable1.getExcel6dataList().size()>=allExcelTable2.getExcel6dataList().size()){
                allExcelTable3.setExcel6dataList(allExcelTable1.getExcel6dataList());
            }else{
                allExcelTable3.setExcel6dataList(allExcelTable2.getExcel6dataList());
            }

            if(allExcelTable1.getExcel7dataList().size()>=allExcelTable2.getExcel7dataList().size()){
                allExcelTable3.setExcel7dataList(allExcelTable1.getExcel7dataList());
            }else{
                allExcelTable3.setExcel7dataList(allExcelTable2.getExcel7dataList());
            }

            if(allExcelTable1.getExcel8dataList().size()>=allExcelTable2.getExcel8dataList().size()){
                allExcelTable3.setExcel8dataList(allExcelTable1.getExcel8dataList());
            }else{
                allExcelTable3.setExcel8dataList(allExcelTable2.getExcel8dataList());
            }

            if(allExcelTable1.getExcel10dataList().size()>=allExcelTable2.getExcel10dataList().size()){
                allExcelTable3.setExcel10dataList(allExcelTable1.getExcel10dataList());
            }else{
                allExcelTable3.setExcel10dataList(allExcelTable2.getExcel10dataList());
            }

            if(allExcelTable1.getExcel11dataList().size()>=allExcelTable2.getExcel11dataList().size()){
                allExcelTable3.setExcel11dataList(allExcelTable1.getExcel11dataList());
            }else{
                allExcelTable3.setExcel11dataList(allExcelTable2.getExcel11dataList());
            }

            if(allExcelTable1.getExcel12dataList().size()>=allExcelTable2.getExcel12dataList().size()){
                allExcelTable3.setExcel12dataList(allExcelTable1.getExcel12dataList());
            }else{
                allExcelTable3.setExcel12dataList(allExcelTable2.getExcel12dataList());
            }

            if(allExcelTable1.getExcel14dataList().size()>=allExcelTable2.getExcel14dataList().size()){
                allExcelTable3.setExcel14dataList(allExcelTable1.getExcel14dataList());
            }else{
                allExcelTable3.setExcel14dataList(allExcelTable2.getExcel14dataList());
            }

            if(allExcelTable1.getExcel15dataList().size()>=allExcelTable2.getExcel15dataList().size()){
                allExcelTable3.setExcel15dataList(allExcelTable1.getExcel15dataList());
            }else{
                allExcelTable3.setExcel15dataList(allExcelTable2.getExcel15dataList());
            }

            if(allExcelTable1.getExcel16dataList().size()>=allExcelTable2.getExcel16dataList().size()){
                allExcelTable3.setExcel16dataList(allExcelTable1.getExcel16dataList());
            }else{
                allExcelTable3.setExcel16dataList(allExcelTable2.getExcel16dataList());
            }

            if(allExcelTable1.getExcel17dataList().size()>=allExcelTable2.getExcel17dataList().size()){
                allExcelTable3.setExcel17dataList(allExcelTable1.getExcel17dataList());
            }else{
                allExcelTable3.setExcel17dataList(allExcelTable2.getExcel17dataList());
            }

            if(allExcelTable1.getExcel18dataList().size()>=allExcelTable2.getExcel18dataList().size()){
                allExcelTable3.setExcel18dataList(allExcelTable1.getExcel18dataList());
            }else{
                allExcelTable3.setExcel18dataList(allExcelTable2.getExcel18dataList());
            }

            if(allExcelTable1.getExcel19dataList().size()>=allExcelTable2.getExcel19dataList().size()){
                allExcelTable3.setExcel19dataList(allExcelTable1.getExcel19dataList());
            }else{
                allExcelTable3.setExcel19dataList(allExcelTable2.getExcel19dataList());
            }

            if(allExcelTable1.getExcel20dataList().size()>=allExcelTable2.getExcel20dataList().size()){
                allExcelTable3.setExcel20dataList(allExcelTable1.getExcel20dataList());
            }else{
                allExcelTable3.setExcel20dataList(allExcelTable2.getExcel20dataList());
            }

            if(allExcelTable1.getExcel21dataList().size()>=allExcelTable2.getExcel21dataList().size()){
                allExcelTable3.setExcel21dataList(allExcelTable1.getExcel21dataList());
            }else{
                allExcelTable3.setExcel21dataList(allExcelTable2.getExcel21dataList());
            }

            if(allExcelTable1.getExcel22dataList().size()>=allExcelTable2.getExcel22dataList().size()){
                allExcelTable3.setExcel22dataList(allExcelTable1.getExcel22dataList());
            }else{
                allExcelTable3.setExcel22dataList(allExcelTable2.getExcel22dataList());
            }

            if(allExcelTable1.getExcel23dataList().size()>=allExcelTable2.getExcel23dataList().size()){
                allExcelTable3.setExcel23dataList(allExcelTable1.getExcel23dataList());
            }else{
                allExcelTable3.setExcel23dataList(allExcelTable2.getExcel23dataList());
            }

            if(allExcelTable1.getExcel24dataList().size()>=allExcelTable2.getExcel24dataList().size()){
                allExcelTable3.setExcel24dataList(allExcelTable1.getExcel24dataList());
            }else{
                allExcelTable3.setExcel24dataList(allExcelTable2.getExcel24dataList());
            }

            if(allExcelTable1.getExcel25dataList().size()>=allExcelTable2.getExcel25dataList().size()){
                allExcelTable3.setExcel25dataList(allExcelTable1.getExcel25dataList());
            }else{
                allExcelTable3.setExcel25dataList(allExcelTable2.getExcel25dataList());
            }

            if(allExcelTable1.getExcel26dataList().size()>=allExcelTable2.getExcel26dataList().size()){
                allExcelTable3.setExcel26dataList(allExcelTable1.getExcel26dataList());
            }else{
                allExcelTable3.setExcel26dataList(allExcelTable2.getExcel26dataList());
            }

            if(allExcelTable1.getExcel1procedureList().size()>=allExcelTable2.getExcel1procedureList().size()){
                allExcelTable3.setExcel1procedureList(allExcelTable1.getExcel1procedureList());
            }else{
                allExcelTable3.setExcel1procedureList(allExcelTable2.getExcel1procedureList());
            }

            if(allExcelTable1.getExcel5procedureList().size()>=allExcelTable2.getExcel5procedureList().size()){
                allExcelTable3.setExcel5procedureList(allExcelTable1.getExcel5procedureList());
            }else{
                allExcelTable3.setExcel5procedureList(allExcelTable2.getExcel5procedureList());
            }

            if(allExcelTable1.getExcel9procedureList().size()>=allExcelTable2.getExcel9procedureList().size()){
                allExcelTable3.setExcel9procedureList(allExcelTable1.getExcel9procedureList());
            }else{
                allExcelTable3.setExcel9procedureList(allExcelTable2.getExcel9procedureList());
            }

            if(allExcelTable1.getExcel13procedureList().size()>=allExcelTable2.getExcel13procedureList().size()){
                allExcelTable3.setExcel13procedureList(allExcelTable1.getExcel13procedureList());
            }else{
                allExcelTable3.setExcel13procedureList(allExcelTable2.getExcel13procedureList());
            }


            if(allExcelTable1.getExcel3selectList().size()>=allExcelTable2.getExcel3selectList().size()){
                allExcelTable3.setExcel3selectList(allExcelTable1.getExcel3selectList());
            }else{
                allExcelTable3.setExcel3selectList(allExcelTable2.getExcel3selectList());
            }

            if(allExcelTable1.getExcel7selectList().size()>=allExcelTable2.getExcel7selectList().size()){
                allExcelTable3.setExcel7selectList(allExcelTable1.getExcel7selectList());
            }else{
                allExcelTable3.setExcel7selectList(allExcelTable2.getExcel7selectList());
            }

            if(allExcelTable1.getExcel11selectList().size()>=allExcelTable2.getExcel11selectList().size()){
                allExcelTable3.setExcel11selectList(allExcelTable1.getExcel11selectList());
            }else{
                allExcelTable3.setExcel11selectList(allExcelTable2.getExcel11selectList());
            }

            if(allExcelTable1.getExcel15selectList().size()>=allExcelTable2.getExcel15selectList().size()){
                allExcelTable3.setExcel15selectList(allExcelTable1.getExcel15selectList());
            }else{
                allExcelTable3.setExcel15selectList(allExcelTable2.getExcel15selectList());
            }

            if(allExcelTable1.getExcel24selectList().size()>=allExcelTable2.getExcel24selectList().size()){
                allExcelTable3.setExcel24selectList(allExcelTable1.getExcel24selectList());
            }else{
                allExcelTable3.setExcel24selectList(allExcelTable2.getExcel24selectList());
            }



            if(allExcelTable1.getExcel4beginendList().size()>=allExcelTable2.getExcel4beginendList().size()){
                allExcelTable3.setExcel4beginendList(allExcelTable1.getExcel4beginendList());
            }else{
                allExcelTable3.setExcel4beginendList(allExcelTable2.getExcel4beginendList());
            }

            if(allExcelTable1.getExcel8beginendList().size()>=allExcelTable2.getExcel8beginendList().size()){
                allExcelTable3.setExcel8beginendList(allExcelTable1.getExcel8beginendList());
            }else{
                allExcelTable3.setExcel8beginendList(allExcelTable2.getExcel8beginendList());
            }

            if(allExcelTable1.getExcel12beginendList().size()>=allExcelTable2.getExcel12beginendList().size()){
                allExcelTable3.setExcel12beginendList(allExcelTable1.getExcel12beginendList());
            }else{
                allExcelTable3.setExcel12beginendList(allExcelTable2.getExcel12beginendList());
            }

            if(allExcelTable1.getExcel16beginendList().size()>=allExcelTable2.getExcel16beginendList().size()){
                allExcelTable3.setExcel16beginendList(allExcelTable1.getExcel16beginendList());
            }else{
                allExcelTable3.setExcel16beginendList(allExcelTable2.getExcel16beginendList());
            }

        }else if(tableno==2){
            if(allExcelTable2.getExcel1baseinfoList().size()>=allExcelTable1.getExcel1baseinfoList().size()){
                allExcelTable3.setExcel1baseinfoList(allExcelTable2.getExcel1baseinfoList());
            }else{
                allExcelTable3.setExcel1baseinfoList(allExcelTable1.getExcel1baseinfoList());
            }

            if(allExcelTable2.getExcel2baseinfoList().size()>=allExcelTable1.getExcel2baseinfoList().size()){
                allExcelTable3.setExcel2baseinfoList(allExcelTable2.getExcel2baseinfoList());
            }else{
                allExcelTable3.setExcel2baseinfoList(allExcelTable1.getExcel2baseinfoList());
            }

            if(allExcelTable2.getExcel3baseinfoList().size()>=allExcelTable1.getExcel3baseinfoList().size()){
                allExcelTable3.setExcel3baseinfoList(allExcelTable2.getExcel3baseinfoList());
            }else{
                allExcelTable3.setExcel3baseinfoList(allExcelTable1.getExcel3baseinfoList());
            }

            if(allExcelTable2.getExcel4baseinfoList().size()>=allExcelTable1.getExcel4baseinfoList().size()){
                allExcelTable3.setExcel4baseinfoList(allExcelTable2.getExcel4baseinfoList());
            }else{
                allExcelTable3.setExcel4baseinfoList(allExcelTable1.getExcel4baseinfoList());
            }

            if(allExcelTable2.getExcel5baseinfoList().size()>=allExcelTable1.getExcel5baseinfoList().size()){
                allExcelTable3.setExcel5baseinfoList(allExcelTable2.getExcel5baseinfoList());
            }else{
                allExcelTable3.setExcel5baseinfoList(allExcelTable1.getExcel5baseinfoList());
            }

            if(allExcelTable2.getExcel6baseinfoList().size()>=allExcelTable1.getExcel6baseinfoList().size()){
                allExcelTable3.setExcel6baseinfoList(allExcelTable2.getExcel6baseinfoList());
            }else{
                allExcelTable3.setExcel6baseinfoList(allExcelTable1.getExcel6baseinfoList());
            }

            if(allExcelTable2.getExcel7baseinfoList().size()>=allExcelTable1.getExcel7baseinfoList().size()){
                allExcelTable3.setExcel7baseinfoList(allExcelTable2.getExcel7baseinfoList());
            }else{
                allExcelTable3.setExcel7baseinfoList(allExcelTable1.getExcel7baseinfoList());
            }

            if(allExcelTable2.getExcel8baseinfoList().size()>=allExcelTable1.getExcel8baseinfoList().size()){
                allExcelTable3.setExcel8baseinfoList(allExcelTable2.getExcel8baseinfoList());
            }else{
                allExcelTable3.setExcel8baseinfoList(allExcelTable1.getExcel8baseinfoList());
            }

            if(allExcelTable2.getExcel9baseinfoList().size()>=allExcelTable1.getExcel9baseinfoList().size()){
                allExcelTable3.setExcel9baseinfoList(allExcelTable2.getExcel9baseinfoList());
            }else{
                allExcelTable3.setExcel9baseinfoList(allExcelTable1.getExcel9baseinfoList());
            }

            if(allExcelTable2.getExcel10baseinfoList().size()>=allExcelTable1.getExcel10baseinfoList().size()){
                allExcelTable3.setExcel10baseinfoList(allExcelTable2.getExcel10baseinfoList());
            }else{
                allExcelTable3.setExcel10baseinfoList(allExcelTable1.getExcel10baseinfoList());
            }

            if(allExcelTable2.getExcel11baseinfoList().size()>=allExcelTable1.getExcel11baseinfoList().size()){
                allExcelTable3.setExcel11baseinfoList(allExcelTable2.getExcel11baseinfoList());
            }else{
                allExcelTable3.setExcel11baseinfoList(allExcelTable1.getExcel11baseinfoList());
            }

            if(allExcelTable2.getExcel12baseinfoList().size()>=allExcelTable1.getExcel12baseinfoList().size()){
                allExcelTable3.setExcel12baseinfoList(allExcelTable2.getExcel12baseinfoList());
            }else{
                allExcelTable3.setExcel12baseinfoList(allExcelTable1.getExcel12baseinfoList());
            }

            if(allExcelTable2.getExcel13baseinfoList().size()>=allExcelTable1.getExcel13baseinfoList().size()){
                allExcelTable3.setExcel13baseinfoList(allExcelTable2.getExcel13baseinfoList());
            }else{
                allExcelTable3.setExcel13baseinfoList(allExcelTable1.getExcel13baseinfoList());
            }

            if(allExcelTable2.getExcel14baseinfoList().size()>=allExcelTable1.getExcel14baseinfoList().size()){
                allExcelTable3.setExcel14baseinfoList(allExcelTable2.getExcel14baseinfoList());
            }else{
                allExcelTable3.setExcel14baseinfoList(allExcelTable1.getExcel14baseinfoList());
            }

            if(allExcelTable2.getExcel15baseinfoList().size()>=allExcelTable1.getExcel15baseinfoList().size()){
                allExcelTable3.setExcel15baseinfoList(allExcelTable2.getExcel15baseinfoList());
            }else{
                allExcelTable3.setExcel15baseinfoList(allExcelTable1.getExcel15baseinfoList());
            }

            if(allExcelTable2.getExcel16baseinfoList().size()>=allExcelTable1.getExcel16baseinfoList().size()){
                allExcelTable3.setExcel16baseinfoList(allExcelTable2.getExcel16baseinfoList());
            }else{
                allExcelTable3.setExcel16baseinfoList(allExcelTable1.getExcel16baseinfoList());
            }

            if(allExcelTable2.getExcel17baseinfoList().size()>=allExcelTable1.getExcel17baseinfoList().size()){
                allExcelTable3.setExcel17baseinfoList(allExcelTable2.getExcel17baseinfoList());
            }else{
                allExcelTable3.setExcel17baseinfoList(allExcelTable1.getExcel17baseinfoList());
            }

            if(allExcelTable2.getExcel18baseinfoList().size()>=allExcelTable1.getExcel18baseinfoList().size()){
                allExcelTable3.setExcel18baseinfoList(allExcelTable2.getExcel18baseinfoList());
            }else{
                allExcelTable3.setExcel18baseinfoList(allExcelTable1.getExcel18baseinfoList());
            }

            if(allExcelTable2.getExcel19baseinfoList().size()>=allExcelTable1.getExcel19baseinfoList().size()){
                allExcelTable3.setExcel19baseinfoList(allExcelTable2.getExcel19baseinfoList());
            }else{
                allExcelTable3.setExcel19baseinfoList(allExcelTable1.getExcel19baseinfoList());
            }

            if(allExcelTable2.getExcel20baseinfoList().size()>=allExcelTable1.getExcel20baseinfoList().size()){
                allExcelTable3.setExcel20baseinfoList(allExcelTable2.getExcel20baseinfoList());
            }else{
                allExcelTable3.setExcel20baseinfoList(allExcelTable1.getExcel20baseinfoList());
            }

            if(allExcelTable2.getExcel21baseinfoList().size()>=allExcelTable1.getExcel21baseinfoList().size()){
                allExcelTable3.setExcel21baseinfoList(allExcelTable2.getExcel21baseinfoList());
            }else{
                allExcelTable3.setExcel21baseinfoList(allExcelTable1.getExcel21baseinfoList());
            }

            if(allExcelTable2.getExcel22baseinfoList().size()>=allExcelTable1.getExcel22baseinfoList().size()){
                allExcelTable3.setExcel22baseinfoList(allExcelTable2.getExcel22baseinfoList());
            }else{
                allExcelTable3.setExcel22baseinfoList(allExcelTable1.getExcel22baseinfoList());
            }

            if(allExcelTable2.getExcel23baseinfoList().size()>=allExcelTable1.getExcel23baseinfoList().size()){
                allExcelTable3.setExcel23baseinfoList(allExcelTable2.getExcel23baseinfoList());
            }else{
                allExcelTable3.setExcel23baseinfoList(allExcelTable1.getExcel23baseinfoList());
            }

            if(allExcelTable2.getExcel24baseinfoList().size()>=allExcelTable1.getExcel24baseinfoList().size()){
                allExcelTable3.setExcel24baseinfoList(allExcelTable2.getExcel24baseinfoList());
            }else{
                allExcelTable3.setExcel24baseinfoList(allExcelTable1.getExcel24baseinfoList());
            }

            if(allExcelTable2.getExcel25baseinfoList().size()>=allExcelTable1.getExcel25baseinfoList().size()){
                allExcelTable3.setExcel25baseinfoList(allExcelTable2.getExcel25baseinfoList());
            }else{
                allExcelTable3.setExcel25baseinfoList(allExcelTable1.getExcel25baseinfoList());
            }

            if(allExcelTable2.getExcel26baseinfoList().size()>=allExcelTable1.getExcel26baseinfoList().size()){
                allExcelTable3.setExcel26baseinfoList(allExcelTable2.getExcel26baseinfoList());
            }else{
                allExcelTable3.setExcel26baseinfoList(allExcelTable1.getExcel26baseinfoList());
            }

            if(allExcelTable2.getExcel2dataList().size()>=allExcelTable1.getExcel2dataList().size()){
                allExcelTable3.setExcel2dataList(allExcelTable2.getExcel2dataList());
            }else{
                allExcelTable3.setExcel2dataList(allExcelTable1.getExcel2dataList());
            }

            if(allExcelTable2.getExcel3dataList().size()>=allExcelTable1.getExcel3dataList().size()){
                allExcelTable3.setExcel3dataList(allExcelTable2.getExcel3dataList());
            }else{
                allExcelTable3.setExcel3dataList(allExcelTable1.getExcel3dataList());
            }

            if(allExcelTable2.getExcel4dataList().size()>=allExcelTable1.getExcel4dataList().size()){
                allExcelTable3.setExcel4dataList(allExcelTable2.getExcel4dataList());
            }else{
                allExcelTable3.setExcel4dataList(allExcelTable1.getExcel4dataList());
            }

            if(allExcelTable2.getExcel6dataList().size()>=allExcelTable1.getExcel6dataList().size()){
                allExcelTable3.setExcel6dataList(allExcelTable2.getExcel6dataList());
            }else{
                allExcelTable3.setExcel6dataList(allExcelTable1.getExcel6dataList());
            }

            if(allExcelTable2.getExcel7dataList().size()>=allExcelTable1.getExcel7dataList().size()){
                allExcelTable3.setExcel7dataList(allExcelTable2.getExcel7dataList());
            }else{
                allExcelTable3.setExcel7dataList(allExcelTable1.getExcel7dataList());
            }

            if(allExcelTable2.getExcel8dataList().size()>=allExcelTable1.getExcel8dataList().size()){
                allExcelTable3.setExcel8dataList(allExcelTable2.getExcel8dataList());
            }else{
                allExcelTable3.setExcel8dataList(allExcelTable1.getExcel8dataList());
            }

            if(allExcelTable2.getExcel10dataList().size()>=allExcelTable1.getExcel10dataList().size()){
                allExcelTable3.setExcel10dataList(allExcelTable2.getExcel10dataList());
            }else{
                allExcelTable3.setExcel10dataList(allExcelTable1.getExcel10dataList());
            }

            if(allExcelTable2.getExcel11dataList().size()>=allExcelTable1.getExcel11dataList().size()){
                allExcelTable3.setExcel11dataList(allExcelTable2.getExcel11dataList());
            }else{
                allExcelTable3.setExcel11dataList(allExcelTable1.getExcel11dataList());
            }

            if(allExcelTable2.getExcel12dataList().size()>=allExcelTable1.getExcel12dataList().size()){
                allExcelTable3.setExcel12dataList(allExcelTable2.getExcel12dataList());
            }else{
                allExcelTable3.setExcel12dataList(allExcelTable1.getExcel12dataList());
            }

            if(allExcelTable2.getExcel14dataList().size()>=allExcelTable1.getExcel14dataList().size()){
                allExcelTable3.setExcel14dataList(allExcelTable2.getExcel14dataList());
            }else{
                allExcelTable3.setExcel14dataList(allExcelTable1.getExcel14dataList());
            }

            if(allExcelTable2.getExcel15dataList().size()>=allExcelTable1.getExcel15dataList().size()){
                allExcelTable3.setExcel15dataList(allExcelTable2.getExcel15dataList());
            }else{
                allExcelTable3.setExcel15dataList(allExcelTable1.getExcel15dataList());
            }

            if(allExcelTable2.getExcel16dataList().size()>=allExcelTable1.getExcel16dataList().size()){
                allExcelTable3.setExcel16dataList(allExcelTable2.getExcel16dataList());
            }else{
                allExcelTable3.setExcel16dataList(allExcelTable1.getExcel16dataList());
            }

            if(allExcelTable2.getExcel17dataList().size()>=allExcelTable1.getExcel17dataList().size()){
                allExcelTable3.setExcel17dataList(allExcelTable2.getExcel17dataList());
            }else{
                allExcelTable3.setExcel17dataList(allExcelTable1.getExcel17dataList());
            }

            if(allExcelTable2.getExcel18dataList().size()>=allExcelTable1.getExcel18dataList().size()){
                allExcelTable3.setExcel18dataList(allExcelTable2.getExcel18dataList());
            }else{
                allExcelTable3.setExcel18dataList(allExcelTable1.getExcel18dataList());
            }

            if(allExcelTable2.getExcel19dataList().size()>=allExcelTable1.getExcel19dataList().size()){
                allExcelTable3.setExcel19dataList(allExcelTable2.getExcel19dataList());
            }else{
                allExcelTable3.setExcel19dataList(allExcelTable1.getExcel19dataList());
            }

            if(allExcelTable2.getExcel20dataList().size()>=allExcelTable1.getExcel20dataList().size()){
                allExcelTable3.setExcel20dataList(allExcelTable2.getExcel20dataList());
            }else{
                allExcelTable3.setExcel20dataList(allExcelTable1.getExcel20dataList());
            }

            if(allExcelTable2.getExcel21dataList().size()>=allExcelTable1.getExcel21dataList().size()){
                allExcelTable3.setExcel21dataList(allExcelTable2.getExcel21dataList());
            }else{
                allExcelTable3.setExcel21dataList(allExcelTable1.getExcel21dataList());
            }

            if(allExcelTable2.getExcel22dataList().size()>=allExcelTable1.getExcel22dataList().size()){
                allExcelTable3.setExcel22dataList(allExcelTable2.getExcel22dataList());
            }else{
                allExcelTable3.setExcel22dataList(allExcelTable1.getExcel22dataList());
            }

            if(allExcelTable2.getExcel23dataList().size()>=allExcelTable1.getExcel23dataList().size()){
                allExcelTable3.setExcel23dataList(allExcelTable2.getExcel23dataList());
            }else{
                allExcelTable3.setExcel23dataList(allExcelTable1.getExcel23dataList());
            }

            if(allExcelTable2.getExcel24dataList().size()>=allExcelTable1.getExcel24dataList().size()){
                allExcelTable3.setExcel24dataList(allExcelTable2.getExcel24dataList());
            }else{
                allExcelTable3.setExcel24dataList(allExcelTable1.getExcel24dataList());
            }

            if(allExcelTable2.getExcel25dataList().size()>=allExcelTable1.getExcel25dataList().size()){
                allExcelTable3.setExcel25dataList(allExcelTable2.getExcel25dataList());
            }else{
                allExcelTable3.setExcel25dataList(allExcelTable1.getExcel25dataList());
            }

            if(allExcelTable2.getExcel26dataList().size()>=allExcelTable1.getExcel26dataList().size()){
                allExcelTable3.setExcel26dataList(allExcelTable2.getExcel26dataList());
            }else{
                allExcelTable3.setExcel26dataList(allExcelTable1.getExcel26dataList());
            }

            if(allExcelTable2.getExcel1procedureList().size()>=allExcelTable1.getExcel1procedureList().size()){
                allExcelTable3.setExcel1procedureList(allExcelTable2.getExcel1procedureList());
            }else{
                allExcelTable3.setExcel1procedureList(allExcelTable1.getExcel1procedureList());
            }

            if(allExcelTable2.getExcel5procedureList().size()>=allExcelTable1.getExcel5procedureList().size()){
                allExcelTable3.setExcel5procedureList(allExcelTable2.getExcel5procedureList());
            }else{
                allExcelTable3.setExcel5procedureList(allExcelTable1.getExcel5procedureList());
            }

            if(allExcelTable2.getExcel9procedureList().size()>=allExcelTable1.getExcel9procedureList().size()){
                allExcelTable3.setExcel9procedureList(allExcelTable2.getExcel9procedureList());
            }else{
                allExcelTable3.setExcel9procedureList(allExcelTable1.getExcel9procedureList());
            }

            if(allExcelTable2.getExcel13procedureList().size()>=allExcelTable1.getExcel13procedureList().size()){
                allExcelTable3.setExcel13procedureList(allExcelTable2.getExcel13procedureList());
            }else{
                allExcelTable3.setExcel13procedureList(allExcelTable1.getExcel13procedureList());
            }


            if(allExcelTable2.getExcel3selectList().size()>=allExcelTable1.getExcel3selectList().size()){
                allExcelTable3.setExcel3selectList(allExcelTable2.getExcel3selectList());
            }else{
                allExcelTable3.setExcel3selectList(allExcelTable1.getExcel3selectList());
            }

            if(allExcelTable2.getExcel7selectList().size()>=allExcelTable1.getExcel7selectList().size()){
                allExcelTable3.setExcel7selectList(allExcelTable2.getExcel7selectList());
            }else{
                allExcelTable3.setExcel7selectList(allExcelTable1.getExcel7selectList());
            }

            if(allExcelTable2.getExcel11selectList().size()>=allExcelTable1.getExcel11selectList().size()){
                allExcelTable3.setExcel11selectList(allExcelTable2.getExcel11selectList());
            }else{
                allExcelTable3.setExcel11selectList(allExcelTable1.getExcel11selectList());
            }

            if(allExcelTable2.getExcel15selectList().size()>=allExcelTable1.getExcel15selectList().size()){
                allExcelTable3.setExcel15selectList(allExcelTable2.getExcel15selectList());
            }else{
                allExcelTable3.setExcel15selectList(allExcelTable1.getExcel15selectList());
            }

            if(allExcelTable2.getExcel24selectList().size()>=allExcelTable1.getExcel24selectList().size()){
                allExcelTable3.setExcel24selectList(allExcelTable2.getExcel24selectList());
            }else{
                allExcelTable3.setExcel24selectList(allExcelTable1.getExcel24selectList());
            }



            if(allExcelTable2.getExcel4beginendList().size()>=allExcelTable1.getExcel4beginendList().size()){
                allExcelTable3.setExcel4beginendList(allExcelTable2.getExcel4beginendList());
            }else{
                allExcelTable3.setExcel4beginendList(allExcelTable1.getExcel4beginendList());
            }

            if(allExcelTable2.getExcel8beginendList().size()>=allExcelTable1.getExcel8beginendList().size()){
                allExcelTable3.setExcel8beginendList(allExcelTable2.getExcel8beginendList());
            }else{
                allExcelTable3.setExcel8beginendList(allExcelTable1.getExcel8beginendList());
            }

            if(allExcelTable2.getExcel12beginendList().size()>=allExcelTable1.getExcel12beginendList().size()){
                allExcelTable3.setExcel12beginendList(allExcelTable2.getExcel12beginendList());
            }else{
                allExcelTable3.setExcel12beginendList(allExcelTable1.getExcel12beginendList());
            }

            if(allExcelTable2.getExcel16beginendList().size()>=allExcelTable1.getExcel16beginendList().size()){
                allExcelTable3.setExcel16beginendList(allExcelTable2.getExcel16beginendList());
            }else{
                allExcelTable3.setExcel16beginendList(allExcelTable1.getExcel16beginendList());
            }

        }
        return allExcelTable3;
    }

    @Override
    public AllExcelTable compare2TableToDb(String dbnum1, String dbnum2, String begindt, String enddt) {
        return null;
    }

    @Override
    public boolean manualSynchronizationData(String dbnum, String beginDT, String endDT) {
        AllExcelTable allExcelTable1=new AllExcelTable();
//        testConnectService.testConnect("db1");
//        testConnectService.testConnect("db2");
//        testConnectService.testConnect("db5");
        if(dbnum.equals("db1")){
            allExcelTable1 = winccToJavaService.selectAllExcelTableByTime("db5",beginDT,endDT);
            winccToJavaService.deleteAllExcelTableByTime(dbnum,beginDT,endDT);
            insertAllExcelToTable(dbnum,allExcelTable1);
            return true;
        }else if(dbnum.equals("db2")){
            allExcelTable1 = winccToJavaService.selectAllExcelTableByTime("db5",beginDT,endDT);
            winccToJavaService.deleteAllExcelTableByTime(dbnum,beginDT,endDT);
            insertAllExcelToTable(dbnum,allExcelTable1);
            return true;
        }else if(dbnum.equals("db5")){
            AllExcelTable allExcelTable2=new AllExcelTable();
            AllExcelTable allExcelTable3=new AllExcelTable();
            allExcelTable1 = winccToJavaService.selectAllExcelTableByTime("db1",beginDT,endDT);
            allExcelTable2 = winccToJavaService.selectAllExcelTableByTime("db2",beginDT,endDT);
            allExcelTable3=compare2TableTo1(allExcelTable1,allExcelTable2);
            winccToJavaService.deleteAllExcelTableByTime(dbnum,beginDT,endDT);
            insertAllExcelToTable(dbnum,allExcelTable3);
            return true;
        }
        return false;
    }

    @Override
    public void insertAfterSelect(String dbnum, AllExcelTable allExcelTable) {
        if(dbnum.equals("db1")){
            DbContextHolder.setDbType(DBTypeEnum.db1);
        }else if(dbnum.equals("db2")){
            DbContextHolder.setDbType(DBTypeEnum.db2);
        }else if(dbnum.equals("db3")){
            DbContextHolder.setDbType(DBTypeEnum.db3);
        }else if(dbnum.equals("db4")){
            DbContextHolder.setDbType(DBTypeEnum.db4);
        }else{
            DbContextHolder.setDbType(DBTypeEnum.db5);
        }
        if(allExcelTable.getExcel1baseinfoList().size()>0)  excel1baseinfoMapper.insertAfterSelect(allExcelTable.getExcel1baseinfoList());
        if(allExcelTable.getExcel2baseinfoList().size()>0)  excel2baseinfoMapper.insertAfterSelect(allExcelTable.getExcel2baseinfoList());
        if(allExcelTable.getExcel3baseinfoList().size()>0)  excel3baseinfoMapper.insertAfterSelect(allExcelTable.getExcel3baseinfoList());
        if(allExcelTable.getExcel4baseinfoList().size()>0)  excel4baseinfoMapper.insertAfterSelect(allExcelTable.getExcel4baseinfoList());
        if(allExcelTable.getExcel5baseinfoList().size()>0)  excel5baseinfoMapper.insertAfterSelect(allExcelTable.getExcel5baseinfoList());
        if(allExcelTable.getExcel6baseinfoList().size()>0)  excel6baseinfoMapper.insertAfterSelect(allExcelTable.getExcel6baseinfoList());
        if(allExcelTable.getExcel7baseinfoList().size()>0)  excel7baseinfoMapper.insertAfterSelect(allExcelTable.getExcel7baseinfoList());
        if(allExcelTable.getExcel8baseinfoList().size()>0)  excel8baseinfoMapper.insertAfterSelect(allExcelTable.getExcel8baseinfoList());
        if(allExcelTable.getExcel9baseinfoList().size()>0)  excel9baseinfoMapper.insertAfterSelect(allExcelTable.getExcel9baseinfoList());
        if(allExcelTable.getExcel10baseinfoList().size()>0)  excel10baseinfoMapper.insertAfterSelect(allExcelTable.getExcel10baseinfoList());
        if(allExcelTable.getExcel11baseinfoList().size()>0)  excel11baseinfoMapper.insertAfterSelect(allExcelTable.getExcel11baseinfoList());
        if(allExcelTable.getExcel12baseinfoList().size()>0)  excel12baseinfoMapper.insertAfterSelect(allExcelTable.getExcel12baseinfoList());
        if(allExcelTable.getExcel13baseinfoList().size()>0)  excel13baseinfoMapper.insertAfterSelect(allExcelTable.getExcel13baseinfoList());
        if(allExcelTable.getExcel14baseinfoList().size()>0)  excel14baseinfoMapper.insertAfterSelect(allExcelTable.getExcel14baseinfoList());
        if(allExcelTable.getExcel15baseinfoList().size()>0)  excel15baseinfoMapper.insertAfterSelect(allExcelTable.getExcel15baseinfoList());
        if(allExcelTable.getExcel16baseinfoList().size()>0)  excel16baseinfoMapper.insertAfterSelect(allExcelTable.getExcel16baseinfoList());
        if(allExcelTable.getExcel17baseinfoList().size()>0)  excel17baseinfoMapper.insertAfterSelect(allExcelTable.getExcel17baseinfoList());
        if(allExcelTable.getExcel18baseinfoList().size()>0)  excel18baseinfoMapper.insertAfterSelect(allExcelTable.getExcel18baseinfoList());
        if(allExcelTable.getExcel19baseinfoList().size()>0)  excel19baseinfoMapper.insertAfterSelect(allExcelTable.getExcel19baseinfoList());
        if(allExcelTable.getExcel20baseinfoList().size()>0)  excel20baseinfoMapper.insertAfterSelect(allExcelTable.getExcel20baseinfoList());
        if(allExcelTable.getExcel21baseinfoList().size()>0)  excel21baseinfoMapper.insertAfterSelect(allExcelTable.getExcel21baseinfoList());
        if(allExcelTable.getExcel22baseinfoList().size()>0)  excel22baseinfoMapper.insertAfterSelect(allExcelTable.getExcel22baseinfoList());
        if(allExcelTable.getExcel23baseinfoList().size()>0)  excel23baseinfoMapper.insertAfterSelect(allExcelTable.getExcel23baseinfoList());
        if(allExcelTable.getExcel24baseinfoList().size()>0)  excel24baseinfoMapper.insertAfterSelect(allExcelTable.getExcel24baseinfoList());
        if(allExcelTable.getExcel25baseinfoList().size()>0)  excel25baseinfoMapper.insertAfterSelect(allExcelTable.getExcel25baseinfoList());
        if(allExcelTable.getExcel26baseinfoList().size()>0)  excel26baseinfoMapper.insertAfterSelect(allExcelTable.getExcel26baseinfoList());

        if(allExcelTable.getExcel2dataList().size()>0)excel2dataMapper.insertAfterSelect(allExcelTable.getExcel2dataList());
        if(allExcelTable.getExcel3dataList().size()>0)excel3dataMapper.insertAfterSelect(allExcelTable.getExcel3dataList());
        if(allExcelTable.getExcel4dataList().size()>0)excel4dataMapper.insertAfterSelect(allExcelTable.getExcel4dataList());
        if(allExcelTable.getExcel6dataList().size()>0)excel6dataMapper.insertAfterSelect(allExcelTable.getExcel6dataList());
        if(allExcelTable.getExcel7dataList().size()>0)excel7dataMapper.insertAfterSelect(allExcelTable.getExcel7dataList());
        if(allExcelTable.getExcel8dataList().size()>0)excel8dataMapper.insertAfterSelect(allExcelTable.getExcel8dataList());
        if(allExcelTable.getExcel10dataList().size()>0)excel10dataMapper.insertAfterSelect(allExcelTable.getExcel10dataList());
        if(allExcelTable.getExcel11dataList().size()>0)excel11dataMapper.insertAfterSelect(allExcelTable.getExcel11dataList());
        if(allExcelTable.getExcel12dataList().size()>0) excel12dataMapper.insertAfterSelect(allExcelTable.getExcel12dataList());
        if(allExcelTable.getExcel14dataList().size()>0) excel14dataMapper.insertAfterSelect(allExcelTable.getExcel14dataList());
        if(allExcelTable.getExcel15dataList().size()>0) excel15dataMapper.insertAfterSelect(allExcelTable.getExcel15dataList());
        if(allExcelTable.getExcel16dataList().size()>0) excel16dataMapper.insertAfterSelect(allExcelTable.getExcel16dataList());
        if(allExcelTable.getExcel17dataList().size()>0)  excel17dataMapper.insertAfterSelect(allExcelTable.getExcel17dataList());
        if(allExcelTable.getExcel18dataList().size()>0) excel18dataMapper.insertAfterSelect(allExcelTable.getExcel18dataList());
        if(allExcelTable.getExcel19dataList().size()>0) excel19dataMapper.insertAfterSelect(allExcelTable.getExcel19dataList());
        if(allExcelTable.getExcel20dataList().size()>0) excel20dataMapper.insertAfterSelect(allExcelTable.getExcel20dataList());
        if(allExcelTable.getExcel21dataList().size()>0) excel21dataMapper.insertAfterSelect(allExcelTable.getExcel21dataList());
        if(allExcelTable.getExcel22dataList().size()>0) excel22dataMapper.insertAfterSelect(allExcelTable.getExcel22dataList());
        if(allExcelTable.getExcel23dataList().size()>0) excel23dataMapper.insertAfterSelect(allExcelTable.getExcel23dataList());
        if(allExcelTable.getExcel24dataList().size()>0) excel24dataMapper.insertAfterSelect(allExcelTable.getExcel24dataList());
        if(allExcelTable.getExcel25dataList().size()>0) excel25dataMapper.insertAfterSelect(allExcelTable.getExcel25dataList());
        if(allExcelTable.getExcel26dataList().size()>0) excel26dataMapper.insertAfterSelect(allExcelTable.getExcel26dataList());



        if(allExcelTable.getExcel1procedureList().size()>0) excel1procedureMapper.insertAfterSelect(allExcelTable.getExcel1procedureList());
        if(allExcelTable.getExcel5procedureList().size()>0) excel5procedureMapper.insertAfterSelect(allExcelTable.getExcel5procedureList());
        if(allExcelTable.getExcel9procedureList().size()>0) excel9procedureMapper.insertAfterSelect(allExcelTable.getExcel9procedureList());
        if(allExcelTable.getExcel13procedureList().size()>0) excel13procedureMapper.insertAfterSelect(allExcelTable.getExcel13procedureList());

        if(allExcelTable.getExcel3selectList().size()>0) excel3selectMapper.insertAfterSelect(allExcelTable.getExcel3selectList());
        if(allExcelTable.getExcel7selectList().size()>0) excel7selectMapper.insertAfterSelect(allExcelTable.getExcel7selectList());
        if(allExcelTable.getExcel11selectList().size()>0) excel11selectMapper.insertAfterSelect(allExcelTable.getExcel11selectList());
        if(allExcelTable.getExcel15selectList().size()>0) excel15selectMapper.insertAfterSelect(allExcelTable.getExcel15selectList());
        if(allExcelTable.getExcel24selectList().size()>0) excel24selectMapper.insertAfterSelect(allExcelTable.getExcel24selectList());


        if(allExcelTable.getExcel4beginendList().size()>0) excel4beginendMapper.insertAfterSelect(allExcelTable.getExcel4beginendList());
        if(allExcelTable.getExcel8beginendList().size()>0) excel8beginendMapper.insertAfterSelect(allExcelTable.getExcel8beginendList());
        if(allExcelTable.getExcel12beginendList().size()>0) excel12beginendMapper.insertAfterSelect(allExcelTable.getExcel12beginendList());
        if(allExcelTable.getExcel16beginendList().size()>0) excel16beginendMapper.insertAfterSelect(allExcelTable.getExcel16beginendList());


    }


}
