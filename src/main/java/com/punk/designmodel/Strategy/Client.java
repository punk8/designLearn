package com.punk.designmodel.Strategy;

public class Client {
    public static void main(String[] args){
        //创建一个中级会员
        MemberStrategy intermediateMember = new IntermediateMemberStrategy();
        Price price = new Price(intermediateMember);
        //计算出价格
        double actualPrice = price.quote(100);

        System.out.println("最终价格为"+actualPrice);
    }
}
