package com.maggie.pattern.singletontest.lazy;

import com.maggie.pattern.singletontest.ExecutorThread;

/**
 * Description:懒汉式单例模式，使用debug的模式线程模式
 * author:MaggieHao
 * Date:2019-05-04-23:31:32
 */
public class LazySingletonTest {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new ExecutorThread());
        Thread thread2 = new Thread(new ExecutorThread());

        new Thread(new Runnable(){
            @Override
            public void run() {
                System.out.println("hello"+Thread.currentThread().getName());
            }
        }).start();


        thread1.start();
        thread2.start();
        System.out.println("Executor End");

    }
    
}
