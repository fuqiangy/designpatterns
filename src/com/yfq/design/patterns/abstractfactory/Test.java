package com.yfq.design.patterns.abstractfactory;

import com.yfq.design.patterns.factory.IFactory;

public class Test {
    public static void main(String[] args) {
        IAbstractFactory mideafactory = new MideaFactory();
        IAbstractFactory greefactory = new GreeFactory();
        IAirConditioner mideaAir = mideafactory.createAirConditioner();
        IAirConditioner greeAir = greefactory.createAirConditioner();
        mideaAir.desiccation();
        greeAir.desiccation();
        IRefrigerator mideaRefrigerator = mideafactory.createRefrigerator();
        IRefrigerator greeRefrigerator = greefactory.createRefrigerator();
        mideaRefrigerator.fresh();
        greeRefrigerator.fresh();
    }
}
