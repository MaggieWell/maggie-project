package com.maggie.pattern.delegate.simple;

/**
 * Description: 委派模式联系，老板类
 * author:MaggieHao
 * Date:2019-06-25
 * Time:22:41
 */
public class Boss {

    public void command(String command,Leader leader){
        leader.doing(command);
    }
}
