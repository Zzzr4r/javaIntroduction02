package com.imooc.polymorphism;

/**
 * Plane：在空中可以装载300人。
 */
public class Plane extends Transport {

    @Override
    public void move() {
        System.out.println("飞机可以在天空中飞翔");
    }
}
