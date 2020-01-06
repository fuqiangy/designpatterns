package com.yfq.design.patterns.strategy;


public class PlanB implements IStrategy {
    @Override
    public void kill() {
        System.out.println("海盗平推:海盗战天下第一！");
    }
}
