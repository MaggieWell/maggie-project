package com.maggie.singletontest.threadlocal;

/**
 * Description:
 * author:MaggieHao
 * Date:2019-05-14
 * Time:22:28
 */
public class ThreadLocalSingleton {
    private ThreadLocalSingleton() {
    }

    private static final ThreadLocal<ThreadLocalSingleton> threadlocalInstance = new ThreadLocal<ThreadLocalSingleton>(){
        @Override
        protected ThreadLocalSingleton initialValue(){
            return new ThreadLocalSingleton();
        }
    };
    public static ThreadLocalSingleton getInstance(){
        return threadlocalInstance.get();
    }
}
