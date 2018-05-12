package com.imooc.polymorphism;

/**
 * 游戏机类
 */
public class GameMachine implements IPlayGame{
    @Override
    public void playGame() {
        System.out.println("游戏机具有打游戏的功能");
    }
}
