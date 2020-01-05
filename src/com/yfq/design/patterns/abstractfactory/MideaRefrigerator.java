package com.yfq.design.patterns.abstractfactory;

public class MideaRefrigerator implements IRefrigerator {
    @Override
    public void fresh() {
        System.out.println("美的冰箱 可以保鲜");
    }
}
