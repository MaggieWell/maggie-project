package com.maggie.pattern.decorator.battercake;

/**
 * @Auther MaggieHao
 * @Date 2020-12-02
 * @Time 22:20
 */
public abstract class BatterCake {

    protected abstract String getMsg();
    protected abstract int getPrice();

    public BatterCake() {
    }
}
