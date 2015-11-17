package com.shilu.designPattern.adapter.demo;
/**
 * Created by shilu on 15-11-16.
 */
public interface LogDbOpeApi {

    /*
     * 新增日志
     * @param 需要新增的日志对象
    */
    public void createLog(LogBean logbean);
}
