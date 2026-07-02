package com.cognizant;

public class Employee {

    private String name;

    public Employee() {
        System.out.println("Employee Bean Created");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Employee Name : " + name);
    }
}
