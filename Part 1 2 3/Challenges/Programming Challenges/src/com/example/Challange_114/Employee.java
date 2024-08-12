package com.example.Challange_114;

public class Employee {
    private final String name;
    private final int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return STR."Employee{name='\{name}\{'\''}, salary=\{salary}\{'}'}";
    }
}
