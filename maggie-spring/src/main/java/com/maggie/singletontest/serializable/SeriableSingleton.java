package com.maggie.singletontest.serializable;

import java.io.Serializable;

/**
* Description:
* author:MaggieHao
* Date:2019-05-09-00:00:07
*
* */
public class SeriableSingleton implements Serializable {
    public final static SeriableSingleton INSTANCE = new SeriableSingleton();
    private SeriableSingleton(){}


    public static SeriableSingleton getInstance() {
        return INSTANCE;
    }
    private Object readResolve(){
        return INSTANCE;
    }
}
