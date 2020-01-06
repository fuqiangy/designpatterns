package com.yfq.design.patterns.strategy;


public class PlanC implements IStrategy {
    @Override
    public void kill() {
        System.out.println("防战信仰:护甲劝退!");
    }
}
