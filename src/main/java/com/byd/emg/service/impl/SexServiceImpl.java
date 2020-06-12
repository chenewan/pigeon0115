package com.byd.emg.service.impl;

import com.byd.emg.common.DBTypeEnum;
import com.byd.emg.common.DbContextHolder;
import com.byd.emg.mapper.SexMapper;
import com.byd.emg.pojo.Sex;
import com.byd.emg.service.SexService;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ganchaoyang
 * @date 2019/1/22 19:11
 * @description
 */
@Service
@Log4j
public class SexServiceImpl implements SexService {

    @Autowired
    private SexMapper sexMapper1;

    @Override
    public List<Sex> findUserWithCityById(int id) {
        List<Sex> sexList = new ArrayList<>();
        //使用db1
        DbContextHolder.setDbType(DBTypeEnum.db1);
        sexList.add(sexMapper1.selectByPrimaryKey(id));

        //使用db2
        DbContextHolder.setDbType(DBTypeEnum.db2);
        sexList.add(sexMapper1.selectByPrimaryKey(id));

        //使用db3
        DbContextHolder.setDbType(DBTypeEnum.db3);
        sexList.add(sexMapper1.selectByPrimaryKey(id));

        //使用db4
        DbContextHolder.setDbType(DBTypeEnum.db4);
        sexList.add(sexMapper1.selectByPrimaryKey(id));

        //使用db5
        DbContextHolder.setDbType(DBTypeEnum.db5);
        sexList.add(sexMapper1.selectByPrimaryKey(id));



        return sexList;
    }
}
