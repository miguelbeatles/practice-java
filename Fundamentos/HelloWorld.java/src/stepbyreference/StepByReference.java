/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stepbyreference;

import classes.Person;

/**
 *
 * @author miguel
 */
public class StepByReference {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Miguel";
        System.out.println("persona name: " + person1.name);
        changeValue(person1);
        System.out.println("persona name: " + person1.name);
    }
    
    public static void changeValue(Person person){
        person.name = "Bere";
    }
}
