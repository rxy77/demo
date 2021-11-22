package com.rxy.thread.Demo08.Synchronized;
/*
    卖票案例出现了线程安全问题
    卖出了不存在的票和重复的票

    解決线程安全问题的第二种方案：使用同步方法
    使用步骤:
        1.把访问了共享数据的代码抽取出来，放到一个方法中
        2.在方法上添加synchronized修饰符
    格式：定义方法的格式:
        修饰符 synchronized 返回值类型 方法名(参数列表){
            可能会出现线程安全问题的代码(访问了共享数据的代码)
        }

 */
public class RunnableImpl implements Runnable {
    //定义一个多线程共享的票源
    private int ticket = 100;

    @Override
    public void run() {
        System.out.println(this);//com.rxy.thread.Demo08.Synchronized.RunnableImpl@5b480cf9
        //为了提高问题出现的概率，让程序睡眠
        while (true) {
            pyaticket();
        }


    }

    /*
        定义一个同步方法
        同步方法也会把内部代码锁住
        只让一个线程执行
        同步方法的锁对象是谁？
        就是实现类对象 new RunnableImpl()
        也就是this
     */

    public synchronized void pyaticket() {

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
