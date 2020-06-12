package com.byd.emg.service.impl;

import com.byd.emg.common.DBTypeEnum;
import com.byd.emg.common.DbContextHolder;
import com.byd.emg.mapper.TestconnectMapper;
import com.byd.emg.pojo.Testconnect;
import com.byd.emg.service.TestConnectService;
import com.byd.emg.util.DateTimeUtil;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Date;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
/**
 * @author ganchaoyang
 * @date 2019/1/22 19:11
 * @description
 */
@Service
@Log4j
public class TestConnectServiceImpl implements TestConnectService {

    @Autowired
    private TestconnectMapper testconnectMapper;


    @Override
    public boolean testConnect(String dbnum) {
        Connection con;
        Statement statement;
        String url,userName,password;

        try {
            if(dbnum.equals("db1")){
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  //加载数据库驱动
                url = "jdbc:sqlserver://192.168.0.9\\WINCC:1433;DataBaseName=pigeon";
//                url = "jdbc:sqlserver://192.168.0.200\\WINCC:1433;DatabaseName=pigeon";
//                url = "jdbc:sqlserver://chenlisong.iok.la\\WINCC:1433;DatabaseName=pigeon";
                userName = "byd";
                password = "byd";
            }else if(dbnum.equals("db2")){
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  //加载数据库驱动
                url = "jdbc:sqlserver://192.168.0.8\\WINCC:1433;DataBaseName=pigeon";
//                url = "jdbc:sqlserver://192.168.0.201:1433;DatabaseName=pigeon";
//                url = "jdbc:sqlserver://47.94.224.92:1433;DatabaseName=pigeon";
                userName = "byd";
                password = "byd";
            }else if(dbnum.equals("db3")){
                Class.forName("com.mysql.jdbc.Driver");
                url = "jdbc:mysql://192.168.0.7:3306/table1?useUnicode=true&characterEncoding=utf-8&allowMultiQueries=true";
//                url = "jdbc:mysql://192.168.0.201:3306/table1?useUnicode=true&characterEncoding=utf-8&allowMultiQueries=true";
//                url = "jdbc:mysql://chenlisong.iok.la:3306/table1?useUnicode=true&characterEncoding=utf-8&allowMultiQueries=true";

                userName = "root";
                password = "Beyond88089880";
            }else if(dbnum.equals("db4")){
                Class.forName("com.mysql.jdbc.Driver");
                url = "jdbc:mysql://192.168.0.7:3306/table2?useUnicode=true&characterEncoding=utf-8&allowMultiQueries=true";
//                url = "jdbc:mysql://192.168.0.201:3306/table2?useUnicode=true&characterEncoding=utf-8&allowMultiQueries=true";
//                url = "jdbc:mysql://chenlisong.iok.la:3306/table2?useUnicode=true&characterEncoding=utf-8&allowMultiQueries=true";

                userName = "root";
                password = "Beyond88089880";
            }else{
                Class.forName("com.mysql.jdbc.Driver");
                url = "jdbc:mysql://192.168.0.7:3306/table3?useUnicode=true&characterEncoding=utf-8&allowMultiQueries=true";
//                url = "jdbc:mysql://192.168.0.201:3306/table3?useUnicode=true&characterEncoding=utf-8&allowMultiQueries=true";
//                url = "jdbc:mysql://chenlisong.iok.la:3306/table3?useUnicode=true&characterEncoding=utf-8&allowMultiQueries=true";

                userName = "root";
                password = "Beyond88089880";
            }
            con = DriverManager.getConnection(url,userName,password);  //创建数据库连接
            statement = con.createStatement();
            statement.execute("select count(id) from excel10baseinfo");
        } catch (Exception e) {
            // TODO Auto-generated catch block
//            State 0 正常 1 报警
            if(dbnum.equals("db1")){
                Testconnect testconnect = new Testconnect();
                testconnect.setDt(DateTimeUtil.dateToStr(new Date(),"yyyy-MM-dd HH:mm:ss"));
                testconnect.setCpuname("1号上位机");
                testconnect.setState(1);
                DbContextHolder.setDbType(DBTypeEnum.db2);
                testconnectMapper.insertSelective(testconnect);
                DbContextHolder.setDbType(DBTypeEnum.db5);
                testconnectMapper.insertSelective(testconnect);
            }else if(dbnum.equals("db2")){
                Testconnect testconnect = new Testconnect();
                testconnect.setDt(DateTimeUtil.dateToStr(new Date(),"yyyy-MM-dd HH:mm:ss"));
                testconnect.setCpuname("2号上位机");
                testconnect.setState(1);
                DbContextHolder.setDbType(DBTypeEnum.db1);
                testconnectMapper.insertSelective(testconnect);
                DbContextHolder.setDbType(DBTypeEnum.db5);
                testconnectMapper.insertSelective(testconnect);
            }else if(dbnum.equals("db3")){
                Testconnect testconnect = new Testconnect();
                testconnect.setDt(DateTimeUtil.dateToStr(new Date(),"yyyy-MM-dd HH:mm:ss"));
                testconnect.setCpuname("数据服务器");
                testconnect.setState(1);
                DbContextHolder.setDbType(DBTypeEnum.db1);
                testconnectMapper.insertSelective(testconnect);
                DbContextHolder.setDbType(DBTypeEnum.db2);
                testconnectMapper.insertSelective(testconnect);
            }else if(dbnum.equals("db4")){
                Testconnect testconnect = new Testconnect();
                testconnect.setDt(DateTimeUtil.dateToStr(new Date(),"yyyy-MM-dd HH:mm:ss"));
                testconnect.setCpuname("数据服务器");
                testconnect.setState(1);
                DbContextHolder.setDbType(DBTypeEnum.db1);
                testconnectMapper.insertSelective(testconnect);
                DbContextHolder.setDbType(DBTypeEnum.db2);
                testconnectMapper.insertSelective(testconnect);
            }else{
                Testconnect testconnect = new Testconnect();
                testconnect.setDt(DateTimeUtil.dateToStr(new Date(),"yyyy-MM-dd HH:mm:ss"));
                testconnect.setCpuname("数据服务器");
                testconnect.setState(1);
                DbContextHolder.setDbType(DBTypeEnum.db1);
                testconnectMapper.insertSelective(testconnect);
                DbContextHolder.setDbType(DBTypeEnum.db2);
                testconnectMapper.insertSelective(testconnect);
            }
            e.printStackTrace();
            log.info("连接数据库"+dbnum+"出错");
//            System.out.println("连接数据库"+dbnum+"出错");
            return false;
        }
        return true;
    }

