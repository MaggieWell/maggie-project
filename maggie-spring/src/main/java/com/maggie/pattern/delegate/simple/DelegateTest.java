package com.maggie.pattern.delegate.simple;

/**
 * Description:委派模式测试
 * author:MaggieHao
 * Date:2019-06-25
 * Time:22:59
 */
public class DelegateTest {
    public static void main(String[] args) {
        new Boss().command("architecture",new Leader());
    }
}
