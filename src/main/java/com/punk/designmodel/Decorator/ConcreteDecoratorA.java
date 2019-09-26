package com.punk.designmodel.Decorator;

public class ConcreteDecoratorA extends Decorator {


    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void sampleOperation(){
        super.sampleOperation();
        //其他相关业务代码

    }
}
