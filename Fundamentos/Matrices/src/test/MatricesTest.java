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
public class MatricesTest {

    public static void main(String[] args) {
        int ages[][] = new int[3][2];
        System.out.println("ages = " + ages);
        ages[0][0] = 5;
        ages[0][1] = 5;
        ages[1][0] = 5;
        ages[1][1] = 5;

        System.out.println("ages = " + ages[0][0]);
        for (int ren = 0; ren < ages.length; ren++) {
            for (int col = 0; col < ages[ren].length; col++) {
                System.out.println("ages " + ren + " - " + col + ": " + ages[ren][col]);
            }
        }

        String fruits[][] = {{"Apple", "Banana"}, {"Strawberry", "Watermelon"}};
        print(fruits);

        Person persons[][] = new Person[2][3];
        print(persons);
    }

    public static void print(Object matriz[][]) {
        for (int ren = 0; ren < matriz.length; ren++) {
            for (int col = 0; col < matriz[ren].length; col++) {
                System.out.println("Object " + ren + " - " + col + ": " + matriz[ren][col]);
            }
        }
    }
}
