package com.imooc.polymorphism;

/**
 * Bus类：在陆地上可以装载40人；
 */
public class Bus extends Transport{
    @Override
    public void move() {
        System.out.println("汽车可以在陆地上跑");
    }
}
