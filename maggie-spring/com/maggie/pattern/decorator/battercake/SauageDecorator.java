package com.maggie.pattern.decorator.battercake;



/**
 * @Auther  MaggieHao
 * @Date  2020-12-02
 * @Time  22:38
 */
public class SauageDecorator extends BatterCakeDecorator{

    private BatterCake batterCake;

    public SauageDecorator(BatterCake batterCake) {
        super(batterCake);
    }

    @Override
    protected String getMsg() {
        return super.getMsg() + "加1根香肠";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 2;
    }
}
