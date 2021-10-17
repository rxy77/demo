package com.rxy.demo.Demo18;
/*
如果一个类是定义在方法里的，那么就叫局部内部类。
"局部"：只能在方法内部使用，出了方法就不能使用

格式：
修饰符 class 外部类名称{
    修饰符 返回值类型 外部类方法名称(参数列表){
        class 局部内部类名称{
            //...
        }
    }
}

类的修饰符总结：
public > protected > (default) > private

定义一个类的时候权限：
1、外部类：public / (default)
2、成员内部类：public / protected / (default) / private
3、局部内部类：什么都不写(default)
 */
public class Outer {
    public void methodOuter(){
        class Inner{//局部内部类
            int num=10;
            public void methodInner(){
                System.out.println(num);
            }
        }
        Inner inner=new Inner();
        inner.methodInner();
    }
}
