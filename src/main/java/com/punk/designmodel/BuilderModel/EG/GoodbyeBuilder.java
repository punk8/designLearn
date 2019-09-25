package com.punk.designmodel.BuilderModel.EG;

public class GoodbyeBuilder extends Builder {


    public GoodbyeBuilder(){
        msg = new GoodbyeMessage();
    }

    @Override
    public void buildSubject() {
        msg.setSubject("再见标题");
    }

    @Override
    public void buildBody() {
        msg.setBody("再见内容");
    }
}
