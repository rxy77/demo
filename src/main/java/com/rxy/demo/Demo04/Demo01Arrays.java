package com.rxy.demo.Demo04;

import java.util.Arrays;
/*java.util.Arrays是一个与数组相关的工具类，里面提供了大量的静态方法，用来实现数组的相关操作。

public static String toString(数组)：将参数数组变成字符串（按照默认格式：[元素1,元素2,元素3,...]）

public static void sort(数组):按照默认升序（从小到大）对数组元素进行排序

备注：
1、如果是数值，sort按照升序从小到大
2、如果是字符串，sort默认按照字母升序
3、如果是自定义类型，那么这个自定义的类需要有Comparable或者Comparator接口的支持。

*/

public class Demo01Arrays {
    public static void main(String[] args) {
        int[] arraynum={1,2,3};
        String intArray= Arrays.toString(arraynum);
        System.out.println(intArray);

        int[] arraynum1={2,3,1,5,6};
        Arrays.sort(arraynum1);
        System.out.println(Arrays.toString(arraynum1));

        String[] array2={"aaa","sfsa","bbb"};
        Arrays.sort(array2);
        System.out.println(array2);
        System.out.println(Arrays.toString(array2));
    }
}
