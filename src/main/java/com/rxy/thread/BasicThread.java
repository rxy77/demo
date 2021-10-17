package com.rxy.thread;

public class BasicThread {
    public static void main(String[] args){
        Thread t= new Thread(new Liftoff());
        t.start();
        System.out.println("Waiting for Liftoff");
    }
}
