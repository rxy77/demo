package com.rxy.demo.Demo16;
/*
当final修饰一个类时，格式：
public final class 类名称(){
    //...
}

含义：这个类不能有任何子类。（太监类）
注意：一个final的类，他的任何方法都不可进行覆盖重写。（因为没儿子）
 */
public final class MyClass /*extends Object*/{
    public static void main(String[] args) {
        System.out.println("方法执行!");
    }
}
