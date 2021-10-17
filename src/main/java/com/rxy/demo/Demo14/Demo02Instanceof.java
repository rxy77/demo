package com.rxy.demo.Demo14;
/*
如何知道一个父类引用的对象，本来是什么子类
格式：
对象名 instanceof 类名称
返回值：一个boolean值，也就是说判断前面的对象能不能做后面类型的实例
 */
public class Demo02Instanceof {
    public static void main(String[] args) {
        Animal animal=new Cat();//本来是一只猫
        animal.eat();//猫吃鱼
        System.out.println("============");

        gitMeAPet(animal);
    }

    public static void gitMeAPet(Animal animal){
        //判断一下animal本来是不是Dog
        if (animal instanceof Dog){
            Dog dog=(Dog) animal;
            dog.viewHouse();
        }
        //判断一下animal本来是不是Cat
        if (animal instanceof Cat){
            Cat cat=(Cat) animal;
            cat.catchMouse();
        }
    }
}
