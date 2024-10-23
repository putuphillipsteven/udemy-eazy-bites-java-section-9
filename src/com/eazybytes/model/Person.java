package com.eazybytes.model;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;


    public String getLastName() {
        if(lastName == null) {
            return "Unknown";
        } else {
            return lastName;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 100) {
            throw new RuntimeException("Invalid age details sent");
        } else {
            this.age = age;
        }
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
