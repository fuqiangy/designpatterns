package com.yfq.design.patterns.singletion;

/**
 * 懒汉式，对象被调用时创建，需要加锁
 */
public class LazySingletion {
    public static LazySingletion singletion = null;
    private  LazySingletion(){

    }
    public synchronized LazySingletion getInstacne(){
        if(singletion == null){
            return new LazySingletion();
        }
        return singletion;
    }
}
