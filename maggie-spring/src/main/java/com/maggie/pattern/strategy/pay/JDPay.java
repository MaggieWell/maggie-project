package com.maggie.pattern.strategy.pay;

/**
 * Description:
 * author:MaggieHao
 * Date:2019-07-09
 * Time:22:53
 */
public class JDPay extends Payment {
    @Override
    public String getName() {
        return "京东白条";
    }

    @Override
    protected double queryBalance(String uid) {
        return 500;
    }
}
