package com.yuanhu.design_patterns.clone.deepin_clone;

import java.io.Serializable;

/**
 * @author yuanhu
 * @description
 * @date 2019-12-12 1:01
 */
public class JinGuBang implements Serializable {

    public float h = 100;
    public float d = 10;

    public void big() {
        this.d *= 2;
        this.h *= 2;
    }

    public void small(){
        this.d /= 2;
        this.h /= 2;
    }
}
