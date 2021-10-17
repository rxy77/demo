package com.rxy.demo.Demo20;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Hero {
    private String name;//英雄的名字
    private int age;//年龄
    private Weapon weapon;//使用Weapon对象，武器

    public void attack(){
        System.out.println("年龄："+age+"的"+name+"用"+weapon.getCode()+"与敌人战斗！");
    }


}
