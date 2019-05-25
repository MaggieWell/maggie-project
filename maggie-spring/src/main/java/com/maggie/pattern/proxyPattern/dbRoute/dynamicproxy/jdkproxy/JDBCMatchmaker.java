package com.maggie.pattern.proxyPattern.dbRoute.dynamicproxy.jdkproxy;

import com.maggie.pattern.proxyPattern.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Description:媒婆
 * author:MaggieHao
 * Date:2019-05-19
 * Time:20:25
 */
public class JDBCMatchmaker implements InvocationHandler {

    private Person person;
    public Object getInstance(Person person){
        this.person = person;
        Class<?> clazz = person.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object obj = method.invoke(this.person,args);
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
