package com.rxy.Exception;

import java.util.List;
/*
        多个异常如何处理？
            1. 名个异常分别处理。
            2. 多个异常一次捕获，多次处理。
            3. 多个异常一次捕获一次处理。
 */
public class Demo07Exception {
    public static void main(String[] args) {

        /*
            1. 名个异常分别处理。
         */
        try {
            int[] arr={1,2,3};
            System.out.println(arr[3]);//ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }

        try {
            List<Integer> list = List.of(1, 2, 3);
            System.out.println(list.get(3));//IndexOutOfBoundsException: Index 3 out of bounds for length 3
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }

        /*
            2. 多个异常一次捕获，多次处理。
            注意事项：
                catch里边定义的异常变量，如果有子父类关系，那么子类的异常变量必须写在上边，否则就会报错
                ArrayIndexOutOfBoundsException extends IndexOutOfBoundsException
         */

        try {
            int[] arr={1,2,3};
            System.out.println(arr[3]);//ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
            List<Integer> list = List.of(1, 2, 3);
            System.out.println(list.get(3));//IndexOutOfBoundsException: Index 3 out of bounds for length 3
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }

        /*
            3. 多个异常一次捕获一次处理。
         */
        try {
            int[] arr={1,2,3};
            System.out.println(arr[3]);//ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
            List<Integer> list = List.of(1, 2, 3);
            System.out.println(list.get(3));//IndexOutOfBoundsException: Index 3 out of bounds for length 3
        }catch (Exception e){
            System.out.println(e);
        }


        //运行时异常被抛出可以不处理。即不捕获也不声明抛出
        //默认给虚拟机处理，终止程序，什么时候不抛出运行时异常了，在来继续执行程序
        int[] arr={1,2,3};
        System.out.println(arr[3]);//ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
        List<Integer> list = List.of(1, 2, 3);
        System.out.println(list.get(3));//IndexOutOfBoundsException: Index 3 out of bounds for length 3


        System.out.println("后续代码");
    }
}
