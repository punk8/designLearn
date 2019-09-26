package com.punk.designmodel.Decorator.Drink;


//摩卡调料
public class Mocha extends CondimentDecorator {
    Beverage beverage;
    double myCost = 20;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",Mocha";
    }

    @Override
    public double cost() {
        return myCost+beverage.cost();
    }
}
