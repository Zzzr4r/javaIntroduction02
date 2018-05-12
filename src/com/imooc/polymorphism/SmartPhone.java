package com.imooc.polymorphism;

/**
 * 智能手机类
 */
public class SmartPhone extends Telephone implements IPlayGame {
    @Override
    public void playGame() {
        System.out.println("智能手机具有了打游戏的功能");
    }
}
