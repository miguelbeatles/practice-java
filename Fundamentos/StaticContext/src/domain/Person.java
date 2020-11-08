/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author miguel
 */
public class Person {

    private int idPerson;
    private String name;
    private static int personCount;

    public Person(String name) {
        this.name = name;
        Person.personCount++;
        this.idPerson = Person.personCount;

    }

    public int getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(int idPerson) {
        this.idPerson = idPerson;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getPersonCount() {
        return personCount;
    }

    public static void setPersonCount(int personCount) {
        Person.personCount = personCount;
    }

    @Override
    public String toString() {
        return "Person{" + "idPerson=" + idPerson + ", name=" + name + '}';
    }
    
    
}
