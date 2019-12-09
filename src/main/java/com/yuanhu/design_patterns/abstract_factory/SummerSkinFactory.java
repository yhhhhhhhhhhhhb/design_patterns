package com.yuanhu.design_patterns.abstract_factory;

/**
 * @author yuanhu
 * @description
 * @date 2019-12-10 0:25
 */
public class SummerSkinFactory implements SkinFactory{

    @Override
    public Button createButton() {
        return new SummerButton();
    }

    @Override
    public ComboBox createComboBox() {
        return new SummerComboBox();
    }

    @Override
    public TextField createTextField() {
        return new SummerTextField();
    }
}
