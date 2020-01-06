package com.yfq.design.patterns.strategy;

public class Play {

    public void win(String plan){
        IStrategy strategy = StrategyManage.getStrategy(plan);
        strategy.kill();
    }
}
