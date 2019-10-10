package com.punk.designmodel.Bridge;

public class BigBrushPen extends AbstractBrushPen {


    public BigBrushPen(ImplementorColor color) {
        super(color);
    }

    @Override
    public void paint() {
        System.out.println("Use BigBrushPen paint,color="+ color.paintColor());
    }
}
