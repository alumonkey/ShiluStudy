package com.shilu.designPattern.adapter.demo;
import java.io.File;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
/**
 * Created by shilu on 15-11-16.
 */
public class LogFileOperate implements LogFileOperateApi {
    /*
 * 设置日志文件的路径和文件名称
 */
    private String logFileName = "file.log";
    /*
     * 构造方法，传入文件的路径和名称
     */
    public LogFileOperate(String logFilename){
        if(logFilename!=null){
            this.logFileName = logFilename;
        }
    }

    @Override
    public List<LogBean> readLogFile() {
        // TODO Auto-generated method stub
        List<LogBean> list = null;
        ObjectInputStream oin =null;
        //业务代码
        return list;
    }

    @Override
    public void writeLogFile(List<LogBean> list) {
        // TODO Auto-generated method stub
        File file = new File(logFileName);
        ObjectOutputStream oout = null;
        //业务代码
    }
}
