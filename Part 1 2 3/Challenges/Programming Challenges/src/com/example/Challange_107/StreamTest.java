package com.example.Challange_107;

import java.util.List;

public class StreamTest {
    public static void main(String[] args) {
        List<String> name = List.of("Mainul","Hasan","Learning Java");

        name.stream().forEach(names -> System.out.println(names));
    }
}
