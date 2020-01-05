package com.yfq.design.patterns.delegate;

public class Test {
    public static void main(String[] args) {
        Player player = new Player();
        player.buy("最锋利的剑",new Businessman());
    }
}
