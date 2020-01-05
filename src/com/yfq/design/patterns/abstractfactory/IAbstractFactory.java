package com.yfq.design.patterns.abstractfactory;

/**
 * 抽象工厂,想要生产新的产品，要修改所有的具体工厂，不易扩展，理解
 */
public interface IAbstractFactory {
    IAirConditioner createAirConditioner();
    IRefrigerator   createRefrigerator();
}
