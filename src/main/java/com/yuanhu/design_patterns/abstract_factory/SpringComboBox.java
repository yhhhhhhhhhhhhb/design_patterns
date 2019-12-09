package com.yuanhu.design_patterns.abstract_factory;

/**
 * @author yuanhu
 * @description
 * @date 2019-12-10 0:19
 */
public class SpringComboBox implements ComboBox{

    @Override
    public void display() {
        System.out.println("显示绿色边框组合框");
    }
}
