package com.example.Challange_87;

import java.util.Scanner;

public class Claculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to calculator \n");
        System.out.print("Enter the first number : ");
        int first = input.nextInt();
        System.out.print("Now , The second : ");
        int second = input.nextInt();

        try {
            int reslut = first / second;
            System.out.printf("Result is %d",reslut);
        }catch(ArithmeticException exception)   {
            if(exception.getMessage().equals("/ by zero"))  {
                System.out.println("Devided by zero occurred");
            }else {
                throw exception;
            }
        }
    }
}
