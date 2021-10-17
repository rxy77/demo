package com.rxy.demo.Demo15;

public class Computer {
    public void powerOn(){
        System.out.println("笔记本电脑开机");
    }

    public void powerOff(){
        System.out.println("笔记本电脑关机");
    }

    //使用接口作为参数
    public void useDevice(USB usb){
        usb.Open();//打开设备
        if (usb instanceof Mouse){//先判断
            Mouse mouse=(Mouse) usb;//向下转型
            mouse.click();
        }else if(usb instanceof Keyboard){
            Keyboard keyboard=(Keyboard) usb;
            keyboard.type();
        }
        usb.Close();//关闭设备
    }
}
