package com.rxy.demo.Demo10;
/*任何版本的java中，接口都可以定义抽象方法
格式：
 public abstract 返回值类型 方法名称(参数列表);

 注意事项：
 1、接口当中的抽象方法，修饰符必须是两个特定的关键字：public abstract
 2、这两个必须的修饰符可以视情况不写
 3、方法三要素，可以随意定义*/
public interface MyInterfaceAbstract {
    //定义一个抽象方法
    public abstract void methodAbs1();

    //这都是抽象方法
    abstract void methodAbs2();
    public  void methodAbs3();
    void methodAbs4();

}
