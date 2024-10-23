package com.eazybytes.app;


import com.eazybytes.model.Employee;
import com.eazybytes.model.Person;

public class Main {

    public static void main(String[] args) {
        Employee employee = new Employee();

        MyOuterClass.MyInnerClass myInnerClass = new MyOuterClass.MyInnerClass();
        myInnerClass.display();

        AccessModifiersDemo accessModifiersDemo = new AccessModifiersDemo();
        System.out.println(accessModifiersDemo.defaultVariable);
        System.out.println(accessModifiersDemo.publicVariable);
        System.out.println(accessModifiersDemo.protectedVariable);

        Person person = new Person();
        person.age = 10;
        person.firstName = "John";
        person.lastName = "Doe";
        person.salary = 10000.00;
        System.out.println(person.age);
        System.out.println(person.firstName);
        System.out.println(person.lastName);
        System.out.println(person.salary);
    }
}
