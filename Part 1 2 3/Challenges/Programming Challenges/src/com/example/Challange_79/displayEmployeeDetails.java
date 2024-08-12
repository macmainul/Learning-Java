package com.example.Challange_79;

public class displayEmployeeDetails {
    public static void main(String[] args) {
        Employee employee = new Employee("Mainul", 22, 60000.00);
        System.out.println(employee.getEmployeeDetails());
        employee.setName("Hasan");
        System.out.println(employee.getEmployeeDetails());
    }
}
