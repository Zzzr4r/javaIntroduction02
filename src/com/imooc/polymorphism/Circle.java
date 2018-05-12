package com.imooc.polymorphism;

/**
 * 圆形
 */
public class Circle extends Shape {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public double area() {
        return Math.PI * this.radius * this.radius;
    }
}
