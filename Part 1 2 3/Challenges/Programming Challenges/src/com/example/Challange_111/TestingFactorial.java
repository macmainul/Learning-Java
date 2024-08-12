package com.example.Challange_111;

import java.util.stream.IntStream;

public class TestingFactorial {
    public static void main(String[] args) {
        System.out.println("Factorial using two ways");
        int number =9;
        //  OOP/Procedural way
        System.out.println(factorial(number));

        // functional programming way
        IntStream.rangeClosed(2,number)
                .reduce((a,b)-> a*b)
                .ifPresent(System.out::println);

    }

    public static int factorial(int num)    {
        if (num == 0 || num==1) {
            return 1;
        }
        int fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}
