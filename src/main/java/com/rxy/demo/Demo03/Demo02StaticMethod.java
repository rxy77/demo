package com.rxy.demo.Demo03;
/*一旦使用static修饰成员方法，那就成为了静态方法，静态方法不属于对象，而属于类
如果没有static关键字，那么必须先创建对象，然后通过对象才能使用

无论是成员方法，还是成员变量，如果有了static，都推荐使用类名称调用
静态变量：类名称.静态变量
静态方法：类名称.静态方法()

注意事项：
1、静态不能直接访问非静态
原因：因为内存中【先】有静态内容，【后】有非静态内容
"先人不知道后人，但后人知道先人"
2、静态方法不能使用this
原因：this代表当前对象，通过谁调用的当前方法，谁就是对象
*/
public class Demo02StaticMethod {
    public static void main(String[] args) {
        MyClass obj=new MyClass();//首先创建对象，才能使用没有static关键字的内容
        obj.method();

        //对于静态方法来说，可直接使用对象名进行调用，但也可以使用类名称进行调用
        obj.methodStatic();//不推荐;可能会误解是成员方法;这种写法会在编译后被javac翻译成类名称.方法名
        MyClass.methodStatic();//推荐

        //对于本类中的方法可以省略类名称
        myMthod();
        Demo02StaticMethod.myMthod();//完全等效
    }

    public static void myMthod(){
        System.out.println("这是一个自己的方法");
    }
}
