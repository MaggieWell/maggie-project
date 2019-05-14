package com.maggie.singletontest.lazy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Description:
 * author:MaggieHao
 * Date:2019-05-08
 * Time:23:37
 */

public class LazyInnerClassSingletonTest {
    public static void main(String[] args) {

        try {
            //调用者使用反射实例化了一个对象，破坏了单例
            Class<?> clazz = LazyInnerClassSingleton.class;
            Constructor c = clazz.getDeclaredConstructor(null);
            c.setAccessible(true);
            try {
                Object o1 = c.newInstance();
                Object o2 = LazyInnerClassSingleton.getInstance();

                System.out.println("o1:" + o1);
                System.out.println("o2:" + o2);

            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }


}
