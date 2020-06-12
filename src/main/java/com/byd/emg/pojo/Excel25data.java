package com.byd.emg.pojo;

import java.math.BigDecimal;

public class Excel25data {
    private Long id;

    private Long pid;

    private String begindt;

    private String value1;

    private String value2;

    private String value3;

    private BigDecimal value4;

    private BigDecimal value5;

    private BigDecimal value6;

    private BigDecimal value7;

    private String value8;

    private BigDecimal value9;

    private String value10;

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

    public String getBegindt() {
        return begindt;
    }

    public void setBegindt(String begindt) {
        this.begindt = begindt == null ? null : begindt.trim();
    }

    public String getValue1() {
        return value1;
    }

    public void setValue1(String value1) {
        this.value1 = value1 == null ? null : value1.trim();
    }

    public String getValue2() {
        return value2;
    }

    public void setValue2(String value2) {
        this.value2 = value2 == null ? null : value2.trim();
    }

    public String getValue3() {
        return value3;
    }

    public void setValue3(String value3) {
        this.value3 = value3 == null ? null : value3.trim();
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

    public String getValue8() {
        return value8;
    }

    public void setValue8(String value8) {
        this.value8 = value8 == null ? null : value8.trim();
    }

    public BigDecimal getValue9() {
        return value9;
    }

    public void setValue9(BigDecimal value9) {
        this.value9 = value9;
    }

    public String getValue10() {
        return value10;
    }

    public void setValue10(String value10) {
        this.value10 = value10 == null ? null : value10.trim();
    }

    public Long getCountnum() {
        return countnum;
    }

    public void setCountnum(Long countnum) {
        this.countnum = countnum;
    }
}