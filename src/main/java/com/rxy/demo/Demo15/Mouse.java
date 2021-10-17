package com.rxy.demo.Demo15;

//鼠标就是一个USB设备，使用USB接口
public class Mouse implements USB{
    @Override
    public void Open() {
        System.out.println("打开鼠标");
    }

    @Override
    public void Close() {
        System.out.println("关闭鼠标");
    }
    public void click(){
        System.out.println("鼠标点击");
    }
}
