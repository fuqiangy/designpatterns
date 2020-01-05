package com.yfq.design.patterns.singletion;

/**
 * 饿汉式，类加载时初始化，效率高，线程安全
 * 缺点：空间占用
 */
public class HungrySingletion {
    public static final HungrySingletion singletion = new HungrySingletion();

    private HungrySingletion(){}

    public static HungrySingletion getInstance(){
        return singletion;
    }
}
