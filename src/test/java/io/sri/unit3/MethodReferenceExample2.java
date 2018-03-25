package io.sri.unit3;

import io.sri.unit1.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReferenceExample2 {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Sri", "Selvaraj", 23),
                new Person("Nitin", "Sridharan", 2),
                new Person("Srinithi", "Sridharan", 5),
                new Person("Ramya", "Kayaliann", 31),
                new Person("Indirani", "Selvaraj", 55)

        );

        // create a method that prints all elements in the list
        System.out.println("Print All person : ");
        performCondtionally(people,p -> true,System.out::println); // p -> method(p)


    }

    private static void performCondtionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {

        for(Person p: people)
        {
            if(predicate.test(p))
                consumer.accept(p);
        }
    }


}

