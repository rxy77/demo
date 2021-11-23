package com.rxy.Lambda.Demo02.Lambda;
/*
    需求：
        给定一个厨子cook接口，内含唯一的抽象方法makeFood，且无参数、无返回值。
        使用Lambda的标准格式调用invokeCook方法，打印输出“吃饭啦！“字样
 */
public class Demo01Lambda {
    public static void main(String[] args) {
        //匿名内部类
        invokeCook(new Cook() {
            @Override
            public void makeFood() {
                System.out.println("吃饭了");
            }
        });

        //Lambda，简化匿名内部类
        invokeCook(()->{
            System.out.println("吃饭了Lambda");
        });

        //优化省略Lambda
        invokeCook(()-> System.out.println("吃饭了Lambda(省略)"));
    }

    public static void invokeCook(Cook cook) {
        cook.makeFood();
    }
}
