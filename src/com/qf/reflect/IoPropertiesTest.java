package com.qf.reflect;

import java.io.InputStream;
import java.util.Properties;

public class IoPropertiesTest {
    public static void main(String[] args) throws Exception{
        // 获取文件的绝对路径！！！
        /*String path = Thread.currentThread().getContextClassLoader()
                .getResource("classinfo.properties").getPath();

        FileReader reader = new FileReader(path);*/

        // 直接以流的形式返回。
        InputStream reader = Thread.currentThread().getContextClassLoader()
                .getResourceAsStream("classinfo.properties");
        // Properties是一个map集合
        Properties pro = new Properties();
        pro.load(reader);
        reader.close();
        // 通过key获取value
        String className = pro.getProperty("className");
        System.out.println(className);

    }
}
