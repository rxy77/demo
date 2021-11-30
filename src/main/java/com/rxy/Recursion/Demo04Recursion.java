package com.rxy.Recursion;

import java.io.File;

public class Demo04Recursion {
    public static void main(String[] args) {
        File filePath = new File("/Users/stark/Desktop/Newton/java/java-begin/src/main/java/com/rxy/Recursion");
        getAllFile(filePath);
    }

    private static void getAllFile(File dir) {
        System.out.println(dir);//打印被遍历的目录名称
        File[] files = dir.listFiles();
        for (File file : files) {
            if (file.isDirectory()==true){
                getAllFile(file);
            }else {
                System.out.println(file);
            }

        }
    }
}
