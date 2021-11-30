package com.rxy.File;

import java.io.File;
import java.io.IOException;

/*
    public boolean createNewFile():当且仅当具有该名称的文件尚不存在时，创建一个新的空文件。
    public boolean delete():删除由此File表示的文件或目录。
    public boolean mkdir():创建由此File表示的目录。
    public boolean mkdirs():创建由此File表示的目录，包括任何必需但不存在的父目录。(多级文件夹)
 */
public class Demo05File {
    public static void main(String[] args) throws IOException {
//        show01();
//        show02();
        show03();
    }

    /*
        public boolean delete()：册除由此File表示的文件或目录。
        此方法，可以删除构造方法路径中给出的文件/文件夹
        返回值：布尔值
            true:文件/文件夹删除成功，返回true
            false：文件夹中有内容，不会期除返回false;构造方法中路径不存在false
        注意：
            delete方法是直接在硬盘册除文件/文件夹，不走回收站，删除要谨慎
     */
    private static void show03() {
        File f1 = new File("src/main/java/com/rxy/File/新建文件夹");
        boolean b1 = f1.delete();
        System.out.println("是否删除："+b1);

        File f2 = new File("src/main/java/com/rxy/File/aaa.txt");
        System.out.println("是否删除："+f2.delete());
    }

    /*
        public boolean mkdir():创建单级空文件夹
        public boolean mkdirs():既可以创建单级空文件夹,也可以创建多级文件夹
        创建文件夹的路径和名称在构造方法中给出（构造方法的参数）
        返回值：布尔值
            true:文件夹不存在，创建文件夹,返回true
            false:文件夹存在，不会创建，返回false;构造方法中给出的路径不存在返回false
        注意：
            1.此方法只能创建文件夹，不能创建文件
     */
    private static void show02() {
        File f1 = new File("src/main/java/com/rxy/File/aaa");
        boolean b1 = f1.mkdir();
        System.out.println("是否创建成功："+b1);//true

        File f2 = new File("src/main/java/com/rxy/File/1/2/3/4");
        System.out.println("是否创建成功："+f2.mkdirs());//true

        File f3 = new File("src/main/java/com/rxy/File/aaa.txt");
        System.out.println("是否创建成功："+f3.mkdirs());//true 注意看类型，是文件夹

        File f4 = new File("src/main/java/com/rxy/Fil/aaa");
        System.out.println("是否创建成功："+f4.mkdirs());//不会抛出异常，路径不存在，不会创建

    }

    /*
        public boolean createNewFile(）：当且仅当具有该名称的文件尚不存在时，创建一个新的空文件。
        创建文件的路径和名称在构造方法中给出（构造方法的参数）
        返回值：布尔值
            true:文件不存在，创建文件，返回true
            false:文件存在，不会创建，返回false
        注意：
            1•此方法只能创建文件，不能创建文件夹
            2.创建文件的路径必须存在，否则会抛出异常
     */
    private static void show01() throws IOException {
        File f1 = new File("/Users/stark/Desktop/Newton/java/java-begin/src/main/java/com/rxy/File/1.txt");
        boolean newFile = f1.createNewFile();
        System.out.println("是否创建成功："+newFile);//true

//        File f2 = new File("2.txt");//只写这个路径，创建在项目目录下，不在File文件夹
        File f2 = new File("src/main/java/com/rxy/File/2.txt");//要从项目路径开始写
        System.out.println("是否创建成功："+f2.createNewFile());//true

        File f3 = new File("src/main/java/com/rxy/File/新建文件夹");
        System.out.println("是否创建成功："+f3.createNewFile());//true 不要名称迷惑，还是文件，不是文件夹

        File f4 = new File("src/main/java/com/rxy/Fil/新建文件夹");
        System.out.println("是否创建成功："+f4.createNewFile());//IOException 路径不存在会抛异常

    }
}
