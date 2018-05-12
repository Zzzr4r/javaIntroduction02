package com.imooc.polymorphism;

/**
 * 测试类与接口
 */
public class Test3 {
    public static void main(String[] args) {
        IPlayGame smartPhone = new SmartPhone();
        smartPhone.playGame();

        IPlayGame gameMachine = new GameMachine();
        gameMachine.playGame();

        // java8提供的lambda表达式
        IPlayGame ip1 = () -> System.out.println("具有玩游戏的功能");
        ip1.playGame();
        // 匿名内部类方式一
        IPlayGame ip2 = new IPlayGame() {
            @Override
            public void playGame() {
                System.out.println("使用内部类的方式实现接口方式一");
            }
        };
        ip2.playGame();
        // 匿名内部类方式二
        new IPlayGame() {
            @Override
            public void playGame() {
                System.out.println("使用内部类的方式实现接口方式二");
            }
        }.playGame();
    }
}
