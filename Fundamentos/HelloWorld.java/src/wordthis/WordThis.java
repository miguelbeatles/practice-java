/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordthis;

/**
 *
 * @author miguel
 */
public class WordThis {

    public static void main(String[] args) {
        Person person = new Person("Miguel", "Mejia");
        System.out.println("person = " + person);
        System.out.println("name = " + person.name);
        System.out.println("lastName = " + person.lastName);
    }
}

class Person {

    String name;
    String lastName;

    Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
        System.out.println("Object Person " + this);
        new Print().print(this);
    }
}

class Print {

    public void print(Person person) {
        System.out.println("person from Print= " + person);
        System.out.println("Print this from Print" + this);
    }
}
