package com.yuanhu.design_patterns.adapter;

/**
 * @author yuanhu
 * @description
 * @date 2019-12-12 0:07
 */
public abstract class CarController {

    public void move() {
        System.out.println("汽车移动！");
    }

    /**
     * 发出声音
     */
    public abstract void phonate();

    /**
     * 灯光闪烁
     */
    public abstract void twinkle();
}
