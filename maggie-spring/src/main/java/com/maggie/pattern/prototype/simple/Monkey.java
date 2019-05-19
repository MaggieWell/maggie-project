package com.maggie.pattern.prototype.simple;

import java.util.Date;

/**
 * 原型模式：猴子
 *
 * @author Maggie.Hao
 * @date 2019/5/16 18:02
 */
public class Monkey {
    private int height;
    private int weight;
    private Date birthDay;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }
}
