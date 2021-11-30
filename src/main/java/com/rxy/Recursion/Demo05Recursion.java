package com.rxy.Recursion;

import java.io.File;
/*
    只要.java结尾的文件
 */
public class Demo05Recursion {
    public static void main(String[] args) {
        File filePath = new File("/Users/stark/Desktop/Newton/java/java-begin/src/main/java/com/rxy/Recursion");
        getAllFile(filePath);
    }

    private static void getAllFile(File dir) {
        //System.out.println(dir);//打印被遍历的目录名称
        File[] files = dir.listFiles();
        for (File file : files) {
            if (file.isDirectory()==true){
                getAllFile(file);
            }else {
                //String name = file.getName();//文件类型获取文件名方法，转换为字符串
                //String path = file.getPath();
                /*String s = file.toString();

                if (s.toLowerCase().endsWith(".java")){//先转换为小写，再进行判断，文件结尾大小写都可以搜索
                    System.out.println(file);
                }*/

                //优化
                if (file.getName().toLowerCase().endsWith(".java")) System.out.println(file);

            }

        }
    }
}
