package com.byd.emg.service;

import com.byd.emg.pojo.Sex;

import java.util.List;

/**
 * @author ganchaoyang
 * @date 2019/1/22 19:09
 * @description
 */
public interface SexService {

    /**
     * 根据用户id查询用户信息（带城市信息）
     * @param id
     * @return
     */
    List<Sex> findUserWithCityById(int id);

}
