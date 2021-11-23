package com.rxy.Lambda.Demo01.Lambda;

public class Demo01Lambda {
    public static void main(String[] args) {
        RunnableImpl run = new RunnableImpl();
        Thread tr = new Thread(run);
        tr.start();

        //简化代码
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"新的线程已创建");
            }
        };
        new Thread(r).start();

        //简化代码
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"新的线程已创建");

            }
        }).start();
    }
}
