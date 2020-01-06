package com.yfq.design.patterns.decorator;

/**
 * 咖啡抽象装饰者
 */
public abstract class CoffeeDecorator implements Coffee {
    private Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getmsg() {
        return this.coffee.getmsg();
    }

    public abstract void getTool();
}
