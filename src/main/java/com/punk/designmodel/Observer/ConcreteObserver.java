package com.punk.designmodel.Observer;

public class ConcreteObserver implements Observer {

    //观察者状态
    private String observerState;

    @Override
    public void update(String newState) {
        observerState = newState;
        System.out.println("本观察者的状态:"+observerState);
    }
}
