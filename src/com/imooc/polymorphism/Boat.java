package com.imooc.polymorphism;

/**
 * Boat：在海上可以装载200人；
 */
public class Boat extends Transport{

    @Override
    public void move() {
        System.out.println("轮船可以在海上游");
    }
}
