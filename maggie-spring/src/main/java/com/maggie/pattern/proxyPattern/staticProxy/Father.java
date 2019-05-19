package com.maggie.pattern.proxyPattern.staticProxy;

import com.maggie.pattern.proxyPattern.Person;

/**
 * Description:
 * author:MaggieHao
 * Date:2019-05-17
 * Time:22:32
 */
public class Father {
    private Person person;

    public Father(Person person) {
        this.person = person;
    }

    public void findLove(){
        System.out.println("父亲物色对象");
        this.person.findLove();
        System.out.println("双方父母同意，确定关系");
    }
}
