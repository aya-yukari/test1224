package com.qf.reflect;

import java.util.Date;

/**
 * 1、通过java语言中的反射机制可以操作字节码文件
 * 优点类似于黑客。（可以读和修改字节码文件）
 * 通过反射机制可以操作代码片段。（class文件。）
 *
 * 2、反射机制的相关类在哪个包下？
 * java.lang.reflect.*;
 *
 * 3、反射机制相关的重要的类有哪些？
 *
 *      java.lang.class: 代表整个字节码，代表整个类
 *
 *      java.lang.reflect.Method: 代表字节码中的方法字节码。代表类中的方法。
 *
 *      java.lang.reflect.Constructor: 代表字节码中的构造方法字节码。代表类中的构造方法。
 *
 *      java.lang.reflect.Field:
 *
 *      代表字节码中的属性字节码。代表类中的成员变量（静态变量）
 * 要操作一个类的字节码，需要首先获取到这个类的字节码，怎么获取java.lang.Class实例？
 *
 * 三种方式
 *      第一种：Class c = Class.forName("完整类名带包名");
 *      第二种：Class c = 对象.getClass();
 *      第三种：Class c = 任何类型.class;
 */
public class ReflectTest01 {
    public static void main(String[] args) {
         /*
    Class.forName()
        1、静态方法
        2、方法的参数是一个字符串。
        3、字符串需要的是一个完整类名。
        4、完整类名必须带有包名。java.lang包也不能省略。
     */
        Class c1 = null;
        Class c2 = null;
        try {

            c1 = Class.forName("java.lang.String");// c1代表String.Class文件，或者说从代表String类型。
            c2 = Class.forName("java.util.Date");// c2代表Date类型
            Class c3 = Class.forName("java.lang.Integer");// c3代表Integer类型
            Class c4 = Class.forName("java.lang.System");// c4代表System类型
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        // java中任何一个对象都有一个方法：getClass()
        String s = "abc";
        Class x = s.getClass();// x代表String.class字节码文件，x代表String类型
        System.out.println(c1 == x);// true(==判断的是对象的内存地址。)

        Date time = new Date();
        Class y = time.getClass();// getClass()方法是Object（老祖宗）类中的方法
        System.out.println(c2 == y);// true(c2和y两个变量中保存的内存地址都是一样的，都指向方法去中的字节码文件。)

        // 第三种方式，java语言中任何一种类型，包括基本数据类型，它都有.class属性。
        Class z = String.class;// z代表String类型
        Class k = Date.class;// k代表Date类型
        Class f = int.class;// f代表int类型
        Class e = double.class;// e代表double类型

        System.out.println(x == z);// true





    }

}
