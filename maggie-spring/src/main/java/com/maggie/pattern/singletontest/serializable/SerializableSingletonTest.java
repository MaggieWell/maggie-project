package com.maggie.pattern.singletontest.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Description:
 * author:MaggieHao
 * Date:2019-05-09-00:00:07
 */
public class SerializableSingletonTest {
    public static void main(String[] args) {
        SerializableSingleton serializableSingleton = null;
        SerializableSingleton serializableSingleton1 = SerializableSingleton.getInstance();

        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("SerializableSingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(serializableSingleton1);
            oos.flush();
            oos.close();

            FileInputStream fis = new FileInputStream("SerializableSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            serializableSingleton = (SerializableSingleton) ois.readObject();
            ois.close();

            System.out.println("111111111" + serializableSingleton);
            System.out.println("2222222" + serializableSingleton1);
            System.out.println(serializableSingleton == serializableSingleton1);

        } catch (Exception e) {
            System.out.println(e);
        }


    }


}
