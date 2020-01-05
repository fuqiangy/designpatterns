package com.yfq.design.patterns.abstractfactory;

public class GreeRefrigerator implements IRefrigerator {
    @Override
    public void fresh() {
        System.out.println("格力冰箱 可以保鲜");
    }
}
