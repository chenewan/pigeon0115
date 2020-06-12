package com.byd.emg.common;

public enum  DBTypeEnum {
    db1("db1"), db2("db2"),db3("db3"), db4("db4"),db5("db5");
    private String value;
    DBTypeEnum(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }
}
