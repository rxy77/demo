package com.rxy.File;

import java.io.File;
/*
    File类遍历(文件夹)目录功能
        pubLic String[] List():返回一个string数组，表示该File目录中的所有子文件或目录。
        public File[] listFiles():返回一个File数组，表示该File目录中的所有的子文件或目录。
    注意：
        List方法和ListFiles方法遍历的是构造方法中给出的目录
        如果构造方法中给出的目录的路径不存在，会抛出空指针异常
        如果构造方法中给出的路径不是一个目录，也会抛出空指针昇常
 */
public class Demo06File {
    public static void main(String[] args) {
        show02();
    }

    /*
        pubLic File[] ListFiles():返回一个File数组，表示该File目录中的所有的子文件或目录。
        遍历构造方法中给出的目录，会获取目录中所有的文件/文件夹，把文件/文件夹封装为File对象，多个File对象存储到FiLe数组中
     */
    private static void show02() {
        File f1 = new File("/Users/stark/Desktop/Newton/java/java-begin/src/main/java/com/rxy/File");
        File[] files = f1.listFiles();
        for (File file : files) {
            System.out.println(file);//绝对路径
        }
    }

    /*
        pubLic string[] List():返回一个String数组，表示该File目录中的所有子文件或目录，
        遍历构造方法中给出的目录，会获取目录中所有文件/文件夹的名称，把获取到的多个名称存储到一个String类型的数组中
    */
    private static void show01() {
        File f1 = new File("/Users/stark/Desktop/Newton/java/java-begin/src/main/java/com/rxy/File");
//        File f1 = new File("/Users/stark/Desktop/Newton/java/java-begin/src/main/java/com/rxy/File/1.txt");//NullPointerException
//        File f1 = new File("/Users/stark/Desktop/Newton/java/java-begin/src/main/java/com/rxy/Fi");//NullPointerException
        String[] list = f1.list();
        for (String fileName : list) {
            System.out.println(fileName);
        }
    }
}
