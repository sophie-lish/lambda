package com.robocall.action;

import com.lambda.domain.Person;
import com.robocall.functional.MyTest;

import java.util.List;

/**
 * @author sophie-lish
 */
public class RoboContactAnon {

    public void phoneContacts(List<Person> pl, MyTest<Person> aTest){
        for(Person p:pl){
            if (aTest.test(p)){
                roboCall(p);
            }
        }
    }

    public void emailContacts(List<Person> pl, MyTest<Person> aTest){
        for(Person p:pl){
            if (aTest.test(p)){
                roboEmail(p);
            }
        }
    }

    public void mailContacts(List<Person> pl, MyTest<Person> aTest){
        for(Person p:pl){
            if (aTest.test(p)){
                roboMail(p);
            }
        }
    }

    public void roboCall(Person p){
        System.out.println("Calling " + p.getGivenName() + " " + p.getSurName() + " age " + p.getAge() + " at " + p.getPhone());
    }

    public void roboEmail(Person p){
        System.out.println("EMailing " + p.getGivenName() + " " + p.getSurName() + " age " + p.getAge() + " at " + p.getEMail());
    }

    public void roboMail(Person p){
        System.out.println("Mailing " + p.getGivenName() + " " + p.getSurName() + " age " + p.getAge() + " at " + p.getAddress());
    }
}
