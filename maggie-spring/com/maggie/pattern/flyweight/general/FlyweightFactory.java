package com.maggie.pattern.flyweight.general;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther MaggieHao
 * @Date 2020-12-06
 * @Time 21:26
 * 享元工厂
 */
public class FlyweightFactory {
    public static Map<String, IFlyweight> pool = new HashMap<>();

    //因为内部状态具备不变性，因此作为缓存的键
    public static IFlyweight getFlyweight(String  intrinsicState) {
        if(!pool.containsKey(intrinsicState)) {
            IFlyweight flyweight = new ConcreteFlyWeight(intrinsicState);
            pool.put(intrinsicState, flyweight);
        }
        return pool.get(intrinsicState);
    }
}
