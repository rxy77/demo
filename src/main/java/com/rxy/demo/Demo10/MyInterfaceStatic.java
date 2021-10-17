package com.rxy.demo.Demo10;
/*
从java8开始，接口当中允许定义静态方法
格式：
public static 返回值类型 方法名称(参数列表){
    //...
}
 提示：就是将abstract或default换成static即可，带上方法体*/
public interface MyInterfaceStatic {
    public static void methodStatic(){
        System.out.println("接口的静态方法执行");
    }
}
