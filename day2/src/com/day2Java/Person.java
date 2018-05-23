package com.day2Java;

public class Person {
    public int counter = 0;
    private String firstName = "Noor";
    String lastName = "Samir";
    int age = 20;
    String address = "Amman";


    public Person() {
        this.counter = 3;
        this.firstName = "Shatha";
        this.lastName = "Sukkar";
        this.age = 28;
        this.address = "Canada";

    }

    public Person(int counter, String firstName, String lastName, int age, String address) {
        this.counter = counter;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    public void eat(String food) {
        System.out.println("I am eating " + food);
    }

    public void setFirstName(String name) {
        this.firstName = name;
    }

    public String getFirstName() {
        return this.firstName;
    }

}
