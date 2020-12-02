package com.maggie.pattern.decorator.battercake;



/**
 * @Auther  MaggieHao
 * @Date  2020-12-02
 * @Time  22:38
 */
public class BatterCakeDecorator extends BatterCake{

    private BatterCake batterCake;

    public BatterCakeDecorator(BatterCake batterCake) {
        this.batterCake = batterCake;
    }

    @Override
    protected String getMsg() {
        return this.batterCake.getMsg();
    }

    @Override
    protected int getPrice() {
        return this.batterCake.getPrice();
    }
}
