package com.rxy.demo.Demo08;
/*抽象类中不一定有抽象方法，但抽象方法必须在抽象类中
这样没有抽象方法的抽象类，也不能直接创建对象，在特殊情景中使用*/
public class DemoTest {
    public static void main(String[] args) {
        Zi zi=new Zi();
        zi.sleep();
    }
}
