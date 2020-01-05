package com.yfq.design.patterns.factory;


import com.yfq.design.patterns.factory.IProduct;

public class Product1Factory implements IFactory {


    @Override
    public IProduct creatProduct() {
        return new Product1("Tom");
    }
}
