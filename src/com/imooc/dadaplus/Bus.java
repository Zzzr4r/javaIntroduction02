package com.imooc.dadaplus;

/**
 * 汽车（子类）：载人属性，覆写information()
 */
public class Bus extends Car{
    // 载人量
    private int peopleCapacity;

    public int getPeopleCapacity() {
        return peopleCapacity;
    }

    public void setPeopleCapacity(int peopleCapacity) {
        this.peopleCapacity = peopleCapacity;
    }

    public Bus(int id, String name, int rent, int peopleCapacity, int days) {
        this.id = id;
        this.name = name;
        this.rent = rent;
        this.peopleCapacity = peopleCapacity;
        this.days = days;
    }
    public Bus(int id, String name, int rent, int peopleCapacity) {
            this.id = id;
            this.name = name;
            this.rent = rent;
            this.peopleCapacity = peopleCapacity;
        }

    public Bus() {
    }
    // 载人信息
    @Override
    public void information() {
        System.out.println(id + ".\t\t" + name + "\t\t" + rent + "元/天\t\t载人：" + peopleCapacity + "人");
    }
}
