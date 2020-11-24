package com.maggie.pattern.facade.point;

/**
 *
 */
public class PaymentService {
    public boolean pay(GiftInfo giftInfo) {
        System.out.println("扣减" + giftInfo.getName() + "积分成功！");
        return true;
    }
}
