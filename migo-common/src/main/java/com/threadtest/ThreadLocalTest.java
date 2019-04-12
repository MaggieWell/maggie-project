package com.threadtest;

/**
 * @author Maggie.Hao
 * @date 2019/4/9 15:24
 */
public class ThreadLocalTest {
    static ThreadLocal<Integer> num = new ThreadLocal<Integer>(){
        protected Integer initialValue(){
            return 0;
        }
    };

    public static void main(String[] args) {
        //每个线程所拿到的num值是不确定的？
        Thread [] threads = new Thread[5];
        for (int i = 0;i<threads.length;i++){
            threads[i] = new Thread(()->{
               int localNum = num.get();
               localNum=localNum+5;
               num.set(localNum);//设置修改以后的值
                System.out.println(Thread.currentThread().getName()+":"+num.get());
            },"thread-"+i);
        }
        for (Thread thread :
                threads) {
            thread.start();
        }
    }
}


























