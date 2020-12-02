package com.maggie.pattern.decorator.battercake;


/**
 * @Auther  MaggieHao
 * @Date  2020-12-02
 * @Time  22:22
 */
public class BaseBatterCake extends BatterCake{

    @Override
    protected String getMsg() {
        return "煎饼";
    }

    @Override
    protected int getPrice() {
        return 5;
    }
}
