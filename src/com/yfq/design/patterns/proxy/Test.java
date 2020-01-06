package com.yfq.design.patterns.proxy;

public class Test {
    public static void main(String[] args) {
        JDKProxy jdkProxy = new JDKProxy();
        //只能强转为接口
        IRegister register = (IRegister) jdkProxy.getInstance(new Register());
        register.addUserInfo();
    }
}
