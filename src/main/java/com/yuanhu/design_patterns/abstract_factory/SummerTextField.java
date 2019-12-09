package com.yuanhu.design_patterns.abstract_factory;

/**
 * @author yuanhu
 * @description
 * @date 2019-12-10 0:14
 */
public class SummerTextField implements TextField{

    @Override
    public void display() {
        System.out.println("显示蓝色边框文本框");
    }
}
