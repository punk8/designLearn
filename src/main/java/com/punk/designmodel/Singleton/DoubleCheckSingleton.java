package com.punk.designmodel.Singleton;

public class DoubleCheckSingleton {
    //new 对象的过程
    //1. 给 singleton 分配内存
    //2. 调用 Singleton 的构造函数来初始化成员变量，形成实例
    //3. 将singleton对象指向分配的内存空间（执行完这步 singleton才是非 null了）
    //正常情况下应该是 1-2-3 但由于指令重排的可能可能会出现1-3-2 在执行3时 若此时其他线程进入第一个判断 实际上instance已经不为null但是仍没有完成初始化 所以会报错
    //volatile关键字的一个作用是禁止指令重排，把instance声明为volatile之后，对它的写操作就会有一个内存屏障

    //加如volatile的作用是防止指令重排 初始化的过程可能由于指令重排
    private volatile static DoubleCheckSingleton instance = null;

    private DoubleCheckSingleton(){

    }

    public static DoubleCheckSingleton getInstance(){
        //先检查实例是否存在 如果不存在进入下面同步块 可能线程A和线程B同时判断到null
        if (instance == null){
            //同步块中只有一个线程能获得资源
            synchronized (DoubleCheckSingleton.class){
                //第二次判断 此时由于其中一个线程拥有同步资源锁 所以可以进入该判断 如果还是null则创建 释放资源后 其他线程执行到这里的时候已经非null
                if (instance == null){
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }

}
