package com.punk.designmodel.Observer.jdk;

import java.util.Observable;
import java.util.Observer;

public class Test {
    public static void main(String[] args){
        //创建被观察者对象
        Watched watched = new Watched();

        //创建观察者对象
        Observer watcher1 = new Watcher(1,watched);
        Observer watcher2 = new Watcher(2,watched);
        Observer watcher3 = new Watcher(3,watched);
        Observer watcher4 = new Watcher(4,watched);
        Observer watcher5 = new Watcher(5,watched);
        Observer watcher6 = new Watcher(6,watched);
        Observer watcher7 = new Watcher(7,watched);

        //给被观察者赋值
        watched.setData("start");
        watched.setData("run");
        watched.setData("stop");

    }

}
