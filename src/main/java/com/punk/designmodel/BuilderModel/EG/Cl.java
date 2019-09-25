package com.punk.designmodel.BuilderModel.EG;

public class Cl {
    public static void main(String[] args){
        Builder builder = new WelcomeBuilder();
        Director director = new Director(builder);

        director.construct("hee@163.com","hii@qq.com");
    }
}
