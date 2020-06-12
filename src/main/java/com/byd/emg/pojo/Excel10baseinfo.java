package com.byd.emg.pojo;

public class Excel10baseinfo {
    private Long id;

    private String begindt;

    private String batch;

    private String siptemp;

    private String siptime;

    private String username;

    private Long countnum;

    private Long path;

    public Long getPath() {
        return path;
    }

    public void setPath(Long path) {
        this.path = path;
    }


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

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch == null ? null : batch.trim();
    }

    public String getSiptemp() {
        return siptemp;
    }

    public void setSiptemp(String siptemp) {
        this.siptemp = siptemp == null ? null : siptemp.trim();
    }

    public String getSiptime() {
        return siptime;
    }

    public void setSiptime(String siptime) {
        this.siptime = siptime == null ? null : siptime.trim();
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