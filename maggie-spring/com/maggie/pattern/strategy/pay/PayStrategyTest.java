package com.maggie.pattern.strategy.pay;

/**
 * Description:
 * author:MaggieHao
 * Date:2019-07-09
 * Time:22:56
 */
public class PayStrategyTest {
    public static void main(String[] args) {
        com.maggie.pattern.strategy.pay.Order order = new com.maggie.pattern.strategy.pay.Order("1","20190709",200.21);
        com.maggie.pattern.strategy.pay.MsgResult result = order.pay(com.maggie.pattern.strategy.pay.PayStrategy.ALI_PAY);
        com.maggie.pattern.strategy.pay.MsgResult result2 = order.pay(com.maggie.pattern.strategy.pay.PayStrategy.JD_PAY);
        com.maggie.pattern.strategy.pay.MsgResult result3 = order.pay(com.maggie.pattern.strategy.pay.PayStrategy.WECHANT_PAY);
        com.maggie.pattern.strategy.pay.MsgResult result4 = order.pay(com.maggie.pattern.strategy.pay.PayStrategy.UNION_PAY);

        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

    }
}
