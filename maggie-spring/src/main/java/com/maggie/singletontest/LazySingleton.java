package com.maggie.singletontest;

/**
 * Description:懒汉式单例模式
 * author:MaggieHao
 * Date:2019-05-04-23:31:32
 */


public class LazySingleton {
    private static LazySingleton lazySingleton = null;

    public LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (null == lazySingleton){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
