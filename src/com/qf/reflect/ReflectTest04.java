package com.qf.reflect;

/**
 * 研究一下：Class.forName()发生了什么？
 *      记住，重点：
 *          如果你只希望一个类的静态代码块执行，其他代码一律不执行。
 *          你可以使用：
 *              Class.forName("完整类名");
 *          这个方法的执行会导致类加载类加载是，静态代码块执行。
 */
public class ReflectTest04 {
    public static void main(String[] args) {
        try {
            // Class.forName()这个方法的执行会导致：类加载。
            Class.forName("com.qf.reflect.MyClass");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}

