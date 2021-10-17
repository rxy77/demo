package com.rxy.thread;

public class MoreBasicThread {
    public static void main(String[] args){
        for(int i=0;i<5;i++)
            new Thread(new Liftoff()).start();
        System.out.println("Waiting for Liftoff");
    }
}
