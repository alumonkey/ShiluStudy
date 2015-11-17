package com.shilu.designPattern.singleton;
/**
 * Created by shilu on 15-11-17.
 */
public class Singleton {

    private Singleton() {
        System.out.println("Singleton is create");
    }
    private static Singleton instance = new Singleton();
    public static Singleton getInsatnce(){
        return instance;
    }
}
