package com.yfq.design.patterns.prototype;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;
import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;

import java.io.*;

public class Mail implements Cloneable, Serializable {
    public int id;
    public String name;
    public Sender sender;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getSender() {
        return sender;
    }

    public void setSender(Sender sender) {
        this.sender = sender;
    }

    @Override
    public Mail clone()  {
        Mail mail = new Mail();
        mail.setId(this.id);
        mail.setName(this.name);
        mail.setSender(this.sender);
        return mail;
    }

    public Mail deepClone() {
        Mail mail = null;
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);

            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            mail= (Mail) ois.readObject();

        } catch (Exception e) {
            e.printStackTrace();

        }
        return mail;

    }
}
