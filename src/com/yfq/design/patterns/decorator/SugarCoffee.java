package com.yfq.design.patterns.decorator;

/**
 * 具体装饰者
 */
public class SugarCoffee extends CoffeeDecorator {


    public SugarCoffee(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getmsg() {
        return super.getmsg() + "加糖";
    }

    @Override
    public void getTool() {
        System.out.println("获取镊子");
    }

}
