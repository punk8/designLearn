package com.punk.designmodel.BuilderModel;

public interface Builder {

    public void buildPart1();
    public void buildPart2();
    //取出完成的产品
    public Product retrieveResult();

}
