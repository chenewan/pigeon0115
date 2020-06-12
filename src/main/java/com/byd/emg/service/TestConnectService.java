package com.byd.emg.service;

import com.byd.emg.pojo.Sex;

import java.util.List;

/**
 * @author ganchaoyang
 * @date 2019/1/22 19:09
 * @description
 */
public interface TestConnectService {


    boolean testConnect(String dbnum);
    boolean isConnect(String dbnum);
}
