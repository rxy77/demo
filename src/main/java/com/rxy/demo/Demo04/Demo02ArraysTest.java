package com.rxy.demo.Demo04;

import java.util.Arrays;

public class Demo02ArraysTest {
    public static void main(String[] args) {
        String arrayString="fygvhbjnVGYBUHNJkjhMJuhBJKN";

        char[] chars=arrayString.toCharArray();

        Arrays.sort(chars);

        for (int i = chars.length-1; i>=0; i--) {
            System.out.print(chars[i]);
        }
    }
}
