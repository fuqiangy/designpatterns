package com.yfq.design.patterns.decorator;

/**
 * 具体装饰者
 */
public class MilkCoffee extends CoffeeDecorator {


    public MilkCoffee(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getmsg() {
        return super.getmsg() + "加奶";
    }

    @Override
    public void getTool() {
        System.out.println("获取勺子");
    }
}
