package com.imooc.polymorphism;

/**
 * 测试各国人说话的语言
 */
public class Test4 {
    public static void main(String[] args) {
        APerson p1 = new Chinese();
        p1.say();

        APerson p2 = new American();
        p2.say();
    }
}
