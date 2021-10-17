package com.rxy.demo.Demo20;

public class DemoMain {
    public static void main(String[] args) {
        //创建一个英雄角色
        Hero hero=new Hero();
        //设置年龄、姓名
        hero.setName("盖伦");
        hero.setAge(20);
        //创建一个武器对象
        Weapon weapon=new Weapon("ak47");
        //设置一个武器名称
        hero.setWeapon(weapon);

        //战斗
        hero.attack();
    }
}
