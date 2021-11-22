package com.rxy.thread.Demo09.Synchronized;

public class RunnableImpl implements Runnable {
    //定义一个多线程共享的票源
    private static int ticket = 100;

    @Override
    public void run() {
        //为了提高问题出现的概率，让程序睡眠
        while (true) {
            pyaticketStatic();
        }


    }

    /*
        静态同步方法
        锁对象是谁？
        不能是this
        this是创建对象之后出现的，静态方法优先于对象
        静态方法的锁是本类的class属性-->class文件对象(反射)
     */

    public static /*synchronized*/ void pyaticketStatic() {
        synchronized (Runnable.class){


        if (ticket > 0) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //票存在，ticket--

            System.out.println(Thread.currentThread().getName() + "-->正在卖第" + ticket + "张票");
            ticket--;
        }
        }
    }
}
