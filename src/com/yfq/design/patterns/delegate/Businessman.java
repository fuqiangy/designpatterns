package com.yfq.design.patterns.delegate;

import java.util.HashMap;
import java.util.Map;

public class Businessman {
    public Map<String, IBlacksmith> target = new HashMap<>();
    public Businessman(){
        target.put("最坚固的盾",new ShieldBlacksmith());
        target.put("最锋利的剑",new SwordBlacksmith());
    }
    public void sell(String goods){
        System.out.println("business:我找铁匠打造武器");
        target.get(goods).cast(goods);
    }
}
