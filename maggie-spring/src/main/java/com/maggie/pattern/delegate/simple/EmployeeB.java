package com.maggie.pattern.delegate.simple;

/**
 * Description:雇员
 * author:MaggieHao
 * Date:2019-06-25
 * Time:22:49
 */
public class EmployeeB implements IEmployee {
    @Override
    public void doing(String command) {

        System.out.println("I am EmployeeB,and I good at Architecture. I am doing this:" + command);
    }
}
