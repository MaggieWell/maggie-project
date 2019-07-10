package com.maggie.pattern.strategy.promotion;

/**
 * Description:返现
 * author:MaggieHao
 * Date:2019-07-08
 * Time:22:33
 */
public class CashbackStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("返现促销，返回金额直接返回支付宝");
    }
}
