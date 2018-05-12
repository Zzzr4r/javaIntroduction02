package com.imooc.dada;

import java.util.Scanner;

/**
 * 测试答答租车系统
 */
public class RentCar {
    public static void main(String[] args) {
        System.out.println("请选择是否要租车？1代表是，0代表否:");
        Scanner input = new Scanner(System.in);
        int nextInt = input.nextInt();

        // 存储表头信息
        String[] heads = {"序号    ", "汽车名    ", "价格（每天）    ", "容量（人、货）"};
        // 存储表中每行数据（car对象）
        Car[] cars = new Car[6];
        cars[0] = new Car("1", "奥迪A4", 500.00, 4);
        cars[1] = new Car("2", "马自达6", 400.00, 4);
        cars[2] = new Car("3", "皮卡雪6", 450.00, 4, 20);
        cars[3] = new Car("4", "金龙", 800.00, 20);
        cars[4] = new Car("5", "松花江", 4, 400.00);
        cars[5] = new Car("6", "奥迪A4", 20, 1000.00);
        if (nextInt == 1) {
            System.out.println("您可租车的类型及价目表：");
            for (int i = 0; i < heads.length; i++) {
                System.out.print(heads[i]);
            }
            System.out.println();
            for (int i = 0; i < cars.length; i++) {
                Car car = cars[i];
                if (car.getPeopleCapacity() != 0 && car.getGoodsCapacity() != 0) {
                    System.out.print(car.getNumber() + "    " + car.getName() + "   " + car.getPrice() + "元/天" + "    "
                            + "载人：" + car.getPeopleCapacity() + "人，载货：" + car.getGoodsCapacity() + "吨");

                } else if (car.getPeopleCapacity() != 0 && car.getGoodsCapacity() == 0) {
                    System.out.print(car.getNumber() + "    " + car.getName() + "   " + car.getPrice() + "元/天" + "    "
                            + "载人：" + car.getPeopleCapacity() + "人");

                } else {
                    System.out.print(car.getNumber() + "    " + car.getName() + "   " + car.getPrice() + "元/天" + "    "
                            + "载物：" + car.getGoodsCapacity() + "吨");

                }
                System.out.println();
            }
            System.out.println("请输入您要租车的数量：");
            int rentNum = input.nextInt();
//            System.out.println(nextInt2);

            // 定义一个数组，存储客户选择租用的汽车信息
            Car[] rentCars = new Car[rentNum];
            for (int i = 0; i < rentNum; i++) {
                System.out.println("请输入第" + (i + 1) + "辆车的序号：");
                // 将输入的汽车序号由整数型转化为字符串类型
                String carNo = "" + input.nextInt();
                // 将输入的汽车序号与存放汽车数组的汽车序号比较，若序号相同，则将汽车信息放入租用汽车数组中
                for (int j = 0; j < cars.length; j++) {
                    if (carNo.equals(cars[j].getNumber())) {
                        rentCars[i] = cars[j];
                        break;
                    }
                }
            }

            System.out.println("请输入租车的天数：");
            int rentDays = input.nextInt();
            System.out.println("您的账单：");
            // 可载人的车：
            System.out.println("***可载人的车有：");
            int peopleSum = 0;
            for (int i = 0; i < rentCars.length; i++) {
                Car currentCar = rentCars[i];
                if (currentCar.getPeopleCapacity() != 0) {
                    peopleSum += currentCar.getPeopleCapacity();
                    System.out.print(currentCar.getName() + "   ");
                }
            }
            System.out.print("共载人：" + peopleSum + "人");
            System.out.println();

            // 可载货的车：
            System.out.println("***可载货的车有：");
            int goodsSum = 0;
            for (int i = 0; i < rentCars.length; i++) {
                Car currentCar = rentCars[i];
                if (currentCar.getGoodsCapacity() != 0) {
                    goodsSum += currentCar.getGoodsCapacity();
                    System.out.print(currentCar.getName() + "    ");
                }
            }
            System.out.print("共载货：" + goodsSum + "吨");
            System.out.println();

            // 计算租车总价
            double priceSum = 0;
            for (int i = 0; i < rentCars.length; i++) {
                priceSum += rentCars[i].getPrice();
            }
            priceSum = priceSum * rentDays;
            System.out.println("***租车总价格：" + priceSum + "元");
        } else {
            System.out.println("欢迎下次光临答答租车！");
        }
    }
}
