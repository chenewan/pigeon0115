package com.byd.emg.service;

import com.byd.emg.vo.AllExcelTable;

public interface JavaToTableService {
    AllExcelTable selectAllExcelTableByTime(String dbnum,String beginDT, String endDT );

    int insertAllExcelToTable(String dbnum, AllExcelTable allExcelTable);

    AllExcelTable compare2TableTo1(AllExcelTable allExcelTest1,AllExcelTable allExcelTest2 );

    AllExcelTable compare2TableToDb(String dbnum1, String dbnum2, String begindt, String enddt);


    boolean manualSynchronizationData(String dbnum, String begindt, String enddt);

    void insertAfterSelect(String dbnum, AllExcelTable allExcelTable1);
}
