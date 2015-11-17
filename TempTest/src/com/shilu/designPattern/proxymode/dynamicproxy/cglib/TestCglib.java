package com.shilu.designPattern.proxymode.dynamicproxy.cglib;
/**
 * Created by shilu on 15-11-17.
 */
public class TestCglib {

    public static void main(String[] args) {
        BookProxyLib cglib = new BookProxyLib();
        BookProxyImpl bookCglib = (BookProxyImpl)cglib.getInstance(new BookProxyImpl());
        bookCglib.addBook();
    }
}
