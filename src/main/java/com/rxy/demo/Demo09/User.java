package com.rxy.demo.Demo09;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
    private String name;
    private int money;
    public void show(){
        System.out.println("我是："+name+"，我有"+money);
    }
}
