package com.rxy.demo.Demo10;
/*
接口也可以定义"成员变量"，但必须使用public static final关键字进行修饰
从效果上看 这其实就是接口的【常量】
格式：
public static final 数据类型 常量名称=数据值；
备注：
一旦使用final关键字进行修饰，说明不可改变

注意事项：
1、接口当中的常量，可以省略public static final，但不写也是这个效果
2、接口当中的常量，必须进行赋值，不能不赋值
3、接口当中的常量命名规则，全部使用大写字母，使用"_"分割。(推荐命名规则)
 */
public interface MyInterfaceConst {
    public static final int NUM_OF_CLASS=10;
}
