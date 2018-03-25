package io.sri.unit3;

import io.sri.unit1.Person;

import java.util.Arrays;
import java.util.List;

public class CollectionIterationExample {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Sri", "Selvaraj", 23),
                new Person("Nitin", "Sridharan", 2),
                new Person("Srinithi", "Sridharan", 5),
                new Person("Ramya", "Kayaliann", 31),
                new Person("Indirani", "Selvaraj", 55)

        );

        System.out.println("Using for loop");
        for(int i=0;i<people.size();i++)
        {
            System.out.println(people.get(i));
        }
        System.out.println("Using forEach loop");
        for(Person p: people)
        {
            System.out.println(p);
        }
        // Java8 way of looping element
        System.out.println("Using lambda for each loop");
        // people.forEach(p-> System.out.println(p));
        people.forEach(System.out::println);
    }

}
