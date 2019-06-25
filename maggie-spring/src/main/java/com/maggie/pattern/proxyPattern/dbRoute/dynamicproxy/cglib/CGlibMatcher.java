package com.maggie.pattern.proxyPattern.dbRoute.dynamicproxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Description:使用cglib动态代理
 * author:MaggieHao
 * Date:2019-05-26
 * Time:13:46
 */
public class CGlibMatcher implements MethodInterceptor {

    public Object getInstance(Class<?> clazz) throws Exception {
        //相当于Proxy，代理工具类
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        before();
        Object obj = methodProxy.invokeSuper(o,objects);
        after();
        return obj;

    }

    private void before(){
        System.out.println("我是媒婆，我要给你找对象，现在已经确认你的需求。");
    }

    private void after(){
        System.out.println("ok的话就准备办事吧。");
    }
}
