package com.rxy.demo.Demo03;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Student {
    private int id;
    private String name;
    private int age;
    static String room;
    private static int idCounter=0;

    public Student(){
        this.id=++idCounter;
    }

    public Student(String name,int age){
        this.name=name;
        this.age=age;
        this.id=++idCounter;
    }
}
