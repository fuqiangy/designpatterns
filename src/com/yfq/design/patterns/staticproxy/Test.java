package com.yfq.design.patterns.staticproxy;

public class Test {
    public static void main(String[] args) {
        RegisterProxy registerProxy = new RegisterProxy(new Register());
        registerProxy.addUserInfo();
    }
}
