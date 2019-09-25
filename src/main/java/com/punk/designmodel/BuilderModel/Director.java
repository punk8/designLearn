package com.punk.designmodel.BuilderModel;


//用以指导builder的执行顺序
public class Director {

    private Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    //构建产品 面向客户
    public void construct(){
        builder.buildPart1();
        builder.buildPart2();
    }
}
