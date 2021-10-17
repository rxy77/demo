package com.rxy.demo.hello;


import lombok.*;
import lombok.extern.java.Log;

@Data
@Log
public class Student {

    private String name;
    private int age;
    private boolean male;
    static String a="你好";
    final int b=0;
   private String email;

   public void test(String str){
       log.info(str);
       System.out.println(str);
   }


    /*public String getName() {
        return name;
    }

    public void setName(String str) {
        name = str;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int num) {
        age = num;
    }

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean b) {
       male = b;
    }*/
}
