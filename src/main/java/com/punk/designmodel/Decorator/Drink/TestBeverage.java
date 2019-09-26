package com.punk.designmodel.Decorator.Drink;

public class TestBeverage {
    public static void main(String[] args){
        //不加调料
        Beverage beverage = new HouseBlend();
        System.out.println(beverage.getDescription()+" $"+beverage.cost());

        //添加调料
        Beverage beverage1 = new HouseBlend();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription()+" $"+beverage1.cost());


    }

}
