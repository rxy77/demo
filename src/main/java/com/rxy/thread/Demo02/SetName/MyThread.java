package com.rxy.thread.Demo02.SetName;

public class MyThread extends Thread{
    public MyThread(String name) {
        super(name);
    }

    public MyThread() {
    }


    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
