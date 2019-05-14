package com.maggie.singletontest.register;

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
        EnumSingleton seriableSingleton = null;
        EnumSingleton seriableSingleton1 = EnumSingleton.getInstance();
        seriableSingleton1.setData(new Object());
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("SeriableSingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(seriableSingleton1);
            oos.flush();
            oos.close();

            FileInputStream fis = new FileInputStream("SeriableSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            seriableSingleton = (EnumSingleton) ois.readObject();
            ois.close();

            System.out.println("111111111" + seriableSingleton.getData());
            System.out.println("2222222" + seriableSingleton1.getData());
            System.out.println(seriableSingleton == seriableSingleton1);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
