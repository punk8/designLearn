package com.punk.designmodel.Observer.jdk;

import java.util.Observable;
import java.util.Observer;

public class Watcher implements Observer {

    private int id;

    public Watcher(int id,Observable o){
        this.id = id;
        o.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("id"+this.id +":状态发生改变,变为"+((Watched)o).getData());
    }
}
