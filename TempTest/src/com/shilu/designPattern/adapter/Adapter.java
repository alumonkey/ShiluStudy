package com.shilu.designPattern.adapter;
/**
 * Created by shilu on 15-11-16.
 */
public class Adapter implements Target {
    /*
    * 持有需要被适配的接口对象
    */
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override public void request() {
        // TODO Auto-generated method stub
        adaptee.specificRequest();
    }
}
