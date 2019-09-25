package com.punk.designmodel.Composite.safe;

public class Leaf implements Component {

    //叶对象的名字
    private String name;

    public Leaf(String name){
        this.name = name;
    }





    @Override
    public void printStruct(String preStr) {
        System.out.println(preStr + "-" + name);

    }
}
