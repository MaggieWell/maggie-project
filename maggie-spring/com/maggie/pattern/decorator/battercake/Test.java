package com.maggie.pattern.decorator.battercake;

/**
 * @Auther MaggieHao
 * @Date 2020-12-02
 * @Time 22:20
 */
public class Test {

    public static void main(String[] args) {
        BatterCake batterCake = new BaseBatterCake();
        batterCake = new EggDecorator(batterCake);
        batterCake = new SauageDecorator(batterCake);
        System.out.println(batterCake.getMsg() + ",总价" + batterCake.getPrice());

    }
}
