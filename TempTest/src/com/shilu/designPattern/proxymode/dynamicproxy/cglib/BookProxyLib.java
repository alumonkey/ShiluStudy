package com.shilu.designPattern.proxymode.dynamicproxy.cglib;
import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * Created by shilu on 15-11-17.
 */
public class BookProxyLib implements MethodInterceptor {
    private Object target;

    /**
     * 创建代理对象
     *
     * @param target
     * @return
     */
    public Object getInstance(Object target){
        this.target = target;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(this.target.getClass());
        // 回调方法
        enhancer.setCallback(this);
        // 创建代理对象
        return  enhancer;
    }




    @Override public Object intercept(Object o,
            Method method,
            Object[] objects,
            MethodProxy methodProxy) throws Throwable {
        System.out.println();
        System.out.println("事物开始");
        methodProxy.invokeSuper(o, objects);
        System.out.println("事物结束");
        return null;
    }
}
