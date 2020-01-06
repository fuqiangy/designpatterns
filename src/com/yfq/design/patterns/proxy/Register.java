package com.yfq.design.patterns.proxy;

public class Register implements IRegister {
    @Override
    public void addUserInfo(){
        System.out.println("将用户信息添加到数据库");
    }
}
