package io.sri;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExeJava8 {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Sri", "Selvaraj", 23),
                new Person("Nitin", "Sridharan", 2),
                new Person("Srinithi", "Sridharan", 5),
                new Person("Ramya", "Kayaliann", 31),
                new Person("Indirani", "Selvaraj", 55)

        );

        //sort list by last name
        Collections.sort(people,( p1, p2) ->p1.getLastName().compareTo(p2.getLastName()));

        // create a method that prints all elements in the list
        System.out.println("Print All person : ");
        printConditionally(people,p -> true);

        // create a method that prints all people that have last name beginning with K
        System.out.println("Print all people that have last name beginning with K");
        printConditionally(people, p -> p.getLastName().startsWith("K"));

        // create a method that prints all people that have first name beginning with I
        System.out.println("Print all people that have first name beginning with I");
        printConditionally(people,p -> p.getFirstName().startsWith("I"));

    }

    private static void printConditionally(List<Person> people,Condition condition) {

        for(Person p: people)
        {
            if(condition.test(p))
                System.out.println(p);
        }
    }


}

