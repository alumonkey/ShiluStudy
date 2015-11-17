package com.shilu.designPattern.singleton;
/**
 * Created by shilu on 15-11-17.
 *　同步效率低
 */
public class LazySingleton {

    private LazySingleton(){
        System.out.println("LazySingleton is create");
    }

    private static LazySingleton instance = null;

    public static synchronized LazySingleton getInstance(){
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }
    public static void createString(){
        System.out.println("create String");
    }

    public static void main(String[] args){
        LazySingleton.createString();
    }
}
