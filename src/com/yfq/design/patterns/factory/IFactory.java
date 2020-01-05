package com.yfq.design.patterns.factory;

import com.yfq.design.patterns.factory.IProduct;

/**
 * 如果工厂生产产品不仅仅是new,还要再初始化其他属性且每个产品的也不一样，这样简单工厂的职责就会过多。
 * 这时可以使用工厂模式，对工厂做一层抽象，一个工厂生产一种产品。
 */
public interface IFactory {
    public IProduct creatProduct();
}
