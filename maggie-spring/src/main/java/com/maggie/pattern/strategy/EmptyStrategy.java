package com.maggie.pattern.strategy;

/**
 * Description:没有任何优惠的
 * author:MaggieHao
 * Date:2019-07-08
 * Time:22:34
 */
public class EmptyStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("无促销优惠");
    }
}
