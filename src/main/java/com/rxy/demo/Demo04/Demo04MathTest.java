package com.rxy.demo.Demo04;

public class Demo04MathTest {
    public static void main(String[] args) {
        double num=-10.9;
        double max=5.9;
        int count=0;

        for (int i=(int)num;i<max;i++){//如果使用Math.ceil方法，-10.9可以变成-10.0

            int abs=Math.abs(i);
            if (abs>6||abs<2.1){count++;}
        }



        System.out.println(count+"个");
    }
}
