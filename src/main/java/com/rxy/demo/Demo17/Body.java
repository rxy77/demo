package com.rxy.demo.Demo17;

import lombok.Data;

@Data
public class Body {//外部类

    public class Heart{//内部类
        public void beat(){
            System.out.println("心脏跳动：beat！");
            System.out.println("我的名字："+name);//正确写法
        }
    }

    private String name;//外部成员变量

    public void methodBody(){//外部类方法
        System.out.println("外部类方法");
        Heart heart=new Heart();
        heart.beat();
    }

}
