package com.rxy.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThread {
    public static void main(String[] args){
        ExecutorService exec= Executors.newFixedThreadPool(5);
        for(int i=0;i<5;i++)
            exec.execute(new Liftoff());
        exec.shutdown();
    }
}
