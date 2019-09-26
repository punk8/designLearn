package com.punk.designmodel.Proxy.CGLIB;

import com.punk.designmodel.Singleton.Singleton;

public class Test {
    public static void main(String[] args){
        Singer target = new Singer();
        Singer proxy = (Singer) new ProxyFactory(target).getProxyInstance();
        proxy.sing();
    }
}
