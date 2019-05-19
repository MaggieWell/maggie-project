package com.maggie.pattern.singletontest.serializable;

import java.io.Serializable;

/**
* Description:
* author:MaggieHao
* Date:2019-05-09-00:00:07
*
* */
public class SerializableSingleton implements Serializable {
    public final static SerializableSingleton INSTANCE = new SerializableSingleton();
    private SerializableSingleton(){}


    public static SerializableSingleton getInstance() {
        return INSTANCE;
    }
    private Object readResolve(){
        return INSTANCE;
    }
}
