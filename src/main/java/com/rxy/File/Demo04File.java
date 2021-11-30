package com.rxy.File;

import java.io.File;
/*
    public boolean exists():此File表示的文件或目录是否实际存在。
    public boolean isDirectory():此File表示的是否为目录。
    public boolean isFile()：此File表示的是否为文件。


    public boolean isDirectory():此File表示的是否为目录。
    public boolean isFile()：此File表示的是否为文件。
    注意：
        电脑的硬盘中只有文件/文件夹，两个方法是互斥
        这两个方法使用前提，路径必须是存在的，否则都返回false
 */
public class Demo04File {
    public static void main(String[] args) {
        File f1 = new File("/Users/stark/Documents/文稿/wallpaper/1.jpg");
        File f2 = new File("/Users/stark/Documents/文稿/wallpaper");
        System.out.println("f1是否存在："+f1.exists());//f1是否存在：true
        System.out.println("f2是否存在："+f2.exists());//f2是否存在：true
        System.out.println("===============");

        System.out.println("f1是否是文件："+f1.isFile());//f1是否是文件：true
        System.out.println("f2是否是文件："+f2.isFile());//f2是否是文件：false
        System.out.println("===============");

        System.out.println("f1是否是文件夹："+f1.isDirectory());//f1是否是文件夹：false
        System.out.println("f2是否是文件夹："+f2.isDirectory());//f2是否是文件夹：true
        System.out.println("===============");

        //不存在就没必要获取
        if (f1.exists()){
            System.out.println("f1是否是文件："+f1.isFile());//f1是否是文件：true
            System.out.println("f1是否是文件夹："+f1.isDirectory());//f1是否是文件夹：false
            System.out.println("===============");
        }
        if (f2.exists()){
            System.out.println("f2是否是文件："+f2.isFile());//f2是否是文件：false
            System.out.println("f2是否是文件夹："+f2.isDirectory());//f2是否是文件夹：true
            System.out.println("===============");
        }
    }
}
