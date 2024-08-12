package com.example.Challange_114;

import java.util.List;

public class TestingSorting {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Mainul", 3300),
                new Employee("Hasan", 390),
                new Employee("Joy", 1220),
                new Employee("Taskin", 20),
                new Employee("Aminul", 300)
              );
        employees.stream()
                .sorted((emp1,emp2) -> emp1.getSalary() - emp2.getSalary())
                .forEach(System.out::println);
    }
}
