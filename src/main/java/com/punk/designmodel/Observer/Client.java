package com.punk.designmodel.Observer;

public class Client {
    public static void main(String[] args){
        //创建主题
        ConcreteSubject subject = new ConcreteSubject();

        //创建观察者
        Observer observer = new ConcreteObserver();

        subject.attach(observer);

        subject.change("new State");
    }

}
