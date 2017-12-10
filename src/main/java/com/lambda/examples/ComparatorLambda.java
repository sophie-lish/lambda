package com.lambda.examples;

import com.lambda.domain.Person;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author sophie-lish
 */
public class ComparatorLambda {

    public static void main(String[] args) {

        List<Person> personList = Person.createShortList();

        //sort SurName by asc with inner class
        Collections.sort(personList, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getSurName().compareTo(o2.getSurName());
            }
        });

        System.out.println("=== Sorted Asc SurName using inner class ===");
        for(Person p:personList){
            p.printName();
        }

        // Use Lambda instead
        //sore SurName by asc
        Collections.sort(personList, (p1, p2) -> p1.getSurName().compareTo(p2.getSurName()));

        System.out.println("=== Sorted Asc SurName using lambda instead ===");
        personList.forEach(person -> {
            person.printName();
        });

        //sore SurName by desc
        Collections.sort(personList, (p1, p2) -> p2.getSurName().compareTo(p1.getSurName()));

        System.out.println("=== Sorted Desc SurName using lambda instead ===");
        personList.forEach(person -> {
            person.printName();
        });
    }
}