    public boolean isConnect(String dbnum){
        boolean connect = false;
        Runtime runtime = Runtime.getRuntime();
        Process process;
        String ip;
        if(dbnum.equals("db1")){
            ip = "192.168.0.9";
        }else if(dbnum.equals("db2")){
            ip = "192.168.0.8";
        }else if(dbnum.equals("db3")){
            ip = "192.168.0.7";
        }else if(dbnum.equals("db4")){
            ip = "192.168.0.7";
        }else{
            ip = "192.168.0.7";
        }
        try {
            process = runtime.exec("ping " + ip);
            InputStream is = process.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            String line = null;
            StringBuffer sb = new StringBuffer();
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
            System.out.println("返回值为:"+sb);
            is.close();
            isr.close();
            br.close();

            if (null != sb && !sb.toString().equals("")) {
                String logString = "";
                if (sb.toString().indexOf("TTL") > 0) {
                    // 网络畅通
                    connect = true;
                } else {
                    // 网络不畅通
                    if(dbnum.equals("db1")){
                        Testconnect testconnect = new Testconnect();
                        testconnect.setDt(DateTimeUtil.dateToStr(new Date(),"yyyy-MM-dd HH:mm:ss"));
                        testconnect.setCpuname("1号上位机");
                        testconnect.setState(1);
                        DbContextHolder.setDbType(DBTypeEnum.db2);
                        testconnectMapper.insertSelective(testconnect);
                        DbContextHolder.setDbType(DBTypeEnum.db5);
                        testconnectMapper.insertSelective(testconnect);
                    }else if(dbnum.equals("db2")){
                        Testconnect testconnect = new Testconnect();
                        testconnect.setDt(DateTimeUtil.dateToStr(new Date(),"yyyy-MM-dd HH:mm:ss"));
                        testconnect.setCpuname("2号上位机");
                        testconnect.setState(1);
                        DbContextHolder.setDbType(DBTypeEnum.db1);
                        testconnectMapper.insertSelective(testconnect);
                        DbContextHolder.setDbType(DBTypeEnum.db5);
                        testconnectMapper.insertSelective(testconnect);
                    }else if(dbnum.equals("db3")){
                        Testconnect testconnect = new Testconnect();
                        testconnect.setDt(DateTimeUtil.dateToStr(new Date(),"yyyy-MM-dd HH:mm:ss"));
                        testconnect.setCpuname("数据服务器");
                        testconnect.setState(1);
                        DbContextHolder.setDbType(DBTypeEnum.db1);
                        testconnectMapper.insertSelective(testconnect);
                        DbContextHolder.setDbType(DBTypeEnum.db2);
                        testconnectMapper.insertSelective(testconnect);
                    }else if(dbnum.equals("db4")){
                        Testconnect testconnect = new Testconnect();
                        testconnect.setDt(DateTimeUtil.dateToStr(new Date(),"yyyy-MM-dd HH:mm:ss"));
                        testconnect.setCpuname("数据服务器");
                        testconnect.setState(1);
                        DbContextHolder.setDbType(DBTypeEnum.db1);
                        testconnectMapper.insertSelective(testconnect);
                        DbContextHolder.setDbType(DBTypeEnum.db2);
                        testconnectMapper.insertSelective(testconnect);
                    }else{
                        Testconnect testconnect = new Testconnect();
                        testconnect.setDt(DateTimeUtil.dateToStr(new Date(),"yyyy-MM-dd HH:mm:ss"));
                        testconnect.setCpuname("数据服务器");
                        testconnect.setState(1);
                        DbContextHolder.setDbType(DBTypeEnum.db1);
                        testconnectMapper.insertSelective(testconnect);
                        DbContextHolder.setDbType(DBTypeEnum.db2);
                        testconnectMapper.insertSelective(testconnect);
                    }
                    connect = false;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return connect;
    }
}
