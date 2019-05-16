package com.maggie.test;

import java.util.ArrayList;
import java.util.List;

/**
 * Description: 测试String的引用
 * author:MaggieHao
 * Date:2019-05-15
 * Time:07:24
 */
public class ReferenceStringTest {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "world";

        System.out.println(s1 + "-----------" + s2);


        change(s1, s2);

        System.out.println(s1 + "-----------" + s2);
//
//
//        StringBuffer sb1 = new StringBuffer("hello");
//        StringBuffer sb2 = new StringBuffer("world");
//
//        System.out.println(sb1 + "-----------" + sb2);
//
//        change(sb1, sb2);
//
//        System.out.println(sb1 + "-----------" + sb2);



/*
        String a = new String("abc");
        String b= new String("abc");
        String c = "abc";


        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println(b==c);
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(b.equals(c));
*/


    }

    private static void change(String s1, String s2) {
        s1 = s2;
        s2 = s1 + s2;
        System.out.println("change 之后的s2："+s2);
    }

    private static void change(StringBuffer s1, StringBuffer s2) {
        s1 = s2;
        s2.append(s1);

    }

}
