package com.rxy.Filter;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

/*
    在File类中有两个和ListFiles重载的方法，方法的参数传递的就是过滤器
    FilerJ ListFiles (FileFilter filter)
    java.io.FileFilter接口：用于抽象路径名(File对象）的过滤器。
        作用：用来过滤文件(File对象）
        抽象方法：用来过滤文件的方法
            boolean accept(File pathname）测试指定抽象路径名是否应该包含在某个路径名列表中。
            参数：
                File pathname:使用ListFiles方法遍历目录，得到的每一个文件对象
    File[] ListFiles(FilenameFilter filter)
    Java.io.FilenameFilter:实现此接口的类实例可用于过滤器文件名。
        作用：用来过滤文件名称
        抽象方法：用来过滤文件的方法
            boolean accept (File dir, string name）测试指定文件是否应该包含在某一文件列表中。
            参数：
                File dir:构造方法中传递的被遍历的目录
                String name:使用ListFiles方法遍历目录，获取的每一个文件/文件夹的名称
    注意：
        两个过滤器接口是没有实现类的，需要我们自己写实现类，重写过滤的方法accept，在方法中自己定义过滤的规则
 */
public class Demo01Filter {
    public static void main(String[] args) {
        File filePath = new File("/Users/stark/Desktop/Newton/java/java-begin/src/main/java/com/rxy/Recursion");
        getAllFile(filePath);
    }

    private static void getAllFile(File dir) {
        //System.out.println(dir);//打印被遍历的目录名称
//        File[] files = dir.listFiles(new FileFilterImpl() );
        //优化
//        File[] files = dir.listFiles(new FileFilter() {
//            @Override
//            public boolean accept(File pathname) {
//                //过滤规则：pathName是文件夹，或是以.java结尾的文件返回true
//                return pathname.isDirectory()||pathname.getName().toLowerCase().endsWith(".java");
//            }
//        });
        //使用Lambda(接口中只有一个抽象类方法)
//        File[] files = dir.listFiles((File pathname)->{
//            return pathname.isDirectory()||pathname.getName().toLowerCase().endsWith(".java");
//        });

        //继续优化
        File[] files = dir.listFiles(pathname->pathname.isDirectory()||pathname.getName().toLowerCase().endsWith(".java"));


//        File[] files = dir.listFiles(new FilenameFilter() {
//            @Override
//            public boolean accept(File dir, String name) {
//                //过滤规则：pathName是文件夹，或是以.java结尾的文件返回true
//                return new File(dir,name).isDirectory()||name.toLowerCase().endsWith(".java");
//            }
//        });

        //使用Lambda(接口中只有一个抽象类方法)
//        File[] files = dir.listFiles((File d, String name)->{
//            //过滤规则：pathName是文件夹，或是以.java结尾的文件返回true
//                return new File(d,name).isDirectory()||name.toLowerCase().endsWith(".java");
//        });

        //继续优化
//        File[] files = dir.listFiles((d,name)-> new File(d,name).isDirectory()||name.toLowerCase().endsWith(".java"));

        for (File file : files) {
            if (file.isDirectory()==true){
                getAllFile(file);
            }else {
                System.out.println(file);
            }

        }
    }
}
