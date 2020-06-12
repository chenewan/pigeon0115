package com.byd.emg.service;

import com.byd.emg.vo.AllExcelTable;

public interface WinccToJavaService {
    AllExcelTable selectAllExcelTableByTime(String dbnum,String beginDT, String endDT );

    void deleteAllExcelTableByTime(String dbnum, String beginDT, String endDT);
}
