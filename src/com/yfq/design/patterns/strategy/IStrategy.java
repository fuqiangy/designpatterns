package com.yfq.design.patterns.strategy;

/**
 * 策略的抽象接口，同一个决策使用什么策略由其实现决定
 * 模拟炉石斩杀策略
 * 优点：开闭原则，避免if,else,封装
 * 缺点：客户端必须知到有什么策略，代码复杂度大，不易维护
 */
public interface IStrategy {
    void kill();
}
