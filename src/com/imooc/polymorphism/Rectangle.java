package com.imooc.polymorphism;

/**
 * 长方形
 */
public class Rectangle extends Shape {
    private double length;
    private double height;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double perimeter() {
        return (this.height + this.length) * 2;
    }

    @Override
    public double area() {
        return this.length * this.height;
    }
}
