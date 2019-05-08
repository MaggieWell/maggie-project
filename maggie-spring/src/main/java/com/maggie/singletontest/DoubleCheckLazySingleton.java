package com.maggie.singletontest;

/**
* Description:
* author:MaggieHao
* Date:2019-05-08-22:09:40
*
* */


public class DoubleCheckLazySingleton {
    private static DoubleCheckLazySingleton lazySingleton = null;

    public DoubleCheckLazySingleton() {
    }

    // 1、线程不安全的
    //public static LazySingleton getInstance() {

    //双层检查锁
    public  static DoubleCheckLazySingleton getInstance() {
        if (null == lazySingleton) {
            synchronized(DoubleCheckLazySingleton.class){
                if (null == lazySingleton) {
                    lazySingleton = new DoubleCheckLazySingleton();
                    //cpu执行时候回转换为JVM指令执行
                    //指令重排序问题，volatile
                    //1、分配内存给这个对象
                    //2、初始化对象
                    //3、讲初始化的对象和内存地址建立关联，赋值
                    //4、用户初次访问
                }
            }
        }
        return lazySingleton;
    }
}
