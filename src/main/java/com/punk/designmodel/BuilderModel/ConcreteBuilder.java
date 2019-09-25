package com.punk.designmodel.BuilderModel;

public class ConcreteBuilder implements Builder {

    private Product product = new Product();

    @Override
    public void buildPart1() {
        product.setPart1("ID : 9527");
    }

    @Override
    public void buildPart2() {
        product.setPart2("Name : XXX");
    }

    @Override
    public Product retrieveResult() {
        return product;
    }
}
