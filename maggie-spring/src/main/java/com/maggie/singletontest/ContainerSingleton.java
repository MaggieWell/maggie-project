package com.maggie.singletontest;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Description:容器式注册单例模式
 * author:MaggieHao
 * Date:2019-05-14
 * Time:22:02
 */
public class ContainerSingleton {
    private ContainerSingleton() {
    }

    private static Map<String,Object> ioc = new ConcurrentHashMap<>();

    public static Object getBean(String className){
        if (!ioc.containsKey(className)) {
            Object obj = null;
            try {
                obj = Class.forName(className).newInstance();
                ioc.put(className,obj);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return obj;
        }

        return ioc.get(className);

    }
}
