package com.example.Challange_83;

public class Circle extends Shape {

    public final double radiusInCm;

    public Circle(double radius) {
        this.radiusInCm = radius;
    }

    public double getRadiusInCm() {
        return radiusInCm;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radiusInCm ,2);
    }
}
