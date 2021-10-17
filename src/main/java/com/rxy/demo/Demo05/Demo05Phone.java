package com.rxy.demo.Demo05;

public class Demo05Phone {
    public static void main(String[] args) {
        Phone phone=new Phone();
        phone.call();
        phone.send();
        phone.show();
        System.out.println("===================");

        NewPhone newPhone=new NewPhone();
        newPhone.call();
        newPhone.send();
        newPhone.show();
    }
}
