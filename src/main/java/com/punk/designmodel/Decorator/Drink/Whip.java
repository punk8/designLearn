package com.punk.designmodel.Decorator.Drink;

//调料 考培
public class Whip extends CondimentDecorator {

    Beverage beverage;
    double myCost = 30;

    public Whip(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",Whip";
    }

    @Override
    public double cost() {
        return beverage.cost() + myCost;
    }
}
