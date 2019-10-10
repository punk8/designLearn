package com.punk.designmodel.Strategy;

//中级会员
public class IntermediateMemberStrategy implements MemberStrategy {
    @Override
    public double calcPrice(double booksPrice) {
        System.out.println("中级会员提供10%的促销折扣");
        return booksPrice*0.9;
    }
}
