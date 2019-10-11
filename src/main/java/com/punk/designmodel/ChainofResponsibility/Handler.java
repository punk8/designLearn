package com.punk.designmodel.ChainofResponsibility;

//抽象处理者角色
public abstract class Handler {

    //后继的责任对象
    protected Handler successor;

    //处理请求的方法
    public abstract void handleRequest();

    //取值方法 取出后继对象
    public Handler getSuccessor(){
        return successor;
    }

    //赋值方法 设置后继对象
    public void setSuccessor(Handler successor){
        this.successor = successor;
    }
}
