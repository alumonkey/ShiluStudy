package com.shilu.designPattern.singleton;
/**
 * Created by shilu on 15-11-17.
 * 内部类方式实现单例
 */
public class StaticSingleton {

    private StaticSingleton(){
        System.out.println("StaticSingleton is create");
    }
    private static class SingletonHolder{
        private static StaticSingleton instance = new StaticSingleton();
    }
    public static StaticSingleton getInstance(){
        return SingletonHolder.instance;
    }
}
