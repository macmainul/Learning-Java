package com.example.Challange_108;

import java.util.List;

public class StringFilterAndConcatenated {
    public static void main(String[] args) {
        List<String>str = List.of("Mainul Hasan","is learning java"
                ,"bad","poor","from KG Coding");

        String result = str.stream()
                .filter(strs -> strs.length() > 10)
                .reduce("",(a,b) -> a+" "+b);

        System.out.println(result);
    }
}
