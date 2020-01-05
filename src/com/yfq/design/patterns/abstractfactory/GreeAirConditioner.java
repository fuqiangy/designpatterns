package com.yfq.design.patterns.abstractfactory;

/**
 * 格力空调产品
 */
public class GreeAirConditioner implements IAirConditioner {
    @Override
    public void desiccation() {
        System.out.println("格力空调 可以除湿");
    }
}
