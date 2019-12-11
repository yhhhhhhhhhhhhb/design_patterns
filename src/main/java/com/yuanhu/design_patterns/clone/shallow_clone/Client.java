package com.yuanhu.design_patterns.clone.shallow_clone;

/**
 * @author yuanhu
 * @description
 * @date 2019-12-12 0:55
 */
public class Client {

    private Prototype prototype;

    public Client(Prototype prototype) {
        this.prototype = prototype;
    }

    public Prototype startClone(Prototype concretePrototype) {
        return (Prototype) concretePrototype.clone();
    }
}
