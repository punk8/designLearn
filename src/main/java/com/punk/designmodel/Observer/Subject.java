package com.punk.designmodel.Observer;

//import com.sun.org.apache.xerces.internal.xs.datatypes.ObjectList;

import java.util.ArrayList;
import java.util.List;

//抽象主题类
public abstract class Subject {

    //保存注册观察者对象
    private List<Observer> list = new ArrayList<Observer>();

    //注册
    public void attach(Observer observer){
        list.add(observer);
        System.out.println("Attached an observer");
    }

    //删除
    public void detach(Observer observer){
        list.remove(observer);
    }

    //通知
    public void notifyObservers(String newState){
        for (Observer observer:list){
            observer.update(newState);
        }
    }
}
