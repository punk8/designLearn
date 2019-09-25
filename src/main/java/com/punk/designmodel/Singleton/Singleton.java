package com.punk.designmodel.Singleton;

//反射对枚举没有用 枚举不怕反射攻击
public enum Singleton {

    //这就是Singleton的一个实例
    INSTANCE;
    public Singleton getInstance(){
        return INSTANCE;
    }

    public void singletonOperation(){
        //功能
    }
}
