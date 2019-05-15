package com.maggie;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 创建线程池测试
 *
 * @author Maggie.Hao
 * @date 2019/5/8 11:07
 */
public class ThreadTest {
    public static void main(String[] args){
/*        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.execute(() -> System.out.println("Asynchronous task"));
        executorService.shutdown();
        */

        int[] a = {3,5,7,2,6,1};
        a = boubleSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+",");
        }

    }

    /**
     * 降序：
     * 第一个数字和后面所有的数字比较，如果比后面数字小，就交换位置
     * @param source
     * @return
     */
    public static int[] boubleSort(int[] source){
        for (int i = 0; i < source.length; i++) {
            System.out.println(source[i]);
            for (int j = i+1; j < source.length -1; j++) {
                if (source[i] < source[j]) {
                    System.out.println(source[j]);
                    int temp = source[i];
                    source[i] = source[j];
                    source[j] = temp;
                }
            }
        }
        return source;
    }
}
