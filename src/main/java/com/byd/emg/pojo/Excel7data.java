package com.byd.emg.pojo;

import java.math.BigDecimal;

public class Excel7data {
    private Long id;

    private Long pid;

    private String process;

    private String begindt;

    private BigDecimal value1;

    private BigDecimal value2;

    private BigDecimal value3;

    private BigDecimal value4;

    private BigDecimal value5;

    private BigDecimal value6;

    private BigDecimal value7;

    private BigDecimal value8;

    private Long countnum;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public String getProcess() {
        return process;
    }

    public void setProcess(String process) {
        this.process = process == null ? null : process.trim();
    }

    public String getBegindt() {
        return begindt;
    }

    public void setBegindt(String begindt) {
        this.begindt = begindt == null ? null : begindt.trim();
    }

    public BigDecimal getValue1() {
        return value1;
    }

    public void setValue1(BigDecimal value1) {
        this.value1 = value1;
    }

    public BigDecimal getValue2() {
        return value2;
    }

    public void setValue2(BigDecimal value2) {
        this.value2 = value2;
    }

    public BigDecimal getValue3() {
        return value3;
    }

    public void setValue3(BigDecimal value3) {
        this.value3 = value3;
    }

    public BigDecimal getValue4() {
        return value4;
    }

    public void setValue4(BigDecimal value4) {
        this.value4 = value4;
    }

    public BigDecimal getValue5() {
        return value5;
    }

    public void setValue5(BigDecimal value5) {
        this.value5 = value5;
    }

    public BigDecimal getValue6() {
        return value6;
    }

    public void setValue6(BigDecimal value6) {
        this.value6 = value6;
    }

    public BigDecimal getValue7() {
        return value7;
    }

    public void setValue7(BigDecimal value7) {
        this.value7 = value7;
    }

    public BigDecimal getValue8() {
        return value8;
    }

    public void setValue8(BigDecimal value8) {
        this.value8 = value8;
    }

    public Long getCountnum() {
        return countnum;
    }

    public void setCountnum(Long countnum) {
        this.countnum = countnum;
    }
}