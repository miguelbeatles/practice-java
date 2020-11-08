
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author miguel
 */
public class ConvertionType {
    public static void main(String args[]){
        //Convert String to Integer
        var age = Integer.parseInt("20");
        System.out.println("age = " + (age + 1));
        //Convert String to Double
        var valuePI = Double.parseDouble("3.1416");
        System.out.println("valuePI = " + valuePI);
        
        // Give me a value
        var console = new Scanner(System.in);
        System.out.println("Give me your age");
        age = Integer.parseInt(console.nextLine());
        System.out.println("age = " + age);
        
        var textAge = String.valueOf(10);
        System.out.println("textAge = " + textAge);
        
        var character = "hello".charAt(1);
        System.out.println("character = " + character);
        
        System.out.println("Give me a character");
        
        var character1 = console.nextLine().charAt(0);
        System.out.println("character1 = " + character1);
    }
    
}
