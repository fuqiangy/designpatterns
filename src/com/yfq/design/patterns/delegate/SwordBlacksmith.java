package com.yfq.design.patterns.delegate;

/**
 * 宝剑铸造者
 */
public class SwordBlacksmith implements IBlacksmith {
    @Override
    public void cast(String command) {
        System.out.println("SwordBlacksmith:我打造了"+command);
    }
}
