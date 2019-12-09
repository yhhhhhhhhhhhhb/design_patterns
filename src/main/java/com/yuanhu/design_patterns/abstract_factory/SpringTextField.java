package com.yuanhu.design_patterns.abstract_factory;

/**
 * @author yuanhu
 * @description
 * @date 2019-12-10 0:12
 */
public class SpringTextField implements TextField{

    @Override
    public void display() {
        System.out.println("显示绿色边框文本框");
    }

}
