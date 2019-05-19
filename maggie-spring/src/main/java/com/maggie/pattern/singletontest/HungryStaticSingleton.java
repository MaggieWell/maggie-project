package com.maggie.pattern.singletontest;

/**
 * 饿汉式单例模式
 * author:MaggieHao
 * Date:2019-05-04
 * Time:23:21
 */

public class HungryStaticSingleton {
    //如果不加final这个类可能会被别人通过反射机制覆盖
    private static final HungryStaticSingleton hungry;

    static {
        hungry = new HungryStaticSingleton();
    }


    private HungryStaticSingleton() {
    }

    public static HungryStaticSingleton getInstance() {
        return hungry;
    }

}
