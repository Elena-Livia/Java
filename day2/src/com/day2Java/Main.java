package com.day2Java;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        Person p = new Person();
        Person p2 = new Person(1,"Livia","Nistor",29,"Romania");
        System.out.println(p.getFullName());

        String any = p2.getFullName();
        System.out.println(any);
        p.eat("apple");

        int[] array = {1,2,3,4};
        System.out.println(array[1]);
        array[1] = 5;
        System.out.println(array[1]);

        int[] array2 = new int[3];
        array2[2] = 6;
        System.out.println(array2[2]);
        System.out.println(array2[1]);

        Person[] persons = new Person[3];

        persons[0] = p;
        persons[1] = p2;
        persons[2] = new Person();

        System.out.println(persons[2].firstName);
    }

}
