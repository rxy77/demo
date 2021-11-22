package com.rxy.thread.Demo06.ThreadSafe;

public class RunnableImpl implements Runnable{
    private int ticket=100;
    @Override
    public void run() {
        //为了提高问题出现的概率，让程序睡眠
        while (true){
            if (ticket>0){
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                //票存在，ticket--

                    System.out.println(Thread.currentThread().getName()+"-->正在卖第"+ticket+"张票");
                    ticket--;
            }

        }
    }
}
