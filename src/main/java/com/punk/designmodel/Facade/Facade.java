package com.punk.designmodel.Facade;

public class Facade {
    //示意方法，满足客户端需要的功能
    public void test(){
        ModelA a = new ModelA();
        a.testA();
        ModelB b = new ModelB();
        b.testB();
        ModelC c = new ModelC();
        c.testC();
    }
}
