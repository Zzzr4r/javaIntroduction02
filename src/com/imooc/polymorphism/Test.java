package com.imooc.polymorphism;

import sun.net.www.content.text.plain;

/**
 * 测试类
 */
public class Test {
    public static void main(String[] args) {
        Transport transport = new Transport();
        transport.move();
        System.out.println(transport.getNumber());
        Transport transport1 = new Bus();
        if (transport1 instanceof Bus) {
            Bus bus = (Bus) transport1;
            bus.move();
            bus.setNumber(40);
            System.out.println("bus可以装载" + bus.getNumber() + "人");
        }
        Transport transport2 = new Boat();
        if (transport2 instanceof Boat) {
            Boat boat = (Boat)transport2;
            boat.move();
            boat.setNumber(200);
            System.out.println("boat可以装载" + boat.getNumber() + "人");
        } else {
            System.out.println("此类型不能进行转换");
        }
        Transport transport3 = new Plane();
        if (transport1 instanceof Bus) {
            System.out.println("bus不能强制转换为plane");
        } else if (transport3 instanceof Plane){
            Plane plane = (Plane)transport3;
            plane.move();
            plane.setNumber(300);
            System.out.println("plain可以装载" + plane.getNumber() + "人");

        }
    }
}
