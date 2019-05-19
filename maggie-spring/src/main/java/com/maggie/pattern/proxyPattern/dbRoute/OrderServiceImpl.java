package com.maggie.pattern.proxyPattern.dbRoute;

/**
 * Description:
 * author:MaggieHao
 * Date:2019-05-17
 * Time:22:43
 */
public class OrderServiceImpl implements OrderService{
    public int insert(Order order) {
        System.out.println("OrderDao 创建Order成功！");
        return 1;
    }

    @Override
    public int createOrder(Order order) {
        return 0;
    }
}
