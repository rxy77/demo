package com.rxy.demo.Demo05;
/*
方法重写的注意事项：
1、必须保证父子类之间的方法名称相同，参数列表相同
@override:写在方法前面，用来检测是不是有效重写；
这个注解就算不写，只要满足条件，也可以进行正确的方法重写

2、子类方法返回值必须【小于或等于】父类方法的返回值范围
提示：java.lang.Object是所有类中公共最高父类(祖宗类),java.lang.String类就是Object的子类

3、子类方法的权限必须【大于或等于】父类方法的权限
提示：public>protected>(default)>private
备注：(default)不是关键字default，而是什么都不写

*
* */
public class Demo04Override {

}
