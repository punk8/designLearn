package com.punk.designmodel.Singleton;

public class InnerClassSingleton {
    private InnerClassSingleton(){

    }

    //只有在调用时被加载 实现了延迟加载 这个static 还未创建对象 所以也不占据内存
    private static class InnerClass{
        private static InnerClassSingleton instance = new InnerClassSingleton();
    }


    public static InnerClassSingleton getInstance(){
        return InnerClass.instance;
    }


}
