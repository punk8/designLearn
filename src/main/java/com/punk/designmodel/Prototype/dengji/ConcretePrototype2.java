package com.punk.designmodel.Prototype.dengji;

public class ConcretePrototype2 implements Prototype {

    private String name;

    @Override
    public Prototype clone() {

        ConcretePrototype2 prototype = new ConcretePrototype2();
        prototype.setName(this.name);
        return prototype;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }


    public String toString(){
        return "Now in Prototype2,name = "+this.name;
    }
}

