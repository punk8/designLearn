package com.punk.designmodel.Bridge;

public class MiddleBrushPen extends AbstractBrushPen {

    public MiddleBrushPen(ImplementorColor color) {
        super(color);
    }

    @Override
    public void paint() {
        System.out.println("Use MiddleBrushPen paint,color="+ color.paintColor());
    }
}
