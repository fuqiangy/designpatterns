package com.yfq.design.patterns.samplefactory;

public class SimpleProductFactory {
    public IProduct getProduct(String productName){
        if(productName.equalsIgnoreCase("product1")){
            return new Product1();
        }
        if(productName.equalsIgnoreCase("product2")){
            return new Product2();
        }
        return null;
    }
    /*
    使用反射创建
     */
    public IProduct creatProduct(String className){
        if(className == null || "".equalsIgnoreCase(className)){
            return null;
        }
        try {
            return (IProduct) Class.forName(className).newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return null;
    }
    /*
    感觉有几点鸡肋，这样再创健对象时就要传入Class对象，导包，又增加了依赖
     */
    public IProduct creatProduct(Class<? extends IProduct> clazz){
        try {
            if(clazz != null ){
                return clazz.newInstance();
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
