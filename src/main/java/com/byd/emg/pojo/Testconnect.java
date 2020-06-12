package com.byd.emg.pojo;

public class Testconnect {
    private Long id;

    private String dt;

    private Integer state;

    private String cpuname;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDt() {
        return dt;
    }

    public void setDt(String dt) {
        this.dt = dt == null ? null : dt.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getCpuname() {
        return cpuname;
    }

    public void setCpuname(String cpuname) {
        this.cpuname = cpuname == null ? null : cpuname.trim();
    }
}