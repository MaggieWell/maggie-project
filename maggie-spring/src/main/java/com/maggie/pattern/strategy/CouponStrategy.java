package com.maggie.pattern.strategy;

/**
 * Description:优惠券
 * author:MaggieHao
 * Date:2019-07-08
 * Time:22:34
 */
public class CouponStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("领取优惠券，课程价格直接减去优惠券面值抵扣");
    }
}
