package com.rxy.demo.Demo01;

public class Demo01Array  {
    public static void main(String[] args) {
        Person[] array=new Person[3];
//        System.out.println(array[0]);

        Person one=new Person("古力娜扎",20);
        Person two=new Person("迪丽热巴",21);
        Person three=new Person("玛尔扎哈",38);

        array[0]=one;
        array[1]=two;
        array[2]=three;

        System.out.println(array[0]);//地址值
        System.out.println(array[1]);//地址值
        System.out.println(array[2]);//地址值

        System.out.println(array[0].getName());
    }
}
