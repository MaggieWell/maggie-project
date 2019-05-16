package com.maggie.prototype.simple;

import java.util.List;

/**
 * Description:
 * author:MaggieHao
 * Date:2019-05-16
 * Time:08:23
 */
public class ConcretePrototype implements Prototype {

    private int age;
    private String name;
    private List hobbies;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getHobbies() {
        return hobbies;
    }

    public void setHobbies(List hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public Prototype clone() {

        ConcretePrototype concretePrototype = new ConcretePrototype();
        concretePrototype.setName(this.name);
        concretePrototype.setAge(this.age);
        concretePrototype.setHobbies(this.hobbies);

        return concretePrototype;
    }
}
