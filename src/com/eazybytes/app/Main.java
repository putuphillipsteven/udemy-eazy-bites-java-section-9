package com.eazybytes.app;


import com.eazybytes.model.Employee;
import com.eazybytes.model.Person;

public class Main {

    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(100);
        person.setFirstName("John");
        person.setLastName("Doe");
        person.setSalary(10000.00);

        System.out.println("AGE: " + person.getAge());
        System.out.println("FIRST NAME: " + person.getFirstName());
        System.out.println("LAST NAME: " + person.getLastName());
        System.out.println("SALARY: " + person.getSalary());
    }
}
