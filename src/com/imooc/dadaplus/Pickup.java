package com.imooc.dadaplus;

/**
 * 皮卡（子类）：载人，载货属性，覆写information()
 */
public class Pickup extends Car{
    // 载人
    private int peopleCapacity;
    // 载货
    private int cargoCapacity;

    public int getPeopleCapacity() {
        return peopleCapacity;
    }

    public void setPeopleCapacity(int peopleCapacity) {
        this.peopleCapacity = peopleCapacity;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public Pickup(int id, String name, int rent, int peopleCapacity, int cargoCapacity) {
        this.id = id;
        this.name = name;
        this.rent = rent;
        this.peopleCapacity = peopleCapacity;
        this.cargoCapacity = cargoCapacity;
    }

    public Pickup() {
    }
    // 载人，载货信息
    @Override
    public void information() {
        System.out.println(id + ".\t\t" + name + "\t\t" + rent + "元/天\t\t载人：" + peopleCapacity + "人，载货：" + cargoCapacity + "吨");
    }
}
