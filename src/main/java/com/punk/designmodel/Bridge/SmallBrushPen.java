package com.punk.designmodel.Bridge;

public class SmallBrushPen extends AbstractBrushPen {

    public SmallBrushPen(ImplementorColor color) {
        super(color);
    }

    @Override
    public void paint() {
        System.out.println("Use SmallBrushPen paint,color="+ color.paintColor());
    }
}
