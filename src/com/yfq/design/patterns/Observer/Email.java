package com.yfq.design.patterns.Observer;

import java.util.Observable;
import java.util.Observer;

public class Email implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        String name = (String) arg;
        System.out.println("用户"+name +"注册成功，发送邮件！");
    }
}
