package com.rxy.demo.Demo05;
/*
在父子类的继承关系中，创建子类对象，访问成员方法规则：
    创建的对象是谁，优先使用的是谁，没有则向上寻找
注意事项：
无论是成员方法，还是成员变量，如果没有都是向上找父类的，绝对不会向下找子类的

重写(override)
概念：在继承关系当中，方法名称一样，参数列表一样。
重写(override)：方法名称一样，参数列表【也一样】。覆盖，覆写。
重载(overload)：方法名称一样，参数列表【不一样】。

方法覆盖重写特点：创建的是子类对象，则优先使用子类方法。

*/

public class Demo03ExtendsFiled {
    public static void main(String[] args) {
     /*   Zi zi=new Zi();
        zi.methodZi();
        zi.mathodFu();
        System.out.println("==============");

        zi.method();*/
    }
}
