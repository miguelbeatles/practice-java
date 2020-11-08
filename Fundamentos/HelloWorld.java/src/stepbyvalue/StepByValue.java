/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stepbyvalue;

/**
 *
 * @author miguel
 */
public class StepByValue {
    public static void main(String[] args) {
        var x =10;
        System.out.println("x = " + x);
        
        changeValue(x);
    }
    
    public static void changeValue(int arg1){
        System.out.println("arg1 = " + arg1);
        
    }
}
