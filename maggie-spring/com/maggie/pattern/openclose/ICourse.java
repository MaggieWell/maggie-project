package com.maggie.pattern.openclose;

/**
 * Description:开闭原则，
 *  定义：一个软件实体如类、模块和函数应该对扩展开放，对修改关闭。用抽象构建框架，用实现扩展细节
 *  有点：提高系统的可复用性及可维护性
 * author:MaggieHao
 * Date:2020-05-28
 * Time:22:09
 */
public interface ICourse {
    Integer getId();
    String getName();
    Double getPrice();
}
