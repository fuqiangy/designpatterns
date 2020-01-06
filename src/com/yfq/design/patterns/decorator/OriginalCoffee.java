package com.yfq.design.patterns.decorator;

public class OriginalCoffee implements Coffee {
    @Override
    public String getmsg() {
        return "原味咖啡";
    }
}
