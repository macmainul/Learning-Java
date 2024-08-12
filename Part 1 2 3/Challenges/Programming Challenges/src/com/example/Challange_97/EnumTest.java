package com.example.Challange_97;

public class EnumTest {
    public static void main(String[] args) {
        System.out.println("Printing week day & weekend day :");
        for (Day day : Day.values()) {
            System.out.printf("%s : %s\n",day, day.getType());
        }
    }
}

