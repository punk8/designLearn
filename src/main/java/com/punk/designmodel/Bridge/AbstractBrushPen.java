package com.punk.designmodel.Bridge;

//抽象毛刷笔
public abstract class AbstractBrushPen {
    //具有一个颜色的引用
    protected ImplementorColor color;


    public AbstractBrushPen(ImplementorColor color){
        this.color = color;
    }

    //每只笔有自己的实现
    public abstract void paint();
}
