package com.maggie.singletontest;

import com.maggie.singletontest.lazy.LazySingleton;

/**
 * Description: 采用线程池，两个线程来演示全过程
 * author:MaggieHao
 * Date:2019-05-08-21:29:57
 */


public class ExecutorThread implements Runnable {


    @Override
    public void run() {
        LazySingleton lazySingleton = LazySingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + lazySingleton);
    }
}
