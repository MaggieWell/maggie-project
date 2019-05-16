package com.maggie.singletontest;

/**
 * Description:容器式注册单例模式
 * author:MaggieHao
 * Date:2019-05-14
 * Time:22:02
 */
public class ContainerSingletonTest {

    public static void main(String[] args) {
        Object obj = ContainerSingleton.getBean("com.maggie.singletontest.Pojo");

        System.out.println(obj);
    }
}
