package com.maggie.singletontest.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Description:
 * author:MaggieHao
 * Date:2019-05-09-00:00:07
 */
public class SeriableSingletonTest {
    public static void main(String[] args) {
        SeriableSingleton seriableSingleton = null;
        SeriableSingleton seriableSingleton1 = SeriableSingleton.getInstance();

        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("SeriableSingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(seriableSingleton1);
            oos.flush();
            oos.close();

            FileInputStream fis = new FileInputStream("SeriableSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            seriableSingleton = (SeriableSingleton) ois.readObject();
            ois.close();

            System.out.println("111111111" + seriableSingleton);
            System.out.println("2222222" + seriableSingleton1);
            System.out.println(seriableSingleton == seriableSingleton1);

        } catch (Exception e) {
            System.out.println(e);
        }


    }


}
