package com.yfq.design.patterns.factory;

import com.yfq.design.patterns.factory.IProduct;

public class Product2 implements IProduct{
    private int age;

    public Product2(int age) {
        this.age = age;
    }

    @Override
    public void say() {
        System.out.printf("I am %d years old"  ,age );
    }
}
