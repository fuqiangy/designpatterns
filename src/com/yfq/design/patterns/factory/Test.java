package com.yfq.design.patterns.factory;

public class Test {


    public static void main(String[] args) {
        IFactory factory1 = new Product1Factory();
        IFactory factory2 = new Product2Factory();
        IProduct product1 = factory1.creatProduct();
        IProduct product2 = factory2.creatProduct();
        product1.say();
        product2.say();
    }

}
