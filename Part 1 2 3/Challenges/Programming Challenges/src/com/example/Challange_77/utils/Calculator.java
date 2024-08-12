package com.example.Challange_77.utils;

import com.example.Challange_77.geometry.Circle;
import com.example.Challange_77.geometry.Rectangle;

public class Calculator {
    public static void main(String[] args) {
        Circle circle  = new Circle(5.5);
        Rectangle rec = new Rectangle(32, 11);

        double  circleArea = Math.pow(circle.radius,2) * Math.PI;
        double recArea = rec.breadth * rec.length;

        System.out.println("Area of circle is : "+circleArea+ " And Area of rectangle is " + recArea);
    }

}
