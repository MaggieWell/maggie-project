package com.maggie.pattern.strategy.pay;

/**
 * Description:
 * author:MaggieHao
 * Date:2019-07-09
 * Time:22:56
 */
public class PayStrategyTest {
    public static void main(String[] args) {
        Order order = new Order("1","20190709",200.21);
        MsgResult result = order.pay(PayStrategy.ALI_PAY);
        MsgResult result2 = order.pay(PayStrategy.JD_PAY);
        MsgResult result3 = order.pay(PayStrategy.WECHANT_PAY);
        MsgResult result4 = order.pay(PayStrategy.UNION_PAY);

        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

    }
}
