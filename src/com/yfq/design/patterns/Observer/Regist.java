package com.yfq.design.patterns.Observer;

import java.util.Observable;

/**
 * 注册，被观察者
 */
public class Regist extends Observable {

    public void addUserInfo(String name){
        System.out.println("添加用户信息");
        setChanged();
        notifyObservers(name);
    }
}
