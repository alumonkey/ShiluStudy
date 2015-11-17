package com.shilu.designPattern.proxymode.lazyload;
/**
 * Created by shilu on 15-11-17.
 */
public class Main {

    public static void main(String[] args) {
        IDBQuery idbQuery = new DBQueryProxy();//使用代理对象
        idbQuery.request();
    }
}
