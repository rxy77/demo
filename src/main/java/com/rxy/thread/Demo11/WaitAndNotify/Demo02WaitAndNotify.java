package com.rxy.thread.Demo11.WaitAndNotify;
/*
    进入到TimeWaiting(计时等待)有两种方式
    1.使用sleep(Long m)方法，在毫秒值结束之后，线程睡醒进入到Runnable/BLocked大态
    2.使用wait(Long m)方法，wait方法如果在毫秒值结束之后，还没有被notify唤醒，就会自动醒来，线程睡醒进入到Runnable/BLocked状态

    唤醒的方法：
        void notify()唤醒在此对象监视器上等待的单个线程。
        void notifyAll()唤醒在此对象监视器上等待的所有线程。
 */
public class Demo02WaitAndNotify {
    public static void main(String[] args) {
        Object obj = new Object();//创建锁对象，保证唯一

        new Thread(){//创建一个消费者线程
            @Override
            public void run() {
                while (true){
                    synchronized (obj){
                        System.out.println("顾客1告知老板要吃包子的数量和种类");
                        //调用wait()方法，放弃cpu的执行，进入WAITING状态
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        //唤醒之后的代码
                        System.out.println("包子已经做好，顾客1开始吃包子");
                        System.out.println("==========================");
                    }
                }

            }
        }.start();

        new Thread(){//创建一个消费者线程
            @Override
            public void run() {
                while (true){
                    synchronized (obj){
                        System.out.println("顾客2告知老板要吃包子的数量和种类");
                        //调用wait()方法，放弃cpu的执行，进入WAITING状态
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        //唤醒之后的代码
                        System.out.println("包子已经做好，顾客2开始吃包子");
                        System.out.println("==========================");
                    }
                }

            }
        }.start();

        new Thread(){//创建一个老板线程
            @Override
            public void run() {
                while (true){
                    try {
                        Thread.sleep(5000);//花5秒做包子
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    //保证等待和唤醒的线程只能有1个执行，需要使用同步技术
                    synchronized (obj){
                        System.out.println("老板用5秒做好包子了，告知顾客，可以吃包子了");
                        //做好包子后，调用notify方法，唤醒顾客吃包子
                        //obj.notify();//如果等待多个线程，随机唤醒一个
                        obj.notifyAll();//唤醒所有等待的线程
                    }
                }


            }
        }.start();
    }
}
