package com.maggie.test;

import java.util.ArrayList;
import java.util.List;

/**
 * Description: 测试Java中的值传递和引用传递
 * author:MaggieHao
 * Date:2019-05-15
 * Time:07:24
 */
public class ReferenceTest {
    public static void main(String[] args) {
        List<List<String>> fatherList = new ArrayList<>();
        List<String> childrenList = new ArrayList<>();

        childrenList.add("before add children List");

        fatherList.add(childrenList);

        childrenList.add("after add children List");

        for (List<String> strings : fatherList) {
            for (String string : strings) {
                System.out.println("fatherList:"+string);
            }
        }

        for (String s : childrenList) {
            System.out.println("childList:"+s);
        }
    }

}
