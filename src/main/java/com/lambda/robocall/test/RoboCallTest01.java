package com.lambda.robocall.test;

import com.lambda.domain.Person;
import com.lambda.robocall.action.RoboContactMethods;

import java.util.List;

/**
 * @author sophie-lish
 */
public class RoboCallTest01 {

    public static void main(String[] args) {

        List<Person> pl = Person.createShortList();
        RoboContactMethods robo = new RoboContactMethods();

        System.out.println("\n==== Test 01 ====");
        System.out.println("\n=== Calling all Drivers ===");
        robo.callDrivers(pl);

        System.out.println("\n=== Emailing all Draftees ===");
        robo.emailDraftees(pl);

        System.out.println("\n=== Mail all Pilots ===");
        robo.mailPilots(pl);

    }
}
