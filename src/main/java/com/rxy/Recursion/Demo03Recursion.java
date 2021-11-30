package com.rxy.Recursion;

public class Demo03Recursion {
    public static void main(String[] args) {
        System.out.println(ca(3));
    }

    private static int ca(int i) {
        if (i==1)return 1;
        return i*ca(i-1);
    }
}
