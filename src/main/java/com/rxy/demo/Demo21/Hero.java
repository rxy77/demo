package com.rxy.demo.Demo21;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Hero {
    private String name;
    private Skill skill;

    public void attack(){
        System.out.println("我叫"+name+",开始释放技能");
        skill.use();//调用接口
        System.out.println("技能释放完毕");
    }
}
