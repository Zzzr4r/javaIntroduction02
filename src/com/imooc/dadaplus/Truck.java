package com.imooc.dadaplus;

/**
 * 卡车（子类）：载货属性，覆写information()
 */
public class Truck extends Car {
    // 载货吨数
    private int cargoCapacity;

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public Truck(int id, String name, int rent, int cargoCapacity) {
        this.id = id;
        this.name = name;
        this.rent = rent;
        this.cargoCapacity = cargoCapacity;
    }

    public Truck() {
    }
    // 载货信息
    @Override
    public void information() {
        System.out.println(id + ".\t\t" + name + "\t\t" + rent + "元/天\t\t载货：" + cargoCapacity + "吨");
    }
}
