package com.punk.designmodel.Decorator;

public class ConcreteComponentB extends Decorator {


    public ConcreteComponentB(Component component) {
        super(component);
    }

    @Override
    public void sampleOperation(){
        super.sampleOperation();
        //其他相关业务代码
    }

}
