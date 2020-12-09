package com.maggie.pattern.flyweight.ticket;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * @Auther MaggieHao
 * @Date 2020-12-06
 * @Time 21:34
 */
public class TicketFactory {
    private static Map<String, ITicket> pool = new HashMap<>();

    public  static ITicket queryTicket(String from,String to) {
        String key = from + "->" + to;
        if(pool.containsKey(key)) {
            System.out.println("使用缓存：" + key);
            return pool.get(key);
        }
        System.out.println("首次查询，创建对象：" + key);
        ITicket ticket = new TrainTicket(from,to);
        pool.put(key,ticket);
        return ticket;
    }

}
