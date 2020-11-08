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
        Person person1 = new Person("Miguel", 24000.00, false);
        person1.setName("Miguel Mejia");
        System.out.println("name with change: " + person1.getName());
        System.out.println("print toString Person1: " + person1);
    }
}
