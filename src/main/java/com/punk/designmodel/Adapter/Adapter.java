package com.punk.designmodel.Adapter;


//适配器实现了目标接口 并将待适配Adaptee的方法进行接口转换 这里用的是对象适配器 并不是继承了待适配器类
//而是委托待适配器
public class Adapter implements Target {

    private Adaptee adaptee;

    @Override
    public void sampleOperation2() {
        this.adaptee.sampleOperation1();
    }
}
