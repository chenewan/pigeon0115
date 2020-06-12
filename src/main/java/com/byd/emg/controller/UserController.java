package com.byd.emg.controller;

import com.byd.emg.pojo.Sex;
import com.byd.emg.service.JavaToTableService;
import com.byd.emg.service.SexService;
import com.byd.emg.service.TestConnectService;
import com.byd.emg.service.WinccToJavaService;
import com.byd.emg.vo.AllExcelTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ganchaoyang
 * @date 2019/1/22 19:15
 * @description
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private WinccToJavaService winccToJavaService;
    @Autowired
    private JavaToTableService javaToTableService;
    @Autowired
    private TestConnectService testConnectService;
//    @Autowired
//    private SexService sexService;

//    @RequestMapping("/get-by-id")
//    public List<Sex> getUserById(@RequestParam("id") int id) {
//        return sexService.findUserWithCityById(id);
//    }

//    手动同步数据
    @RequestMapping("/updateData")
    public boolean updateData(@RequestParam("dbnum") String dbnum,@RequestParam("begindt") String begindt,@RequestParam("enddt") String enddt) {
        return javaToTableService.manualSynchronizationData(dbnum,begindt,enddt);
    }

    //    手动取消报警
    @RequestMapping("/cancelAlarmManually")
    public boolean cancelAlarmManually(@RequestParam("dbnum") String dbnum,@RequestParam("begindt") String begindt,@RequestParam("enddt") String enddt) {
        return javaToTableService.manualSynchronizationData(dbnum,begindt,enddt);
    }

    //    手动测试连接
    @RequestMapping("/testConnectAlarm")
    public boolean testConnectAlarm(@RequestParam("dbnum") String dbnum) {
        return testConnectService.testConnect(dbnum);
    }

}
