package com.punk.designmodel.BuilderModel.EG;

import java.util.Date;

public abstract class Builder {
    protected AutoMessage msg;

    //标题的构建方法
    public abstract void buildSubject();

    //内容的构建方法
    public abstract void buildBody();

    //收件人的构建方法
    public void buildTo(String to){
        msg.setTo(to);
    }

    //发件人的构建方法
    public void buildFrom(String from){
        msg.setFrom(from);
    }

    public void buildSendDate(){
        msg.setSendDate(new Date());
    }

    //产品完成后 用此方法发送邮件 相当于取出产品的方法
    public void sendMessage(){
        msg.send();
    }
}
