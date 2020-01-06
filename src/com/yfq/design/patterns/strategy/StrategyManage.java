package com.yfq.design.patterns.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * 策略管理
 * 初始化所有策略，并根绝条件返回不同的策略实现
 */
public class StrategyManage {
    public static Map<String, IStrategy> killStrategy = new HashMap<>();

    //使用静态代码块加载
    static{
        killStrategy.put("planA", new PlanA());
        killStrategy.put("planB", new PlanB());
        killStrategy.put("planC", new PlanC());
    }

    public static IStrategy getStrategy(String strategry){
        return killStrategy.get(strategry);
    }
}
