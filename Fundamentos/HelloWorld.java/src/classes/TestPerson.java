/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author miguel
 */
public class TestPerson {

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Miguel";
        person1.lastName = "Mejia";
        person1.showInformation();
        
        Person person2 = new Person();
        person2.name = "Martha";
        person2.lastName = "Mejia";
        person2.showInformation();
    }
}
