/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import operations.Operations;

/**
 *
 * @author miguel
 */
public class TestOperations {
    public static void main(String[] args) {
        var result = Operations.add(12, 3);
        System.out.println("result = " + result);
        
        var result1 = Operations.add(12d, 11);
        System.out.println("result1 = " + result1);
        
    }
}
