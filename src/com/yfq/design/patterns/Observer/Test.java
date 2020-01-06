package com.yfq.design.patterns.Observer;

public class Test {
    public static void main(String[] args) {
        Regist regist = new Regist();
        regist.addObserver(new Email());
        regist.addUserInfo("小明");

    }
}
