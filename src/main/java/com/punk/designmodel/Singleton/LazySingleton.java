package com.punk.designmodel.Singleton;

public class LazySingleton {

    private static LazySingleton lazySingleton = null;

    private LazySingleton(){

    }

    //线程不安全 如果A线程进入getInstance判断为null 执行new 此时B线程也进入getInstance 也会产生一个new
    public static LazySingleton getInstance(){
        if( lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
