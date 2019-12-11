package com.yuanhu.design_patterns.adapter;

/**
 * @author yuanhu
 * @description
 * @date 2019-12-12 0:22
 */
public class PoliceCarAdapter extends CarController{

    PoliceLamp policeLamp;
    PolicSound policSound;

    public PoliceCarAdapter() {
        policeLamp = new PoliceLamp();
        policSound = new PolicSound();
    }

    @Override
    public void phonate() {
        policSound.alarmSound();
    }

    @Override
    public void twinkle() {
        policeLamp.alarmLamp();
    }
}
