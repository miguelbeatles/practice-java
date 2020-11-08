/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operations;

/**
 *
 * @author miguel
 */
public class TestArithmetic {

    public static void main(String[] args) {
        // local variables
        var a = 10;
        var b = 2;

        Arithmetic arithmetic = new Arithmetic();
        System.out.println("arithmetic a: " + arithmetic.a);
        System.out.println("arithmetic b: " + arithmetic.b);

        Arithmetic arithmetic1 = new Arithmetic(11, 13);
        System.out.println("arithmetic1 a: " + arithmetic1.a);
        System.out.println("arithmetic1 b: " + arithmetic1.b);
    }
}
