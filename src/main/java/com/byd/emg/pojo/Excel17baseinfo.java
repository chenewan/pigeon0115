package com.byd.emg.pojo;

public class Excel17baseinfo {
    private Long id;

    private String begindt;

    private String pwtemp;

    private String pwtime;

    private String username;

    private Long countnum;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBegindt() {
        return begindt;
    }

    public void setBegindt(String begindt) {
        this.begindt = begindt == null ? null : begindt.trim();
    }

    public String getPwtemp() {
        return pwtemp;
    }

    public void setPwtemp(String pwtemp) {
        this.pwtemp = pwtemp == null ? null : pwtemp.trim();
    }

    public String getPwtime() {
        return pwtime;
    }

    public void setPwtime(String pwtime) {
        this.pwtime = pwtime == null ? null : pwtime.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Long getCountnum() {
        return countnum;
    }

    public void setCountnum(Long countnum) {
        this.countnum = countnum;
    }
}