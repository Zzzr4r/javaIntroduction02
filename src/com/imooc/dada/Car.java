package com.imooc.dada;

/**
 * 课后习题：答答租车系统
 */
public class Car {
    private String number;
    private String name;
    private double price;
    private int peopleCapacity;
    private int goodsCapacity;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPeopleCapacity() {
        return peopleCapacity;
    }

    public void setPeopleCapacity(int peopleCapacity) {
        this.peopleCapacity = peopleCapacity;
    }

    public int getGoodsCapacity() {
        return goodsCapacity;
    }

    public void setGoodsCapacity(int goodsCapacity) {
        this.goodsCapacity = goodsCapacity;
    }

    public Car() {
    }

    public Car(String number, String name, double price, int peopleCapacity) {
        this.number = number;
        this.name = name;
        this.price = price;
        this.peopleCapacity = peopleCapacity;
    }

    public Car(String number, String name,  int goodsCapacity, double price) {
        this.number = number;
        this.name = name;
        this.goodsCapacity = goodsCapacity;
        this.price = price;
    }

    public Car(String number, String name, double price, int peopleCapacity, int goodsCapacity) {
        this.number = number;
        this.name = name;
        this.price = price;
        this.peopleCapacity = peopleCapacity;
        this.goodsCapacity = goodsCapacity;
    }
    public static void main(String[] args) {
        String str1 = "1";
        String str2 = "1";
        System.out.println(str1 == str2); // 缓存区存放
        System.out.println(str1.equals(str2));
        System.out.println(new Car() == new Car());
        System.out.println(new Car().equals(new Car()));
    }
}
