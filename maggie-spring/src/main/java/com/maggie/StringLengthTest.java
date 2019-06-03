package com.maggie;

/**
* Description: 计算字符的长度，英文一个字母一个字节，中文一个字，两个字节
* author:MaggieHao
* Date:2019-06-03-14:33:37
*
* */
public class StringLengthTest {
    public static void main(String[] args){
        int realLen = 0;
        String a = "fdafsdfdsfasdfa发送到发送到发送到发的所发生的发顺丰";
        for (int i = 0; i < a.length(); i++) {
            char b = a.charAt(i);
            if (b >= 0 && b<= 128){
                realLen += 1;
            } else {
                realLen += 2;
            }
        }

        System.out.println("长度是："+realLen);

    }


}
