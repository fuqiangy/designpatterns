package com.yfq.design.patterns.delegate;

/**
 * 盾牌铸造者
 */
public class ShieldBlacksmith implements IBlacksmith {
    @Override
    public void cast(String command) {
        System.out.println("ShieldBlacksmith:我打造了"+command);
    }
}
