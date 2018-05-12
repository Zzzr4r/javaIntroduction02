package com.imooc.polymorphism;

import java.text.DecimalFormat;

/**
 * 测试图形，长方形，圆形
 */
public class Test2 {
    public static void main(String[] args) {
        // 将浮点数类型转换为指定格式（如：两位小数）
        DecimalFormat df = new DecimalFormat("#.00");
        // 测试长方形的周长和面积
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(2.0);
        rectangle.setHeight(3.0);
        double perimeter1 = rectangle.perimeter();
        double area1 = rectangle.area();

        System.out.println("长方形的周长：" + df.format(perimeter1));
        System.out.println("长方形的面积：" + df.format(area1));

        // 测试圆形的周长和面积
        Circle circle = new Circle();
        circle.setRadius(10.0);
        double perimeter2 = circle.perimeter();
        double area2 = circle.area();
        System.out.println("圆形的周长：" + df.format(perimeter2));
        System.out.println("圆形的面积：" + df.format(area2));

    }
}
