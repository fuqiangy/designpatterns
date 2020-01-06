package com.yfq.design.patterns.decorator;

public class Test {
    public static void main(String[] args) {
        Coffee original = new OriginalCoffee();
        System.out.println(original.getmsg());
        original = new SugarCoffee(original);
        ((SugarCoffee) original).getTool();
        System.out.println(original.getmsg());
        original = new MilkCoffee(original);
        System.out.println(original.getmsg());
    }
}
