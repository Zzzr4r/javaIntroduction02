package com.imooc.polymorphism;

/**
 * 中国人
 */
public class Chinese extends APerson{
    @Override
    public void say() {
        System.out.println("中国人说中文");
    }
}
