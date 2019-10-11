package com.punk.designmodel.ChainofResponsibility.example;

public class GeneralManager extends Handler {

    @Override
    public String handleFeeRequest(String user, double fee) {
        String result = "";
        //项目经理只能粗粝500以内的
        if(fee >= 1000){
            if("张三".equals(user)){
                result = user+"申请成功：由总经理经理批准,金额为"+fee;
            }else {
                result = user+"申请失败：由总经理拒绝,金额为"+fee;
            }
        }else {
            if(getSuccessor()!=null){
                return getSuccessor().handleFeeRequest(user,fee);
            }
        }
        return result;

    }
}