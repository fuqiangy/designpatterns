package com.yfq.design.patterns.delegate;

public class Player {

    public void buy(String goods, Businessman businessman){
        System.out.println("playre:问binessiness买"+goods);
        businessman.sell(goods);
        System.out.println("playre:获得"+goods);
    }

}
