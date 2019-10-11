package com.punk.designmodel.ChainofResponsibility;

public class ConcreteHandler extends Handler {


    //处理方法
    @Override
    public void handleRequest() {
        //判断是否有后继对象 如果有就转发请求给后继对象 没有就处理对象
        if(getSuccessor() != null){
            System.out.println("放过请求");
            getSuccessor().handleRequest();
        }else {
            System.out.println("处理请求");
        }
    }
}
