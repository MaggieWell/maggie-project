package com.maggie.pattern.strategy;

/**
 * Description:促销活动，需要执行发布
 * author:MaggieHao
 * Date:2019-07-08
 * Time:22:35
 */
public class PromotionActivity {
    PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void excute(){
        this.promotionStrategy.doPromotion();

    }
}
