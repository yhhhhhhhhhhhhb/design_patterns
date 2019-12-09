package com.yuanhu.design_patterns.abstract_factory;

/**
 * @author yuanhu
 * @description
 * @date 2019-12-10 0:02
 */
public class SpringButton implements Button{

    @Override
    public void display() {

        System.out.println("显示浅绿色按钮");

    }
}
