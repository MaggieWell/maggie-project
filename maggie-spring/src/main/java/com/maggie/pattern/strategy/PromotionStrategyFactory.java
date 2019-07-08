package com.maggie.pattern.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * Description:策略的工厂类,饿汉式单例
 * author:MaggieHao
 * Date:2019-07-08
 * Time:22:50
 */
public class PromotionStrategyFactory {

    private static Map<String,PromotionStrategy> PROMOTION_STRATEGY_MAP = new HashMap<>();

    static {
        PROMOTION_STRATEGY_MAP.put(PromotionKey.COUNPON,new CouponStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.CASHBACK,new CashbackStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.GROUPBUY,new GroupBuyStrategy());
    }

    public static final PromotionStrategy NON_PROMOTION = new EmptyStrategy();

    private  PromotionStrategyFactory(){}

    public static PromotionStrategy getPromotionStrategy(String promotionKey){

        PromotionStrategy promotionStrategy = PROMOTION_STRATEGY_MAP.get(promotionKey);

        return promotionStrategy == null ? NON_PROMOTION : promotionStrategy;
    }

    public interface PromotionKey{
        String COUNPON = "COUNPON";
        String CASHBACK = "CASHBACK";
        String GROUPBUY = "GROUPBUY";

    }

}
