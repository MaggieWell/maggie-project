package com.maggie.pattern.strategy;

/**
 * Description:
 * author:MaggieHao
 * Date:2019-07-08
 * Time:22:35
 */
public class GroupBuyStrategy  implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("拼团，满20人可拼团，全团享受团购价格");
    }
}
