package com.rxy.demo.Demo02;

/*public char[] toCharArry():将当前字符串转化为字符数组作为返回值
public byte[] getBytes():获取当前字符串底层的字节数组
public String replace(CharSequence oldString,CharSequence newString)
将所有出现的老字符串替换成新字符串，返回替换后的新字符串
备注：CharSequence意为可以接收字符串类型
*/
public class Demo04StringConvert {
    public static void main(String[] args) {
        char[] charArray="Hello".toCharArray();
        System.out.println(charArray[0]);
        System.out.println(charArray.length);
        System.out.println("=======================");

        byte[] bytes="abc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        System.out.println("=======================");

        String str1="How do you do?";
        String str2 = str1.replace("o", "*");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println("=======================");

        String strA="会不会玩啊，你大爷的！";
        String strB = strA.replace("你大爷的", "****");
        System.out.println(strA);
        System.out.println(strB);
    }
}
