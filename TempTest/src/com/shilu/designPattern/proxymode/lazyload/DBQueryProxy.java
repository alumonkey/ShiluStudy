package com.shilu.designPattern.proxymode.lazyload;
/**
 * Created by shilu on 15-11-17.
 */
public class DBQueryProxy implements IDBQuery {

    private  DBQuery real_db_Query=null;

    @Override public String request() {
        // TODO Auto-generated method stub
        //在真正需要的时候才能创建真实对象，创建过程可能很慢
        if(real_db_Query==null){
            real_db_Query = new DBQuery();
        }//在多线程环境下，这里返回一个虚假类，类似于 Future 模式
        return real_db_Query.request();
    }
}
