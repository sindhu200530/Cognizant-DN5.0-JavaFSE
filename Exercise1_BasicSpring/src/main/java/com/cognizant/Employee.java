package com.cognizant;

public class Employee {

    private String name;
    private Address address;

    public Employee() {
        System.out.println("Employee Bean Created");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void display() {

        System.out.println("Employee Name : " + name);
        System.out.println("City : " + address.getCity());

    }
}