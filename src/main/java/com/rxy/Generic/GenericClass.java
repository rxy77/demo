package com.rxy.Generic;

import lombok.Data;

/*
    定义一个含有泛型的类，模拟ArrayList集合
    泛型是一个未知的数据类型，当我们不确定什么数据类型的时候，可以使用泛型
    泛型可以接收任意的数据类型，可以使用Integer，String，Student...
    创建对象的时候确定泛型的数据类型
 */
@Data
public class GenericClass<E> {
    private E Name;

    //直接使用lombok
    /*public E getName() {
        return Name;
    }

    public void setName(E name) {
        Name = name;
    }*/
}
