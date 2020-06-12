package com.byd.emg.pojo;

public class Excel1procedure {
    private Long id;

    private Long pid;

    private String process;

    private String begindt;

    private String materielno;

    private String addwater;

    private String manualfeeding;

    private String singleweight;

    private String cumulativeweight;

    private String vacuumsuction;

    private String stir;

    private String temperaturecontrol;

    private String pressurecontrol;

    private String stepnum;

    private String recordno;

    private String username;

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

    public String getMaterielno() {
        return materielno;
    }

    public void setMaterielno(String materielno) {
        this.materielno = materielno == null ? null : materielno.trim();
    }

    public String getAddwater() {
        return addwater;
    }

    public void setAddwater(String addwater) {
        this.addwater = addwater == null ? null : addwater.trim();
    }

    public String getManualfeeding() {
        return manualfeeding;
    }

    public void setManualfeeding(String manualfeeding) {
        this.manualfeeding = manualfeeding == null ? null : manualfeeding.trim();
    }

    public String getSingleweight() {
        return singleweight;
    }

    public void setSingleweight(String singleweight) {
        this.singleweight = singleweight == null ? null : singleweight.trim();
    }

    public String getCumulativeweight() {
        return cumulativeweight;
    }

    public void setCumulativeweight(String cumulativeweight) {
        this.cumulativeweight = cumulativeweight == null ? null : cumulativeweight.trim();
    }

    public String getVacuumsuction() {
        return vacuumsuction;
    }

    public void setVacuumsuction(String vacuumsuction) {
        this.vacuumsuction = vacuumsuction == null ? null : vacuumsuction.trim();
    }

    public String getStir() {
        return stir;
    }

    public void setStir(String stir) {
        this.stir = stir == null ? null : stir.trim();
    }

    public String getTemperaturecontrol() {
        return temperaturecontrol;
    }

    public void setTemperaturecontrol(String temperaturecontrol) {
        this.temperaturecontrol = temperaturecontrol == null ? null : temperaturecontrol.trim();
    }

    public String getPressurecontrol() {
        return pressurecontrol;
    }

    public void setPressurecontrol(String pressurecontrol) {
        this.pressurecontrol = pressurecontrol == null ? null : pressurecontrol.trim();
    }

    public String getStepnum() {
        return stepnum;
    }

    public void setStepnum(String stepnum) {
        this.stepnum = stepnum == null ? null : stepnum.trim();
    }

    public String getRecordno() {
        return recordno;
    }

    public void setRecordno(String recordno) {
        this.recordno = recordno == null ? null : recordno.trim();
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