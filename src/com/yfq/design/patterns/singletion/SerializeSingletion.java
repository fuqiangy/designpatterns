package com.yfq.design.patterns.singletion;

import java.io.Serializable;

/**
 * 饿汉式，类加载时初始化，效率高，线程安全
 * 缺点：空间占用
 */
public class SerializeSingletion  implements Serializable {
    public static final SerializeSingletion singletion = new SerializeSingletion();

    private SerializeSingletion(){}

    public static SerializeSingletion getInstance(){
        return singletion;
    }

    private Object readResolve(){
        return singletion;
    }
}
