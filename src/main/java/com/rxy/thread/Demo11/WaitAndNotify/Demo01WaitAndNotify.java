package com.rxy.thread.Demo11.WaitAndNotify;
/*
    等待唤醒秦例：线程之间的通信
        创建一个顾客线程（消费者）：告知老板要的包子的种类和数量，调用wait方法，放弃cpu的执行，进入到WAITING状态（无限等待）
        创建一个老板线程（生产者）：花了5秒做包子，做好包子之后，调用notify方法，唤醒顾客吃包子
    注意：
        顾客和老板线程必须使用同步代码块包裏起来，保证等待和唤醒只能有一个在执行
        同步使用的锁对象必须保证唯一
        只有锁对象才能调用wait和notify方法

    Object类中的方法
    void wait()
        在其他线程调用此对象的 notify()方法或 notifyALL() 方法前，导致当前线程等待。
    void notify()
        唤醒在此对象监视器上等待的单个线程。
        会继续执行wait方法之后的代码
 */
public class Demo01WaitAndNotify {
    public static void main(String[] args) {
        Object obj = new Object();//创建锁对象，保证唯一

        new Thread(){//创建一个消费者线程
            @Override
            public void run() {
                while (true){
                    synchronized (obj){
                        System.out.println("告知老板要吃包子的数量和种类");
                        //调用wait()方法，放弃cpu的执行，进入WAITING状态
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        //唤醒之后的代码
                        System.out.println("包子已经做好，开始吃包子");
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
                        obj.notify();
                    }
                }


            }
        }.start();
    }
}
