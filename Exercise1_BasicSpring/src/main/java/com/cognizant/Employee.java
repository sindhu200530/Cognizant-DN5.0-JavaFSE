package com.cognizant;

public class Employee {

    private String name;
    private Address address;
    private Department department;

    // Constructor Injection
    public Employee(String name) {
        this.name = name;
        System.out.println("Employee Bean Created using Constructor Injection");
    }

    // Setter Injection
    public void setAddress(Address address) {
        this.address = address;
    }

    // Setter Injection
    public void setDepartment(Department department) {
        this.department = department;
    }

    public void display() {
        System.out.println("Employee Name : " + name);
        System.out.println("City : " + address.getCity());
        System.out.println("Department : " + department.getDepartmentName());
    }
}