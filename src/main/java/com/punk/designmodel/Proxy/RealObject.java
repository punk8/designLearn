package com.punk.designmodel.Proxy;

public class RealObject extends AbstractObject {
    @Override
    public void operation() {
        System.out.println("被代理对象的操作");
    }
}
