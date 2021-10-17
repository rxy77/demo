package com.rxy.demo.Demo19;
/*
如果接口的实现类(或父类的子类)只需要用唯一一次，
那么这种情况下可以省略该类的定义，改用【匿名内部类】

匿名内部类格式：
接口名称 对象名=new 接口名称(){
        //覆盖重写所有抽象方法;
};

对格式"new 接口名称(){...}"格式进行解析：
1、new创建对象的动作
2、接口名称代表匿名内部类所要实现哪个接口
3、{...}匿名内部类内容

注意事项：
1、匿名内部类，在【创建对象】时，只能使用唯一一次，
如希望多次创建对象，而且类内容相同，那么必须使用单独定义的实现类。
2、匿名对象，在【调用方法】时，只能调用唯一一次，
如希望同一个对象多次调用方法，则必须给对象起个名字。
3、匿名内部类省略了【实现类/子类名称】，匿名对象省略【对象名称】
强调：匿名内部类和匿名对象不是一回事！！！！！！！！！！！
 */
public class DemoMain {
    public static void main(String[] args) {

//        MyInterface obj=new MyInterfaceimpl();//左父右子
//        obj.method();

//        MyInterface some=new MyInterface();//错误写法

//        使用匿名内部类，但不是匿名对象，对象名称objA
        MyInterface objA=new MyInterface() {
            @Override
            public void method1() {
                System.out.println("匿名内部类方法覆盖重写执行！111-A");
            }

            @Override
            public void method2() {
                System.out.println("匿名内部类方法覆盖重写执行！222-A");
            }
        };
        objA.method1();
        objA.method2();

        System.out.println("======================================");

//        使用匿名内部类，而且省略对象名称，也是匿名对象
        new MyInterface(){

            @Override
            public void method1() {
                System.out.println("匿名内部类方法覆盖重写执行！111-B");
            }

            @Override
            public void method2() {
                System.out.println("匿名内部类方法覆盖重写执行！222-B");
            }
        }.method1();
//      因为匿名对象无法调用第二次方法，所以需要多次创建匿名内部类的匿名对象
        new MyInterface(){

            @Override
            public void method1() {
                System.out.println("匿名内部类方法覆盖重写执行！111-B");
            }

            @Override
            public void method2() {
                System.out.println("匿名内部类方法覆盖重写执行！222-B");
            }
        }.method2();
    }
}
