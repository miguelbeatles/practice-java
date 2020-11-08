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
public class ArrangementsObjectTest {

    public static void main(String[] args) {
        Person persons[] = new Person[2];
        persons[0] = new Person("Miguel");
        persons[1] = new Person("Marha");

        System.out.println(" 0 " + persons[0]);
        System.out.println(" 1 " + persons[1]);

        for (int i = 0; i < persons.length; i++) {
            System.out.println("Persons = " + persons[i]);
        }
        
        
    }
}
