package com.qf.reflect;

import com.qf.java.bean.Student;

/**
 * 必须掌握：
 *      怎么通过反射机制访问一个java对象的属性？
 *      给属性赋值set
 *      获取属性的值get
 */
public class ReflectTest07 {
    public static void main(String[] args) throws Exception{

        // 我们不使用反射机制，怎么去放问一个对象的属性呢？
        Student s = new Student();
        // 给属性赋值
        s.no = 1111;
        // 读属性
        System.out.println(s.no);

        // 使用反射机制，怎么去访问一个对象的属性。（）
        Class studentClass = Class.forName("com.qf.java.bean.Student");
    }
}
