package com.maggie.pattern.proxyPattern.dbRoute.dynamicproxy.maggieproxy;

import com.maggie.pattern.proxyPattern.Person;
import com.maggie.pattern.proxyPattern.dbRoute.dynamicproxy.jdkproxy.Girl;
import com.maggie.pattern.proxyPattern.dbRoute.dynamicproxy.jdkproxy.JDBCMatchmaker;

/**
 * Description:媒婆
 * author:MaggieHao
 * Date:2019-05-19
 * Time:20:25
 */
public class MaggieProxyTest {
    public static void main(String[] args) {

        Person obj=(Person)new MaggieMatchmaker().getInstance(new Girl());
        obj.findLove();
    }


}
