package com.punk.designmodel.Decorator;

public class Decorator implements Component {

    private Component component;

    public Decorator (Component component){
        this.component = component;
    }

    @Override
    public void sampleOperation() {
        //装饰者添加的操作 再加上未装饰的操作
        component.sampleOperation();

    }
}
