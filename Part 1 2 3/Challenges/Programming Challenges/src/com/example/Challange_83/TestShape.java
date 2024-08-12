package com.example.Challange_83;

public class TestShape {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Square square = new Square(10.3);

        System.out.printf("Area fo circle is : %5.2f \n",circle.calculateArea());
        System.out.printf("Area fo square is : %5.2f ",square.calculateArea());

    }
}
