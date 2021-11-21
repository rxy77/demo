package com.rxy.Exception;

import java.util.Objects;

/*
    public static <T> T requireNonNull(T obj)：查看指定引用对象不是null。
    源码：
        public static ‹T› T requireNonNull(T obj) f
        if (obj == null)
            throw new NulLPointerException();
        return obj;
 */
public class Demo03Objects {
    public static void main(String[] args) {
        method(null);
    }

    private static void method(Object obj) {
        //对传递过来的参数进行合法性判断，判断是否为null
        /*if(obj == null)
            throw new NulLPointerException(“传递的对象的值是nulL”)；
        }*/

        Objects.requireNonNull(obj,"传递的对象是null");
    }
}
