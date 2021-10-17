package com.rxy.thread;

import java.util.concurrent.*;

public class CachedThreadPool {
    public static void main(String[]args){
        ExecutorService exec=Executors.newCachedThreadPool();
        for(int i=0;i<5;i++)
            exec.execute(new Liftoff());
        exec.shutdown();
    }
}
