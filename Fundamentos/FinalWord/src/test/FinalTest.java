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
public class FinalTest {

    public static void main(String[] args) {
        final int myVariable = 10;
        System.out.println("myVariable = " + myVariable);
        System.out.println("myConstant = " + Person.MY_CONSTANT);

        final Person person = new Person();
//        person =new Person();

        person.setName("Miguel");
        System.out.println("person = " + person.getName());
    }

}
