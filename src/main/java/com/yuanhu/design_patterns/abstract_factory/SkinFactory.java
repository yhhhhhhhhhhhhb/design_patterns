package com.yuanhu.design_patterns.abstract_factory;

/**
 * @author yuanhu
 * @description 工厂抽象接口
 * @date 2019-12-10 0:20
 */
public interface SkinFactory {

    public Button createButton();

    public ComboBox createComboBox();

    public TextField createTextField();

}
