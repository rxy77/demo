package com.rxy.Exception;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    java.Lang.Throwable：类是 Java 语言中所有错误或异常的超类。
    Exception:编译期异常，进行编译(写代码)java程序出现的问题
        RuntimeException;运行期异常，java程序运行过程中出现的问题
        异常就相当于程序得了一个小毛病(感冒，发烧），把异常处理掉，程序可以继续执行（吃点药，继续革命工作）
    Error:错误
        错误就相当于程序得了一个无法治疗的毛病(非典，艾滋)-必须修改源代码，程序才能继续执行
 */
public class Demo01Exception {
    public static void main(String[] args) /* throws ParseException */ {
        //Exception:编译期异常，进行编译(写代码)java程序出现的问题
//        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
//        Date date=null;
//        try {
//             date = sdf.parse("1999-1001");
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println(date);

        //RuntimeException;运行期异常，java程序运行过程中出现的问题
//        int[] arr={1,2,3};
//        System.out.println(arr[1]);
//        try {//可能出现异常的语句
//            System.out.println(arr[3]);//ArrayIndexOutOfBoundsException
//        }catch (Exception e){//处理异常的逻辑
//            System.out.println(e);
//        }
//        System.out.println(arr[0]);

        //Error:错误
        //OutOfMemoryError
        //内存溢出，创建的数组太大了，超出了JVM的内存空间，只能修改源代码
//        int[] arr=new int[1024*1024*1024];
        int[] arr=new int[1024*1024];
        System.out.println("后续代码");

    }
}
