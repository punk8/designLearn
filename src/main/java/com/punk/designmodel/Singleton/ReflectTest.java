package com.punk.designmodel.Singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectTest {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {
//        DoubleCheckSingleton s = DoubleCheckSingleton.getInstance();
//        DoubleCheckSingleton s1 = DoubleCheckSingleton.getInstance();
//        System.out.println("s == s1 "+ s.equals(s1) ); //true
//        //反射构建实例
//        Constructor<DoubleCheckSingleton> constructor = DoubleCheckSingleton.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        DoubleCheckSingleton s2 = constructor.newInstance();
//        System.out.println("s == s2 "+s.equals(s2)); //false 说明创建出了一个新对象
//
//        EagerSingleton s3 = EagerSingleton.getInstance();
//        EagerSingleton s4 = EagerSingleton.getInstance();
//        System.out.println("s3 == s4 "+ s3.equals(s4) ); //true
//        //反射构建实例
//        Constructor<EagerSingleton> constructor1 = EagerSingleton.class.getDeclaredConstructor();
//        constructor1.setAccessible(true);
//        EagerSingleton s5 = constructor1.newInstance();
//        System.out.println("s3 == s5 "+s3.equals(s5)); //false 说明创建了一个新对象
//
        Singleton s = Singleton.INSTANCE;
        Singleton s1 = Singleton.INSTANCE;
        System.out.println("s == s1 "+ s.equals(s1) ); //true
        //反射构建实例
        Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singleton s2 = constructor.newInstance();
        System.out.println("s == s2 "+s.equals(s2)); //报错 枚举不怕反射攻击



    }
}
