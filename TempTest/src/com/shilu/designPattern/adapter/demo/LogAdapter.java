package com.shilu.designPattern.adapter.demo;
import java.util.List;
/**
 * Created by shilu on 15-11-16.
 */
public class LogAdapter implements LogDbOpeApi{

    private LogFileOperate logFileOperate;

    public LogAdapter(LogFileOperate logFileOperate) {
        this.logFileOperate = logFileOperate;
    }

    @Override public void createLog(LogBean logbean) {
        List<LogBean> list = logFileOperate.readLogFile();
        list.add(logbean);
        logFileOperate.writeLogFile(list);
    }
}
