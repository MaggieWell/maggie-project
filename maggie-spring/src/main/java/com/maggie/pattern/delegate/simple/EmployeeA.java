package com.maggie.pattern.delegate.simple;

/**
 * Description:
 * author:MaggieHao
 * Date:2019-06-25
 * Time:22:49
 */
public class EmployeeA implements IEmployee {
    @Override
    public void doing(String command) {

        System.out.println("I am EmployeeA,and I good at encryption. I am doing this:" + command);
    }
}
