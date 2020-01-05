package com.yfq.design.patterns.factory;

import com.yfq.design.patterns.factory.IProduct;

public class Product2Factory implements IFactory {
    @Override
    public IProduct creatProduct() {
        return new Product2(22);
    }

}
