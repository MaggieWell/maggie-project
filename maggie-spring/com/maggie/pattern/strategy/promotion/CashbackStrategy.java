package com.maggie.pattern.strategy.promotion;

/**
 * Description:
 * author:MaggieHao
 * Date:2020-05-28
 * Time:22:05
 */
public class CashbackStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("返现促销，返回金额直接返回支付宝");
    }
}
