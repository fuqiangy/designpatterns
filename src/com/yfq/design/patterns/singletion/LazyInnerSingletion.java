package com.yfq.design.patterns.singletion;

/**
 * 使用静态内部类
 * 知识点：类的加载顺序，和加载时机
 */
public class LazyInnerSingletion {
    private LazyInnerSingletion(){
        if(LazyHolder.LAZY_INNER_SINGLETION != null){
            throw new RuntimeException("不能创建多个实例");
        }
    }

    public static final LazyInnerSingletion getInstance(){
        return LazyHolder.LAZY_INNER_SINGLETION;
    }

    public static class LazyHolder{
        public static final LazyInnerSingletion LAZY_INNER_SINGLETION = new LazyInnerSingletion();
    }
}
