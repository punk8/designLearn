package com.punk.designmodel.Proxy.dynamic;

import com.punk.designmodel.Proxy.Static.BuyHouse;
import com.punk.designmodel.Proxy.Static.BuyHouseImpl;

import java.lang.reflect.Proxy;

public class DynamicProxyTest {
    public static void main(String[] args){
        BuyHouse buyHouse = new BuyHouseImpl();
//        BuyHouse proxyBuyHouse = (BuyHouse) Proxy.newProxyInstance(BuyHouse.class.getClassLoader(),new Class[]{BuyHouse.class},new DynamicProxyHandler(buyHouse));
        BuyHouse proxyBuyHouse = (BuyHouse) Proxy.newProxyInstance(buyHouse.getClass().getClassLoader(),buyHouse.getClass().getInterfaces(),new DynamicProxyHandler(buyHouse));

        proxyBuyHouse.buyHouse();
    }
}
