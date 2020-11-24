package com.maggie.pattern.facade.point;

/**
 *
 */
public class Test {
    public static void main(String[] args) {
        FacadeService facadeService = new FacadeService();
        GiftInfo giftInfo = new GiftInfo("hello");

        facadeService.exchange(giftInfo);
    }
}
