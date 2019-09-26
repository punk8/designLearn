package com.punk.designmodel.Decorator.Drink;

//饮料父类
public abstract class Beverage {
    public String descriptionString = "未知饮料";

    public String getDescription(){
        return descriptionString;
    }

    //子类需实现的方法
    public abstract double cost();
}
