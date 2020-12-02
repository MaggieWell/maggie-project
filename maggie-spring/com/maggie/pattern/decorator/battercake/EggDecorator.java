package com.maggie.pattern.decorator.battercake;



/**
 * @Auther  MaggieHao
 * @Date  2020-12-02
 * @Time  22:38
 */
public class EggDecorator extends BatterCakeDecorator{

    private BatterCake batterCake;

    public EggDecorator(BatterCake batterCake) {
        super(batterCake);
    }

    @Override
    protected String getMsg() {
        return super.getMsg() + "加1个鸡蛋";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 1;
    }
}
