package com.maggie.pattern.prototype.simple;

import java.io.Serializable;

/**
 * 原型模式：引用对象金箍棒类
 *
 * @author Maggie.Hao
 * @date 2019/5/16 18:02
 */
public class GoldHoop implements Serializable{
    public float h=100;
    public float d=10;

    public void big(){
        this.d *=2;
        this.h *=2;
    }

    public void small(){
        this.d /=2;
        this.h /=2;
    }

}
