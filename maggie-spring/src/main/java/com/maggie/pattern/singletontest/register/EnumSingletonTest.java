package com.maggie.pattern.singletontest.register;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Description:
 * author:MaggieHao
 * Date:2019-05-13
 * Time:22:37
 */

public class EnumSingletonTest {
    public static void main(String[] args) {
        EnumSingleton serializableSingleton = null;
        EnumSingleton serializableSingleton1 = EnumSingleton.getInstance();
        serializableSingleton1.setData(new Object());
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("EnumSingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(serializableSingleton1);
            oos.flush();
            oos.close();

            FileInputStream fis = new FileInputStream("EnumSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            serializableSingleton = (EnumSingleton) ois.readObject();
            ois.close();

            System.out.println("111111111" + serializableSingleton.getData());
            System.out.println("2222222" + serializableSingleton1.getData());
            System.out.println(serializableSingleton == serializableSingleton1);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
