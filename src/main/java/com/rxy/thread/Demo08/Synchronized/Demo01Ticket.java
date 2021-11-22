package com.rxy.thread.Demo08.Synchronized;

public class Demo01Ticket {
    public static void main(String[] args) {
        RunnableImpl run = new RunnableImpl();
        System.out.println(run);//com.rxy.thread.Demo08.Synchronized.RunnableImpl@5b480cf9
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);
        Thread t3 = new Thread(run);
        t1.start();
        t2.start();
        t3.start();
    }
}
