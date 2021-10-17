package com.rxy.demo.Demo02;
/*public String substring(int index)：截取从参数位置一直到字符串末尾，返回新字符串
public String substring(int begin,int end)：截取从begin开始，到end结束，中间的字符串
备注：[begin,end),包括左边，不包括右边
*/

public class Demo03StringSub {
    public static void main(String[] args) {
        String str1="HelloWorld";
        String str2=str1.substring(5);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println("===============");

        String str3=str1.substring(4,7);
        System.out.println(str3);
        System.out.println("===============");

        /*两个字符串："Hello"、"java"
        strA改变的是地址值
        例：本来地址值0x666
        之后变成0x999
        */
        String strA="Hello";
        System.out.println(strA);
        strA="java";
        System.out.println(strA);
    }
}
