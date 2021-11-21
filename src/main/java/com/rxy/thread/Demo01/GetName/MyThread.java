package com.rxy.thread.Demo01.GetName;

public class MyThread extends Thread{
    @Override
    public void run() {
//        String name = getName();
//        System.out.println(name);

//        Thread t = Thread.currentThread();//Thread[Thread-0,5,main]
//        System.out.println(t);
//        String name = getName();
//        System.out.println(name);

        //链式编程
        System.out.println(Thread.currentThread().getName());
    }
}
