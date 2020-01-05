package com.yfq.design.patterns.prototype;

public class Test {
    public static void main(String[] args) {
        //浅克隆
        Mail mail = new Mail();
        mail.setId(11);
        mail.setName("jack");
        mail.setSender(new Sender("tom"));
        Mail clone = mail.clone();
        System.out.println("浅克隆");
        System.out.println(mail.id==clone.id);
        System.out.println(mail.name==clone.name);
        System.out.println(mail.sender==clone.sender);
        System.out.println("深克隆");
        Mail deepclone = mail.deepClone();
        System.out.println(mail.id==deepclone.id);
        System.out.println(mail.name==deepclone.name);
        System.out.println(mail.sender==deepclone.sender);
    }
}
