package com.maggie.pattern.proxyPattern.dbRoute.dynamicproxy.jdkproxy;

import com.maggie.pattern.proxyPattern.Person;

/**
 * Description:
 * author:MaggieHao
 * Date:2019-05-19
 * Time:20:25
 */
public class Girl implements Person {
    @Override
    public void findLove() {
        System.out.println("高富帅");
        System.out.println("身高180");
        System.out.println("6块腹肌");
    }
}
