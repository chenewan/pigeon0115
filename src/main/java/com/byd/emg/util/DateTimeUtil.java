package com.byd.emg.util;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

//时间管理的工具类
public class DateTimeUtil {

    public static String dateToStr(Date date, String formatStr){
        if(date == null){
            return StringUtils.EMPTY;
        }
        DateTime dateTime = new DateTime(date);
        return dateTime.toString(formatStr);
    }

    public static Date strToDate(String dateTimeStr,String formatStr){
        DateTimeFormatter dateTimeFormatter = DateTimeFormat.forPattern(formatStr);
        DateTime dateTime = dateTimeFormatter.parseDateTime(dateTimeStr);
        return dateTime.toDate();
    }

    public static String strToStr(String date,String dateTimeStr,String formatStr){
        Date date_2=strToDate(date,dateTimeStr);
        String now=dateToStr(date_2,formatStr);
        return now;
    }

    //根据cell类型设置数据(poi包下的)
    public static String getCellFormatValue(Cell cell) {
        String cellvalue = "";
        if (cell != null) {
            // 判断当前Cell的Type
            switch (cell.getCellType()) {
                case Cell.CELL_TYPE_NUMERIC:// 如果当前Cell的Type为NUMERIC
                case Cell.CELL_TYPE_FORMULA: {
                    // 判断当前的cell是否为Date
                    if (DateUtil.isCellDateFormatted(cell)) {
                        // 如果是Date类型则，转化为Data格式
                        // data格式是带时分秒的：2013-7-10 0:00:00
                        // cellvalue = cell.getDateCellValue().toLocaleString();
                        // data格式是不带带时分秒的：2013-7-10
                        Date date = cell.getDateCellValue();
                        DateFormat formater = new SimpleDateFormat("yyyy-MM-dd");
                        cellvalue = formater.format(date);
                    } else {// 如果是纯数字
                        // 取得当前Cell的数值
                        DecimalFormat df = new DecimalFormat("0.000");
                        cellvalue = String.valueOf(df.format(cell.getNumericCellValue()));
                    }
                    break;
                }
                case Cell.CELL_TYPE_STRING:// 如果当前Cell的Type为STRING
                    // 取得当前的Cell字符串
                    cellvalue = cell.getRichStringCellValue().getString();
                    if(cellvalue.contains("/")){
                        //将"yyyy/MM/dd"转换为"yyyy-MM-dd"
                        String dateTimeStr="yyyy/MM/dd";
                        try{
                            String date=strToStr(cellvalue,dateTimeStr,"yyyy-MM-dd");
                            cellvalue=date;
                        }catch (Exception e){
                            break;
                        }
                    }
                    break;
                default:// 默认的Cell值
                    cellvalue = "";
            }
        } else {
            cellvalue = "";
        }
        return cellvalue;
    }

    //获取指定年指定月的最后一天的日期
    /**
     * 获取某月的最后一天
     * @Title:getLastDayOfMonth
     * @Description:
     * @param:@param year
     * @param:@param month
     * @param:@return
     * @return:String
     * @throws
     */
    public static String getLastDayOfMonth(int year,int month)
    {
        Calendar cal = Calendar.getInstance();
        //设置年份
        cal.set(Calendar.YEAR,year);
        //设置月份
        cal.set(Calendar.MONTH, month-1);
        //获取某月最大天数
        int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        //设置日历中月份的最大天数
        cal.set(Calendar.DAY_OF_MONTH, lastDay);
        //格式化日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String lastDayOfMonth = sdf.format(cal.getTime());
        return lastDayOfMonth;
    }

