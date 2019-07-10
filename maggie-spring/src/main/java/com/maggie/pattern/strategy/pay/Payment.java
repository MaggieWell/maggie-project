package com.maggie.pattern.strategy.pay;

/**
 * Description:
 * author:MaggieHao
 * Date:2019-07-09
 * Time:22:38
 */
public abstract class Payment {

    public abstract String getName();

    protected abstract double queryBalance(String uid);

    public MsgResult pay(String uid,double amount){
        if (queryBalance(uid)< amount){
            return new MsgResult(500,"余额不足","支付失败");
        }
        return new MsgResult(200,"支付金额："+amount,"支付成功");
    }
}
