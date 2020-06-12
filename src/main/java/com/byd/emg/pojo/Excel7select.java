package com.byd.emg.pojo;

public class Excel7select {
    private Long id;

    private Long pid;

    private String process;

    private String isselect;

    private String circulatingflow;

    private String isheating;

    private String heattemp;

    private String washtime;

    private String washnum;

    private Long countnum;

    private String begindt;

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

    public String getIsselect() {
        return isselect;
    }

    public void setIsselect(String isselect) {
        this.isselect = isselect == null ? null : isselect.trim();
    }

    public String getCirculatingflow() {
        return circulatingflow;
    }

    public void setCirculatingflow(String circulatingflow) {
        this.circulatingflow = circulatingflow == null ? null : circulatingflow.trim();
    }

    public String getIsheating() {
        return isheating;
    }

    public void setIsheating(String isheating) {
        this.isheating = isheating == null ? null : isheating.trim();
    }

    public String getHeattemp() {
        return heattemp;
    }

    public void setHeattemp(String heattemp) {
        this.heattemp = heattemp == null ? null : heattemp.trim();
    }

    public String getWashtime() {
        return washtime;
    }

    public void setWashtime(String washtime) {
        this.washtime = washtime == null ? null : washtime.trim();
    }

    public String getWashnum() {
        return washnum;
    }

    public void setWashnum(String washnum) {
        this.washnum = washnum == null ? null : washnum.trim();
    }

    public Long getCountnum() {
        return countnum;
    }

    public void setCountnum(Long countnum) {
        this.countnum = countnum;
    }

    public String getBegindt() {
        return begindt;
    }

    public void setBegindt(String begindt) {
        this.begindt = begindt == null ? null : begindt.trim();
    }
}