package com.example.Challange_85;

public class Calculator {
    public int add(int a, int b)    {
        return a+b;
    }
    public int add(int a, int b,int c)    {
        return a+b+c;
    }
    public double add(double a,double b)    {
        return a+b;
    }

    public static void main(String[] args) {
        Calculator cl = new Calculator();
        System.out.println(cl.add(2,3));
        System.out.println(cl.add(23,4.5));
        System.out.println(cl.add(2,3,5));
    }


}
