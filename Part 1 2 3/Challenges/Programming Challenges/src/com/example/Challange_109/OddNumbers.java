package com.example.Challange_109;

import com.example.Challange_80.LibraryItems;

import java.util.List;

public class OddNumbers {
    public static void main(String[] args) {
        List<Integer> num = List.of(1,2,3,4,5,6,7,8,9,10);
        num.stream()
                .filter(nums -> nums % 2 == 1)
                .forEach(nums -> System.out.println(nums));
    }
}

