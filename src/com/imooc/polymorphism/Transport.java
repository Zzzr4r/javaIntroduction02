package com.imooc.polymorphism;

/**
 * 多态实例：
 *  交通工具Transport：
 *      1. Bus：在陆地上可以装载40人；
 *      2. Boat：在海上可以装载200人；
 *      3. Plane：在空中可以装载300人。
 */
public class Transport {
    private int number;
    public void move(){
        System.out.println("交通工具可以移动");
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
