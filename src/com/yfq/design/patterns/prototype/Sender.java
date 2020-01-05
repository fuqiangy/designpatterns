package com.yfq.design.patterns.prototype;

import java.io.Serializable;

public class Sender implements Serializable {
    private String name;

    public Sender(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
