package com.yuanhu.design_patterns.adapter;

/**
 * @author yuanhu
 * @description
 * @date 2019-12-12 0:26
 */
public class Client {

    public static void main(String[] args) {
        CarController carController = new PoliceCarAdapter();
        carController.move();
        carController.phonate();
        carController.twinkle();
    }

}
