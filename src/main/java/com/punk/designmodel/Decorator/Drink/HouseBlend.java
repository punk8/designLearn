package com.punk.designmodel.Decorator.Drink;

public class HouseBlend extends Beverage {
    public HouseBlend(){
        descriptionString = "House Blend Coffee";
    }
    @Override
    public double cost() {
        return 5;
    }
}
