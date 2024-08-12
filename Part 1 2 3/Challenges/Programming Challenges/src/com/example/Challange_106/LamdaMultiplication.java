package com.example.Challange_106;

import java.util.function.BinaryOperator;

public class LamdaMultiplication {
    public static void main(String[] args) {
       BinaryOperator<Integer> multiplication = (a,b) -> a * b;

       int result = multiplication.apply(5,2);
        System.out.println(result);
    }
}
