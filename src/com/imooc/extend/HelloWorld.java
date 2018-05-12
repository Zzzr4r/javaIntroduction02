package com.imooc.extend;

/**
 * 继承
 */
public class HelloWorld {
    // final修饰的属性必须自己赋予初始化值，且这个值不允许被修改
    private static String name;
    private static final String name1 = null;

    public static void main(String[] args) {
        System.out.println("name: " + name);
        System.out.println("name1: " + name1);
    }
}
