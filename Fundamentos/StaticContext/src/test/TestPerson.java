/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import domain.Person;

/**
 *
 * @author miguel
 */
public class TestPerson {

    public static void main(String[] args) {
        Person person = new Person("Miguel");
        printPerson(person);
        Person person1 = new Person("Martha");
        printPerson(person1);
    }
    
    public static void printPerson(Person person) {
        System.out.println("person = " + person);
    }
}
