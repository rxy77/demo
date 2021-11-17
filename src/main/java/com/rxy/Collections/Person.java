package com.rxy.Collections;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Person implements Comparable<Person>{
    private String name;
    private int age;

    @Override
    public int compareTo(Person o) {
//        return 0;//默认元素都相同
        //自定义比较的规则，比较2个人的年龄(this,参数Person)
//        return this.getAge()-o.getAge();//按照年龄升序
        return o.getAge()-this.getAge();//按照年龄降序

    }

}
