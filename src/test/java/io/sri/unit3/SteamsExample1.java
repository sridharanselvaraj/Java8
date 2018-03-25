package io.sri.unit3;

import io.sri.unit1.Person;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SteamsExample1 {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Sri", "Selvaraj", 23),
                new Person("Nitin", "Sridharan", 2),
                new Person("Srinithi", "Sridharan", 5),
                new Person("Ramya", "Kayaliann", 31),
                new Person("Indirani", "Selvaraj", 55)

        );


//      people.stream()
//              .filter(person -> person.getLastName().startsWith("K"))
//              .forEach(person -> System.out.println(person.getFirstName()));

       long count= people.parallelStream()
            .filter(person -> person.getFirstName().startsWith("S"))
            .count();
        System.out.println(count);


    }

}
