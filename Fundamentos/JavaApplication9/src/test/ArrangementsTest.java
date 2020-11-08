/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author miguel
 */
public class ArrangementsTest {

    public static void main(String[] args) {
        int ages[] = new int[3];
        System.out.println("ages = " + ages);

        ages[0] = 10;
        System.out.println("ages 0 =" + ages[0]);

        for (int i = 0; i < ages.length; i++) {
            System.out.println("age " + i + " = " + ages[i]);
        }

    }
}
