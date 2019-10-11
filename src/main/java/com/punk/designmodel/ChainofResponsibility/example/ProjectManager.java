package com.punk.designmodel.ChainofResponsibility.example;

public class ProjectManager extends Handler {

    @Override
    public String handleFeeRequest(String user, double fee) {
        String result = "";
        //项目经理只能粗粝500以内的
        if(fee < 500){
            if("张三".equals(user)){
                result = user+"申请成功：由项目经理批准,金额为"+fee;
            }else {
                result = user+"申请失败：由项目经理拒绝,金额为"+fee;
            }
        }else {
            if(getSuccessor()!=null){
                return getSuccessor().handleFeeRequest(user,fee);
            }
        }
        return result;

    }
}
