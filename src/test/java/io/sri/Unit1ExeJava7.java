package io.sri;

import javafx.print.Collation;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExeJava7 {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Sri", "Selvaraj", 23),
                new Person("Nitin", "Sridharan", 2),
                new Person("Srinithi", "Sridharan", 5),
                new Person("Ramya", "Kayaliann", 31),
                new Person("Indirani", "Selvaraj", 55)

        );

        //sort list by last name
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });

        // create a method that prints all elements in the list
        System.out.println("Print All person : ");
        printAll(people);

        // create a method that prints all people that have last name beginning with K
        System.out.println("Print all people that have last name beginning with K");
        printConditionally(people, new Condition() {
            @Override
            public boolean test(Person p) {
                return p.getLastName().startsWith("K");
            }
        });

        // create a method that prints all people that have first name beginning with I
        System.out.println("Print all people that have first name beginning with I");
        printConditionally(people, new Condition() {
            @Override
            public boolean test(Person p) {
                return p.getFirstName().startsWith("I");
            }
        });

    }

    private static void printConditionally(List<Person> people,Condition condition) {

        for(Person p: people)
        {
            if(condition.test(p))
            System.out.println(p);
        }
    }

    private static void printAll(List<Person> people) {

        for(Person p: people)
        {
            System.out.println(p);
        }
        System.out.println("==============================");
    }
}

interface Condition{
    boolean test(Person p);
}