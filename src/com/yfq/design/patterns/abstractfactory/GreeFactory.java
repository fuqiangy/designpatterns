package com.yfq.design.patterns.abstractfactory;

/**
 * 具体工厂生产一个产品族
 */
public class GreeFactory implements IAbstractFactory {
    @Override
    public IAirConditioner createAirConditioner() {
        return new GreeAirConditioner();
    }

    @Override
    public IRefrigerator createRefrigerator() {
        return new GreeRefrigerator();
    }
}
