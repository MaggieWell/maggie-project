package com.maggie.pattern.prototype.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 * author:MaggieHao
 * Date:2019-05-16
 * Time:08:23
 */
public class PrototypeTest{

    public static void main(String[] args) {
        ConcretePrototype concretePrototype = new ConcretePrototype();
        concretePrototype.setAge(18);
        concretePrototype.setName("Maggie");

        List<String> hobbies = new ArrayList<>();
        hobbies.add("eating");
        concretePrototype.setHobbies(hobbies);


        Client client = new Client();
        ConcretePrototype copy = (ConcretePrototype) client.startClone(concretePrototype);
        System.out.println(copy);


        System.out.println("克隆对象中引用类型的地址："+ copy.getHobbies());
        System.out.println("原对象中引用类型的地址："+ concretePrototype.getHobbies());
        System.out.println("对象本身的地址："+ (copy.getHobbies()== concretePrototype.getHobbies()));


    }


}
