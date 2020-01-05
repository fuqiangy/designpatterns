package com.yfq.design.patterns.singletion;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class Test {


    public void createObjByReflect(){
        try {
            Class clazz = LazyInnerSingletion.class;
            Constructor<LazyInnerSingletion> c = clazz.getDeclaredConstructor();
            c.setAccessible(true);
            LazyInnerSingletion singletion1 = c.newInstance();
            LazyInnerSingletion singletion2 = c.newInstance();
            System.out.println(singletion1 == singletion2);


        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void createObjBySerialize(){
        SerializeSingletion s1 = null;
        SerializeSingletion s2 = SerializeSingletion.getInstance();

        FileOutputStream out = null;
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        try{
            out = new FileOutputStream("SerializeSingletion.obj");
            oos= new ObjectOutputStream(out);
            oos.writeObject(s2);
            oos.flush();
            oos.close();
            FileInputStream in = new FileInputStream("SerializeSingletion.obj");
            ois = new ObjectInputStream(in);
            s1 = (SerializeSingletion) ois.readObject();
            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s1==s2);

            ois.close();
        }catch (Exception e) {
            e.printStackTrace();
        }finally {

        }

    }


    public static void main(String[] args) {
        Test test = new Test();
        //test.createObjByReflect();
        test.createObjBySerialize();
    }
}
