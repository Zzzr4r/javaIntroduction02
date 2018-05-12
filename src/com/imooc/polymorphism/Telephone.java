package com.imooc.polymorphism;

/**
 * 电话类
 */
public abstract class Telephone {
    public void call(){
        System.out.println("具有打电话的功能");
    }
    public void message(){
        System.out.println("具有发短信的功能");
    }
}
