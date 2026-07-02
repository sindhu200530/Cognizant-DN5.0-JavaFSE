package com.cognizant;

public class Employee {

    private String name;
    private Address address;
    private Department department;

    public Employee() {
        System.out.println("Employee Bean Created");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void display() {

        System.out.println("Employee Name : " + name);
        System.out.println("City : " + address.getCity());
        System.out.println("Department : " + department.getDepartmentName());

    }
}