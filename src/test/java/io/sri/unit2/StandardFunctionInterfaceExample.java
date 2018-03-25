package io.sri.unit2;

import io.sri.unit1.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class StandardFunctionInterfaceExample {

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
        performCondtionally(people,p -> true,p -> System.out.println(p));

        // create a method that prints all people that have last name beginning with K
        System.out.println("Print all people that have last name beginning with K");
        performCondtionally(people, p -> p.getLastName().startsWith("K"),p -> System.out.println(p));

        // create a method that prints all people that have first name beginning with I
        System.out.println("Print all people that have first name beginning with I");
        performCondtionally(people,p -> p.getFirstName().startsWith("I"),p -> System.out.println(p.getFirstName()));

    }

    private static void performCondtionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {

        for(Person p: people)
        {
            if(predicate.test(p))
                consumer.accept(p);
        }
    }


}

