package com.rxy.demo.Demo21;

public class DemoGame {
    public static void main(String[] args) {
        Hero hero=new Hero();
        hero.setName("射手");

        //设置英雄技能
//        hero.setSkill(new SkillImpl());//使用单独实现类

        //使用匿名内部类
//        Skill skill=new Skill() {
//            @Override
//            public void use() {
//                System.out.println("pia~pia~pia~");
//            }
//        };
        //hero.setSkill(skill);


        //进一步简化，同时使用 匿名内部类和匿名对象
        hero.setSkill(new Skill() {
            @Override
            public void use() {
                System.out.println("biang~biang~biang~");
            }
        });



        hero.attack();
    }
}
