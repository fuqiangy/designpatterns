package com.yfq.design.patterns.strategy;


public class PlanA implements IStrategy {
    @Override
    public void kill() {
        System.out.println("男人的浪漫:血吼爆头!");
    }
}
