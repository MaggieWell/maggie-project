package com.maggie.pattern.singletontest.threadlocal;

import com.maggie.pattern.singletontest.ExecutorThread;

/**
 * Description:
 * author:MaggieHao
 * Date:2019-05-14
 * Time:22:28
 */
public class ThreadLocalSingletonTest {

    public static void main(String[] args) {
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());

        Thread t1 = new Thread(new ExecutorThread());
        Thread t2 = new Thread(new ExecutorThread());
        Thread t3 = new Thread(new ExecutorThread());
        Thread t4 = new Thread(new ExecutorThread());
        t1.start();
        t2.start();
        t3.start();
        t4.start();



    }
}
