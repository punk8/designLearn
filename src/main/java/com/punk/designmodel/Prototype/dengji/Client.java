package com.punk.designmodel.Prototype.dengji;

public class Client {
    public static void main(String[] args) {
        try {
            Prototype p1 = new ConcretePrototype1();
            PrototypeManager.setPrototype("p1", p1);

            //通过原型克隆
            Prototype p3 = PrototypeManager.getPrototype("p1").clone();
            p3.setName("张三");
            System.out.println("第一个实例"+p3);

            //动态切换实例
            Prototype p2 = new ConcretePrototype2();
            PrototypeManager.setPrototype("p1",p2);
            //重新获取原型创建实例
            Prototype p4 = PrototypeManager.getPrototype("p1").clone();
            p4.setName("李四");
            System.out.println("第二个实例"+p4);

            //移除了该原型
            PrototypeManager.removePrototype("p1");

            Prototype p5 = PrototypeManager.getPrototype("p1").clone();
            p5.setName("王五");
            System.out.println("第三个实例：" + p5);




        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
