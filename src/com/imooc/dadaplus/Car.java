package com.imooc.dadaplus;

/**
 * 车辆父类（抽象类）：存储公共的属性和方法
 */
public abstract class Car {
    // 序号
    public int id;
    // 名称
    public String name;
    // 租金
    public int rent;
    // 天数
    public int days;

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    // 车辆信息
    public abstract void information();

}
