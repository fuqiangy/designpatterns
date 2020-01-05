package com.yfq.design.patterns.abstractfactory;

/**
 * 具体工厂生产一个产品族
 */
public class MideaFactory implements IAbstractFactory {
    @Override
    public IAirConditioner createAirConditioner() {
        return new MideaAirConditioner();
    }

    @Override
    public IRefrigerator createRefrigerator() {
        return new MideaRefrigerator();
    }
}
