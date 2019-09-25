package com.punk.designmodel.Prototype.dengji;

import java.util.HashMap;
import java.util.Map;

//原型管理器
public class PrototypeManager {
    //记录原型编号和原型对象的对应关系
    private static Map<String,Prototype> map = new HashMap<String, Prototype>();


    //避免外部创建管理器实例
    private PrototypeManager(){

    }

    //向原型管理器里面添加或是修改某个原型注册 //作为同步资源
    public synchronized static void setPrototype(String prototypeid,Prototype prototype){
        map.put(prototypeid,prototype);
    }

    //从原型管理器里面删除某个原型注册
    public synchronized static void removePrototype(String prototypeid){
        map.remove(prototypeid);
    }


    //获取某个原型编号对应的原型实例
    public synchronized static Prototype getPrototype(String prototypeid) throws Exception {
        Prototype prototype = map.get(prototypeid);
        if(prototype == null){
           throw new Exception("原型不存在");
        }
        return prototype;
    }


}
