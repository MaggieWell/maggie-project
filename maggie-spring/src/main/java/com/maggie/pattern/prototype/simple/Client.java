package com.maggie.pattern.prototype.simple;

/**
 * Description: 接收原型
 * author:MaggieHao
 * Date:2019-05-16
 * Time:08:23
 */
public class Client {

    public Prototype startClone(Prototype prototype) {
        return prototype.clone();
    }
}
