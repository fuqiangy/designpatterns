package com.yfq.design.patterns.abstractfactory;

public class MideaAirConditioner implements IAirConditioner {
    @Override
    public void desiccation() {
        System.out.println("美的空调 可以除湿");
    }
}
