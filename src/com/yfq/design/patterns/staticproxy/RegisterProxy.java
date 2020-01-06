package com.yfq.design.patterns.staticproxy;

public class RegisterProxy {
    public Register register;
    public RegisterProxy(Register register){
        this.register = register;
    }
    public void  addUserInfo(){
        register.addUserInfo();
        this.sendMail();
    }
    public void sendMail(){
        System.out.println("发送邮件，通知用户");
    }
}
