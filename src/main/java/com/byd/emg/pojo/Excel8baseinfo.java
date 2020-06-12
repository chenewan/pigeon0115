package com.byd.emg.pojo;

public class Excel8baseinfo {
    private Long id;

    private String begindt;

    private String recipeName;

    private String weight;

    private String batch;

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

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName == null ? null : recipeName.trim();
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight == null ? null : weight.trim();
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch == null ? null : batch.trim();
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