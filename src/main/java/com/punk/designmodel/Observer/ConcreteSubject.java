package com.punk.designmodel.Observer;

public class ConcreteSubject extends Subject {
    private String state;

    public String getState(){
        return state;
    }

    public void change(String newState){
        state = newState;
        System.out.println("主题状态："+state);

        this.notifyObservers(state);
    }
}
