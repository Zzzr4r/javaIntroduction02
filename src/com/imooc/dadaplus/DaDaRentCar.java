package com.imooc.dadaplus;

import java.util.*;

/**
 * 答答租车系统
 */
public class DaDaRentCar {
    public static void main(String[] args) {
        // 循环，直到return退出方法
        while (true) {
            // 数组存放系统中车辆信息
            Car[] cars = {new Bus(1, "奔驰", 1800, 5)
                            , new Bus(2, "宝马", 2400, 5)
                            , new Bus(3, "金龙", 1200, 20)
                            , new Truck(4, "标志", 1500, 20)
                            , new Truck(5, "东风", 1100, 12)
                            , new Pickup(6, "瑞奇", 1000, 4, 6)};
            // 向控制台输入值
            Scanner input = new Scanner(System.in);
            System.out.println("欢迎来到答答租车，我是智能机器人小答，很高兴为您服务：租车请按1，退出请按0:");
            // 获取到输入的值
//            int confirm1 = input.nextInt(); // 当输入非整数时，抛出：Exception in thread "main" java.util.InputMismatchException
            String confirm1 = input.next();
            if ("1".equals(confirm1)) {
                System.out.println("尊敬的客户您好，下面是有效的车辆信息，请查阅：\n");
                // 输出列表的头信息
                System.out.println("序号\t\t汽车名\t租金\t\t\t\t容量");
                for (Car car : cars) {
                    if (car instanceof Bus) { // 载人车辆调用载人信息
                        Bus bus = (Bus)car;
                        bus.information();
                    } else if (car instanceof Truck) { // 载货车辆调用载货信息
                        Truck truck = (Truck) car;
                        truck.information();
                    } else if (car instanceof Pickup){ // 载人，载货车辆调用载人，载货信息
                        Pickup pickup = (Pickup)car;
                        pickup.information();
                    } else {
                        System.out.println("车辆录入信息有误，即将自动退出系统");
                        return;
                    }
                }
                // 定义租车总金额初始值
                int rentSum = 0;

                // 存放租车信息
                Map<Car, Integer> map = new HashMap<>();

                Set<Map.Entry<Car, Integer>> entries = map.entrySet();
                // 开始租车
                while (true) {

                    System.out.println("请选择您租车的序号，序号值范围：1——" + cars.length);
                    String carId = input.next();
                    try {
                        int realCarId = Integer.parseInt(carId);
                        if (realCarId < 1 || realCarId > cars.length) {
                            System.out.println("对不起，您输入的序号值不在规定范围内，请检查后，重新输入！");
                        } else {

                            for (Car car : cars) { // 找到所选择的车辆信息
                                if (car.id == realCarId) {
                                    System.out.println("您当前所选择的租车信息如下：");
                                    // 定义租用每辆车的初始值
                                    int rent = 0;
                                    if (car instanceof Bus) { // 载人车辆调用载人信息
                                        Bus bus = (Bus)car;
                                        bus.information();
                                        rent = bus.rent;
                                    } else if (car instanceof Truck) { // 载货车辆调用载货信息
                                        Truck truck = (Truck) car;
                                        truck.information();
                                        rent = truck.rent;
                                    } else if (car instanceof Pickup){ // 载人，载货车辆调用载人，载货信息
                                        Pickup pickup = (Pickup)car;
                                        pickup.information();
                                        rent = pickup.rent;
                                    }
                                    System.out.println("确认租车，请按1，退出请按0：");
                                    int confirm2 = input.nextInt();
                                    if (confirm2 == 1) {
                                        // 选择租车数量
                                        System.out.println("请选择租车数量：");
                                        int rentNum = input.nextInt();

                                        // 将租用车和数量存入map中
                                        map.put(car, rentNum);

                                        entries.add((Map.Entry<Car, Integer>) map);
                                        // 选择租车天数
                                        System.out.println("请选择租车天数：");
                                        int rentDays = input.nextInt();
                                        int rentCar = rent * rentNum * rentDays;
                                        rentSum += rentCar ; // 第一次租车总金额

                                        // 是否选择继续租车
                                        System.out.println("继续租车，请按1，退出系统，请按0：");
                                        int confirm4 = input.nextInt();
                                        if (confirm4 == 1) {
                                            continue; // 退出循环，重新输入租车序号
                                        } else if (confirm4 == 0){
                                            // 退出系统前，输出租车详情单
                                            System.out.println("您的租车账单为：");
                                            // 通过迭代器循环迭代entries中的map
                                            if (entries != null) {
                                                Iterator<Map.Entry<Car, Integer>> iterator = entries.iterator();
                                                // 租车总数量
                                                int carNum = 0;

                                                // 总载客量
                                                int peopleCapacity = 0;

                                                // 总载货量
                                                int cargoCapacity = 0;

                                                while (iterator.hasNext()) {
                                                    Car currentCar = iterator.next().getKey();
                                                    Integer count = iterator.next().getValue();
                                                    carNum += count; // 计算租车总数量
                                                    if (currentCar instanceof Bus) { // 载人车辆调用载人信息
                                                        Bus bus = (Bus)currentCar;
                                                        peopleCapacity += bus.getPeopleCapacity();
                                                        System.out.println(bus.id + ".\t\t" + bus.name + "\t\t" + bus.rent + "元/天\t\t载人：" + bus.getPeopleCapacity() + "人\t\t" + count);
                                                    } else if (currentCar instanceof Truck) { // 载货车辆调用载货信息
                                                        Truck truck = (Truck) currentCar;
                                                        cargoCapacity += truck.getCargoCapacity();
                                                        System.out.println(truck.id + ".\t\t" + truck.name + "\t\t" + truck.rent + "元/天\t\t载货：" + truck.getCargoCapacity() + "吨\t\t" + count);

                                                    } else if (currentCar instanceof Pickup){ // 载人，载货车辆调用载人，载货信息
                                                        Pickup pickup = (Pickup)currentCar;
                                                        peopleCapacity += pickup.getPeopleCapacity();
                                                        cargoCapacity += pickup.getCargoCapacity();
                                                        System.out.println(pickup.id + ".\t\t" + pickup.name + "\t\t" + pickup.rent + "元/天\t\t载人：" + pickup.getPeopleCapacity() + "人，载货：" + pickup.getCargoCapacity() + "吨\t\t" + count);
                                                    }
                                                }

                                                // 输出租车总数量
                                                System.out.println("您租车的总数量是：" + carNum + "辆");

                                                // 输出载客总人数
                                                System.out.println("您租车的总载客人数是：" + peopleCapacity + "人");

                                                // 输出载货总吨数
                                                System.out.println("您租车的总载货吨数是：" + cargoCapacity + "吨");

                                                // 输出租车总金额
                                                System.out.println("您租车的总金额是：" + rentSum + "元");

                                                // 结束语
                                                System.out.println("很高兴为您服务，期待您的下次光临，祝你旅途愉快，一路顺风！");

                                            }
                                            return;
                                        }
                                    } else {
                                        continue; // 跳过本次循环，重新输入租车序号
                                    }

                                } else {
                                    System.out.println("对不起，没有找到您所选择的车辆序号，请重新选择！");
                                    continue;
                                }
                            }
                        }
                    } catch (NumberFormatException e) {
                        e.printStackTrace();
                        System.out.println("对不起，您输入的序号值不是整数类型，请检查后，重新输入！");
                    }
                }

            } else if ("0".equals(confirm1)){
                System.out.println("很高兴为您服务，期待下次光临，再见！");
                return;
            } else {
                System.out.println("对不起，您输入的值有误，请重新输入1：租车，0：退出，即将返回到欢迎页面！");
            }
        }
    }
}
