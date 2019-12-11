package com.yuanhu.design_patterns.clone.shallow_clone;

import java.util.List;

/**
 * @author yuanhu
 * @description
 * @date 2019-12-12 0:43
 */
public class ConcretePrototypeA implements Prototype{

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
    public ConcretePrototypeA clone() {
        ConcretePrototypeA prototype = new ConcretePrototypeA();
        prototype.setAge(this.age);
        prototype.setName(this.name);
        prototype.setHobbies(this.hobbies);
        return prototype;
    }
}
