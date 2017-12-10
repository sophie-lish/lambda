package com.lambda.connections;

import com.lambda.domain.Person;

import java.util.List;

/**
 * @author sophie-lish
 * @create 2017 - 12 -10 17:11
 */
public class LambdaFilter {
    public static void main(String[] args) {

        List<Person> pl = Person.createShortList();

        SearchCriteria search = SearchCriteria.getInstance();

        System.out.println("\n=== Western Pilot Phone List ===");

        pl.stream().filter(search.getCriteria("allPilots"))
                .forEach(Person::printWesternName);


        System.out.println("\n=== Eastern Draftee Phone List ===");

        pl.stream().filter(search.getCriteria("allDraftees"))
                .forEach(Person::printEasternName);

    }
}
