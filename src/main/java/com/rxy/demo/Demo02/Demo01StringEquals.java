package com.rxy.demo.Demo02;
/* public boolean equals(Obiect obj)参数可以是任何对象，只有参数是一个字符串并且内容相同，才会返回true，否则返回false
 注意事项：
 1、任何对象都能用Object接收
 2、equals具有对称性，也就是a.equals(b)相当于b.equals(a)
 3、如果比较对象是一个常量一个变量，推荐：常量.equals(变量)

   public boolean equalsIgnoreCase(String str):忽略大小写，进行比较
 */

public class Demo01StringEquals {
    public static void main(String[] args) {
        String str1="Hello";
        String str2="Hello";
        char[] chars={'H','e','l','l','o'};
        String str3=new String(chars);

        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str3));
        System.out.println(str3.equals("Hello"));
        System.out.println("Hello".equals(str2));

        String str4="hello";
        System.out.println(str1.equals(str4));
        System.out.println("==========================");

        String str5="abc";
        System.out.println("abc".equals(str5));//推荐
        System.out.println(str5.equals("abc"));//不推荐

        String str6=null;
        System.out.println("abc".equals(str6));//推荐,false
//        System.out.println(str6.equals("abc"));//不推荐,报错 空指针异常NullPointerException

        System.out.println("==========================");
        String strA="java";
        String strB="Java";
        System.out.println(strA.equals(strB));
        System.out.println(strA.equalsIgnoreCase(strB));
        //只区分英文字母大小写
    }
}
