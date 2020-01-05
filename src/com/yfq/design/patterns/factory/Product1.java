package com.yfq.design.patterns.factory;

import com.yfq.design.patterns.factory.IProduct;

public class Product1 implements IProduct{
    private String name ;

    public Product1(String name) {
        this.name = name;
    }

    @Override
    public void say() {
        System.out.println("I am "+ name);
    }
}
