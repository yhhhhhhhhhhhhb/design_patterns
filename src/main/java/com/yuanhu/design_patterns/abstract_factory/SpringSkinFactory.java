package com.yuanhu.design_patterns.abstract_factory;

/**
 * @author yuanhu
 * @description
 * @date 2019-12-10 0:23
 */
public class SpringSkinFactory implements SkinFactory{

    @Override
    public Button createButton() {
        return new SpringButton();
    }

    @Override
    public ComboBox createComboBox() {
        return new SpringComboBox();
    }

    @Override
    public TextField createTextField() {
        return new SpringTextField();
    }
}
