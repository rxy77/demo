package com.rxy.thread.DemoThread;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data@AllArgsConstructor@NoArgsConstructor
public class Person {
    private String name;

    public void run(){
        for (int i = 0; i < 20; i++) {
            System.out.println(name+"-->"+i);
        }
    }
}
