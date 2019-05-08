package com.maggie.singletontest;

/**
 * 饿汉式单例模式
 * author:MaggieHao
 * Date:2019-05-04
 * Time:23:21
 */

public class HungrySingleton {
    private static final HungrySingleton hungry = new HungrySingleton();

    private HungrySingleton() { }

    public static HungrySingleton getInstance(){
        return hungry;
    }

}