    /**
     * 秒转化为天小时分秒字符串
     *
     * @param minute
     * @return String
     */
    public static String formatMinute(String minute) {
        Long longMinute= Long.valueOf(minute) ;
        String timeStr = longMinute + "分";
        if (longMinute > 60) {
            long min = (longMinute ) % 60;
            long hour = (longMinute ) / 60;
            timeStr = hour + "小时" + min + "分" ;
            if (hour > 24) {
                hour = (longMinute  / 60) % 24;
                long day = ((longMinute  / 60) / 24);
                timeStr = day + "天" + hour + "小时" + min + "分" ;
            }
        }
        return timeStr;
    }
    public static Map<Integer,String> getLastMiniteTime(String dateTimeNow) {
        Map<Integer,String> lastMiniteTime=new HashMap<Integer,String>();
        dateTimeNow=dateToStr(rollMinute(strToDate(dateTimeNow,"yyyy-MM-dd HH:mm:ss"),-1),"yyyy-MM-dd HH:mm:ss");
        String beginDT = dateTimeNow.substring(0,16)+ ":00";
        String endDT = dateTimeNow.substring(0,16)+ ":59";
        lastMiniteTime.put(1,beginDT);
        lastMiniteTime.put(2,endDT);
        return lastMiniteTime;
    }
    public static Date rollMinute(Date d, int minute) {
        return new Date(d.getTime() + minute * 60 * 1000);
    }
//    public static Map<Integer,String> getLast30MiniteTime(String dateTimeNow) {
//        Map<Integer,String> lastMiniteTime=new HashMap<Integer,String>();
//        String beginDT,endDT;
//        Calendar cal = Calendar. getInstance ();
//        cal.set(Calendar. HOUR , Calendar. HOUR -1 ) ; //把时间设置为当前时间-1小时，同理，也可以设置其他时间
//        cal.set(Calendar. MONTH , Calendar. MONTH -1); //当前月前一月
//
//        if(dateTimeNow.substring(14,16).equals(00)){
//            beginDT = endDT = new  SimpleDateFormat( "yyyy-MM-dd HH:mm:ss" ).format(cal.getTime());//获取到完整的时间
//            beginDT = beginDT.substring(9,11) +"30:00";
//            endDT = endDT.substring(0,11)+ "59:59";
//        }else{
//
//            beginDT = dateTimeNow.substring(0,16)+ ":00";
//            endDT = dateTimeNow.substring(0,16)+ ":59";
//        }
//        lastMiniteTime.put(1,beginDT);
//        lastMiniteTime.put(2,endDT);
//        return lastMiniteTime;
//    }
    public static Map<Integer,String> addDate(String day, int x)
    {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//24小时制
        //SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");//12小时制
        Date date = null;
        try
        {
            date = format.parse(day);
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
        if (date == null) return null;
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.HOUR_OF_DAY, x);//24小时制
        //cal.add(Calendar.HOUR, x);12小时制
        date = cal.getTime();
        System.out.println("front:" + date);
        cal = null;

        String beginDT,endDT,Hour;
        Hour=day.substring(14,16);
        Map<Integer,String> lastMiniteTime=new HashMap<Integer,String>();

        if(Hour.equals("00")){
            for(int i =30 ;i<60;i++){
                int j=i;
                int k=2*i-59;
                beginDT = format.format(date).substring(0,14)+ j+":00";
                lastMiniteTime.put(k,beginDT);
            }
            for(int i =30 ;i<60;i++){
                int j=i;
                int k=2*i-58;
                endDT = format.format(date).substring(0,14)+ j+":59";
                lastMiniteTime.put(k,endDT);
            }
        }else if(Hour.equals("30")){
            cal = Calendar.getInstance();
            cal.setTime(date);
            cal.add(Calendar.HOUR_OF_DAY, 1);//24小时制
            //cal.add(Calendar.HOUR, x);12小时制
            date = cal.getTime();
            for(int i =0 ;i<30;i++){
                String j;
                if (i<10){

                    j="0"+i;
                }else{
                    j=i+"";
                }
                int k=2*i;

                beginDT = format.format(date).substring(0,14)+ j+":00";
                lastMiniteTime.put(k,beginDT);
            }
            for(int i =0 ;i<30;i++){
                String j;
                if (i<10){

                    j="0"+i;
                }else{
                    j=i+"";
                }
                int k=2*i+1;
                endDT = format.format(date).substring(0,14)+ j+":59";
                lastMiniteTime.put(k,endDT);
            }
        }else{
            return null;
        }
        return lastMiniteTime;
    }
}
