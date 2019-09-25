package com.punk.designmodel.Composite.safe;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {


    //管理组合对象中的子组合对象
    private List<Component> childComponents = new ArrayList<Component>();

    //该组合对象的名称
    private String name;

    public Composite(String name){
        this.name = name;
    }

    //管理方法 添加子组件
    public void addChild(Component child){
        childComponents.add(child);
    }

    //管理方法 删除子组件
    public void removeChild(int index){
        childComponents.remove(index);
    }

    //管理方法 返回所有子组件
    public List<Component> getChild(){
        return childComponents;
    }





    @Override
    public void printStruct(String preStr) {
        // 先把自己输出
        System.out.println(preStr + "+" + this.name);
        //如果还包含有子组件，那么就输出这些子组件对象
        if(this.childComponents != null){
            //添加两个空格，表示向后缩进两个空格
            preStr += "  ";
            //输出当前对象的子对象
            for(Component c : childComponents){
                //递归输出每个子对象
                c.printStruct(preStr);
            }
        }
    }
}
