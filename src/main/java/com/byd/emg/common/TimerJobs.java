package com.byd.emg.common;

import com.byd.emg.mapper.Excel1baseinfoMapper;
import com.byd.emg.pojo.Excel1baseinfo;
import com.byd.emg.service.JavaToTableService;
import com.byd.emg.service.TestConnectService;
import com.byd.emg.service.WinccToJavaService;
import com.byd.emg.util.DateTimeUtil;
import com.byd.emg.vo.AllExcelTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;


@Component
public class TimerJobs {

    @Autowired
    private WinccToJavaService winccToJavaService;

    @Autowired
    private TestConnectService testConnectService;

    @Autowired
    private JavaToTableService javaToTableService;
//    @Qualifier("configData")  //  指定注入bean的名称，提高注入准确性
//    private DataConfig dataConfig;

//    每分钟      采集wincc1数据到table1
    @Async
    @Scheduled(cron="0 0/1 * * * ?")
//    @Scheduled(cron="0/10 * * * * ?")
    public void insertData1MToTable1() {
        String nowDT = DateTimeUtil.dateToStr(new Date(),"yyyy-MM-dd HH:mm:ss");
        System.out.println(DateTimeUtil.dateToStr(new Date(),"yyyy-MM-dd HH:mm:ss")+"每分钟采集wincc1数据到table1");
        String beginDT = DateTimeUtil.getLastMiniteTime(nowDT).get(1);
        String endDT = DateTimeUtil.getLastMiniteTime(nowDT).get(2);
        AllExcelTable allExcelTable1=new AllExcelTable();
        AllExcelTable allExcelTable2=new AllExcelTable();
        AllExcelTable allExcelTable3=new AllExcelTable();
        boolean testConnect1,testConnect2,testConnect3,testConnect4,testConnect5;
        testConnect1=testConnectService.testConnect("db1");
        testConnect2=testConnectService.testConnect("db2");
        testConnect3=testConnectService.testConnect("db3");
        testConnect4=testConnectService.testConnect("db4");
        testConnect5=testConnectService.testConnect("db5");

        if(testConnect1&&testConnect3) {
            allExcelTable1 = winccToJavaService.selectAllExcelTableByTime("db1",beginDT,endDT);
            javaToTableService.insertAllExcelToTable("db3",allExcelTable1);
        }
        if(testConnect2&&testConnect4) {
            allExcelTable2 = winccToJavaService.selectAllExcelTableByTime("db2",beginDT,endDT);
            javaToTableService.insertAllExcelToTable("db4",allExcelTable2);
        }
        if(testConnect5) {
            allExcelTable3 = javaToTableService.compare2TableTo1(allExcelTable1,allExcelTable2);
            if(allExcelTable3.getExcel1baseinfoList()!=null){
                javaToTableService.insertAllExcelToTable("db5",allExcelTable3);
            }
        }
        System.out.println(DateTimeUtil.dateToStr(new Date(),"yyyy-MM-dd HH:mm:ss")+"每分钟采集wincc1数据到table1执行完毕");
    }




//    @Scheduled(cron="0 0/5 * * * ?")


    //每30分钟      设备的定时任务
    @Async
    @Scheduled(cron="0 0/30 * * * ? ")
//    @Scheduled(cron="0/10 * * * * ?")
    public void insertData30MToTable1() {
        String time= DateTimeUtil.dateToStr(new Date(),"yyyy-MM-dd HH:mm:ss");
//        String time= "2019-08-30 09:30:00";
        Map<Integer,String> dateTimeMap =  DateTimeUtil.addDate(time, -1);
        String beginDT,endDT;
        AllExcelTable allExcelTable1,allExcelTable2,allExcelTable5;
        if (dateTimeMap!=null && dateTimeMap.size()>0){
            for(int i=0;i<30;i++){
                beginDT = dateTimeMap.get(2*i);
                endDT = dateTimeMap.get(2*i+1);
                allExcelTable1 = winccToJavaService.selectAllExcelTableByTime("db1",beginDT,endDT);
//                javaToTableService.insertAllExcelToTable("db3",allExcelTable1);
                javaToTableService.insertAfterSelect("db3",allExcelTable1);
                allExcelTable2 = winccToJavaService.selectAllExcelTableByTime("db2",beginDT,endDT);
//                javaToTableService.insertAllExcelToTable("db4",allExcelTable2);
                javaToTableService.insertAfterSelect("db4",allExcelTable2);
                allExcelTable5 = javaToTableService.compare2TableTo1(allExcelTable1,allExcelTable2);
//                winccToJavaService.deleteAllExcelTableByTime("db5",beginDT,endDT);
//                javaToTableService.insertAllExcelToTable("db5",allExcelTable3);
                javaToTableService.insertAfterSelect("db5",allExcelTable5);
            }
            beginDT = dateTimeMap.get(0);
            endDT = dateTimeMap.get(59);
            allExcelTable5 = winccToJavaService.selectAllExcelTableByTime("db5",beginDT,endDT);
            winccToJavaService.deleteAllExcelTableByTime("db1",beginDT,endDT);
            javaToTableService.insertAllExcelToTable("db1",allExcelTable5);
            winccToJavaService.deleteAllExcelTableByTime("db2",beginDT,endDT);
            javaToTableService.insertAllExcelToTable("db2",allExcelTable5);
        }
        System.out.println(DateTimeUtil.dateToStr(new Date(),"yyyy-MM-dd HH:mm:ss")+"每30分钟执行一次");
    }

    //每10分钟      设备的定时任务
//    @Async
//    @Scheduled(cron="0 0/10 * * * ? ")
    public void TimeJobBy10min() {
        String time= DateTimeUtil.dateToStr(new Date(),"yyyy-MM-dd HH:mm:ss");

        System.out.println(time+"每10分钟执行一次");
    }


//    @Async
//    @Scheduled(cron="0 0 0/1 * * ?")
    public void TimeJobByHour() {
        String time= DateTimeUtil.dateToStr(new Date(),"yyyy-MM-dd HH:mm:ss");
        System.out.println(time+"每小时执行一次");
    }

//    @Async
//    @Scheduled(cron="0 0 0 * * ?" )
    public void TimeJobByDay() {
        String time= DateTimeUtil.dateToStr(new Date(),"yyyy-MM-dd HH:mm:ss");
        System.out.println(time+"每天执行一次");
    }


//    @Async
//    @Scheduled(cron= "0 0 0 * * ?")
    public void TimeJobByMonthHistoryData() {
        String time= DateTimeUtil.dateToStr(new Date(),"yyyy-MM-dd HH:mm:ss");
        System.out.println(time+"每月执行一次");
    }

    //根据传入的年月减去一天
    public String subtractDay(String date) {
        SimpleDateFormat df= new SimpleDateFormat("yyyy-MM-dd");
        String returnDate=date;
        try {
            Calendar rightNow = Calendar.getInstance();
            Date begin_d1=df.parse(date);
            rightNow.setTime(begin_d1);
            rightNow.add(Calendar.DAY_OF_MONTH,-1);
            returnDate=df.format(rightNow.getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return returnDate;
    }

    //判断当前日期是否是本月的最后一天
    public static boolean isLastDayOfMonth(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.DATE, (calendar.get(Calendar.DATE) + 1));
        if (calendar.get(Calendar.DAY_OF_MONTH) == 1) {
            return true;
        }
        return false;
    }




}

