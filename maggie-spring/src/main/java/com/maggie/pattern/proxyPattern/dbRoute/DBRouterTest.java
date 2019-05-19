package com.maggie.pattern.proxyPattern.dbRoute;

import com.maggie.pattern.proxyPattern.dbRoute.proxy.OrderServiceStaticProxy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Description:
 * author:MaggieHao
 * Date:2019-05-19
 * Time:18:01
 */
public class DBRouterTest {
    public static void main(String[] args) {
        Order order = new Order();
        order.setCreateTime(new Date().getTime());

        OrderService orderService = new OrderServiceStaticProxy(new OrderServiceImpl());

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = simpleDateFormat.parse("2017-05-19");
            order.setCreateTime(date.getTime());
            orderService.createOrder(order);

        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
