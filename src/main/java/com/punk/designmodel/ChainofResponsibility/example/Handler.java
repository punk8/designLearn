package com.punk.designmodel.ChainofResponsibility.example;

//抽象处理类
public abstract class Handler {

    //下一个处理对象
    protected Handler successor = null;

    //获取下一个对象
    public Handler getSuccessor(){
        return successor;
    }

    //设置下一个对象
    public void setSuccessor(Handler successor){
        this.successor = successor;
    }

    /**
     * @param user 申请人
     * @param fee 申请金额
     * @return 成功或失败
     */
    public abstract String handleFeeRequest(String user,double fee);
}
