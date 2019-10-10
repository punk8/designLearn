package com.punk.designmodel.Bridge;

public class Client {

    public static void main(String[] args){
        //使用红色大笔刷
        ImplementorColor red = new RedColor();
        AbstractBrushPen bigBrush = new BigBrushPen(red);

        //使用蓝色小笔刷
        ImplementorColor blue = new BlueColor();
        AbstractBrushPen smallBrush = new SmallBrushPen(blue);

        bigBrush.paint();
        smallBrush.paint();
    }
}
