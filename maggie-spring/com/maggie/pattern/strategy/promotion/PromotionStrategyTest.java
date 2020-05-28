package com.maggie.pattern.strategy.promotion;

/**
* Description:
* author:MaggieHao
* Date:2019-07-08-22:43:10
*
* */
public class PromotionStrategyTest {

/*    public static void main(String[] args) {
        PromotionActivity activity618 = new PromotionActivity(new CouponStrategy());
        PromotionActivity activity1111 = new PromotionActivity(new CashbackStrategy());

        activity618.excute();
        activity1111.excute();

    }*/


/*    public static void main(String[] args) {
        PromotionActivity activity = null;
        String promotionKey = "COUPON";
        if(StringUtils.equals(promotionKey,"COUNPON")){
            activity = new PromotionActivity(new CouponStrategy());
        }

        activity.excute();


    }*/

    public static void main(String[] args) {
        String promotionKey = "GROUPBUY";
        PromotionActivity promotionActivity = new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy(promotionKey));
        promotionActivity.excute();

    }


}
