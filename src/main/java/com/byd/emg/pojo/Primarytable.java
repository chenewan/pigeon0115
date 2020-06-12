package com.byd.emg.pojo;

public class Primarytable {
    private Integer id;

    private Integer tableno;

    private String dt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTableno() {
        return tableno;
    }

    public void setTableno(Integer tableno) {
        this.tableno = tableno;
    }

    public String getDt() {
        return dt;
    }

    public void setDt(String dt) {
        this.dt = dt == null ? null : dt.trim();
    }
}