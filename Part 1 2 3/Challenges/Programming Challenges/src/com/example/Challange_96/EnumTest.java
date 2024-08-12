package com.example.Challange_96;

import java.sql.SQLOutput;

public class EnumTest {
    public static void main(String[] args) {
        System.out.println("Days of the week using print : ");
        System.out.println(Day.SATURDAY);
        System.out.println(Day.SUNDAY);
        System.out.println(Day.MONDAY);
        System.out.println(Day.TUESDAY);
        System.out.println(Day.WEDNESDAY);
        System.out.println(Day.THRUSDAY);
        System.out.println(Day.FRIDAY);

        System.out.println();
        System.out.println("Days of the week using for each loop : ");
        for( Day day : Day.values()) {
            System.out.println(day);
        }

    }
}
