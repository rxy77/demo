package com.rxy.Demo01Exception;
/*
    子父类的异常：
        -如果父类抛出多个异常，子类在重写父类方法时，抛出和父类相同的异常/父类异常的子类/不抛出异常
        -如果父类不抛出异常，子类在重写父类方法时也不能抛出异常，但可以捕获处理异常
    注意：
    父类异常时什么样，子类异常就什么样
 */
public class Fu {
    public void show01()  throws NullPointerException,ClassCastException{}
    public void show02()  throws IndexOutOfBoundsException{}
    public void show03()  throws IndexOutOfBoundsException{}
    public void show04(){}

}
class Zi extends Fu{
    //如果父类抛出多个异常，子类在重写父类方法时，抛出和父类相同的异常
    public void show01()  throws NullPointerException,ClassCastException{}
    //父类异常的子类
    public void show02()  throws IndexOutOfBoundsException{}
    //不抛出异常
    public void show03(){}

    /*
        如果父类不抛出异常，子类在重写父类方法时也不能抛出异常，但可以捕获处理异常
     */
    public void show04(){
        try {
            throw new Exception("编译期异常");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
