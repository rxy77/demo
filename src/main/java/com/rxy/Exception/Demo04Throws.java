package com.rxy.Exception;

import java.io.FileNotFoundException;
import java.io.IOException;
/*
    throws关键字：异常处理的第一种方式，交给别人处理
        作用：
        当方法内部批出;异常对象的时候，那么我们就必须处理这个异常对象
        可以使用throws关键字处理异常对象，会把异常对象声明地出给方法的调用者处理（自己不处理，给别人处理），最終交给了VA收上理-->中断处理
        使用格式：在方法声明时使用
            修饰符 返回值类型 方法名（参数列表）throws AAAException, BBBException . . .{
                throws new AAAException("产生原因“)；
                throws new BBBException("产生原因“)；
        }
        注意
        1.throws关键字必须写在方法声明处
        2.throws关键字后边声明的异常必须是Exception或者是Exception的子类
        3.方法内部如果抛出了多个异常对象，那么throws后边必须也声明多个异常
        如果抛出的多个异常对象有子父类关系，那么直接声明父类异常即可
        4.调用了一个声明抛出异常的方法，我们就必须的处理声明的异常
        要么继续使用throws声明抛出，交给方法的调用者处理，最终交给了JVM
        要么try...catch自己处理异常
 */
public class Demo04Throws {
    /*
        FileNotFoundException extends IOException extends Exception
         如果抛出的多个异常对象有子父类关系，那么直接声明父类异常即可
     */
//    public static void main(String[] args) throws /*FileNotFoundException ,*/IOException{
    public static void main(String[] args) throws /*FileNotFoundException ,*/Exception{
        readFile("c://a.tx");

        System.out.println("后续代码");//throws声明抛出，交给方法的调用者处理，最终交给了JVM,JVM中断程序，不会执行
    }
/*
        定义一个方法,对传递的文件路径进行合法性判断
        如果路径不是"C：//a.txt〞，那么我们就抛出;文件找不到异常对象，告知方法的调用者
        注意：
            FileNotFoundException是编译异常，抛出了编译异常，就必须处理这个异常
            可以使用throws继续声明抛出FileNotFoundException这个异常对象，让方法的调用者处理
 */
    private static void readFile(String fileName) throws /*FileNotFoundException,*/IOException {
        if (!fileName.equals("c://a.txt"))
            throw new FileNotFoundException("找不到文件异常");

        if (!fileName.endsWith(".txt"))
            throw new IOException("文件后缀名不对");

        System.out.println("已找到文件，读取文件");
    }
}
