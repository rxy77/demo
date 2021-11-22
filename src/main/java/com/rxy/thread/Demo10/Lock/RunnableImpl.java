package com.rxy.thread.Demo10.Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
    卖票素例出现了线程安全问题
    卖出了不存在的票和重复的票

    解决线程安全问题的三种方案：使用Lock锁
        java.util.concurrent.Locks.Lock接口
    Lock 实现提供了比使用 Synchronized 方法和语句可获得的更广泛的锁定操作。
    Lock接口中的方法：
    void lock()获取锁。
    void unlock()释放锁。
    java.util.concurrent. Locks.ReentrantLock implements Lock接口
    使用步骤：
        1.在成员位蛋创建一个ReentrantLock对象
        2.在可能会出现安全问题的代码前调用Lock接口中的方法Lock获取锁
        3.在可能会出现安全问题的代码后调用LoCk接口中的方法unLock释放//在finally里更合理
 */
public class RunnableImpl implements Runnable{
    private int ticket=100;

    //1.在成员位蛋创建一个ReentrantLock对象
    Lock l=new ReentrantLock();

    @Override
    public void run() {
        //为了提高问题出现的概率，让程序睡眠
        while (true){

            //2.在可能会出现安全问题的代码前调用Lock接口中的方法Lock获取锁
            l.lock();

            if (ticket>0){
                try {
                    Thread.sleep(10);
                    //票存在，ticket--
                    System.out.println(Thread.currentThread().getName()+"-->正在卖第"+ticket+"张票");
                    ticket--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    l.unlock();
                }


            }

        }
    }
}
