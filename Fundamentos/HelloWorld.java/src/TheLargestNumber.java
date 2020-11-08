
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
public class TheLargestNumber {
    public static void main(String args[]){
        var console = new Scanner(System.in);
        System.out.println("Provide the fisrt number:");
        var firstNumber = Integer.parseInt(console.nextLine());
        System.out.println("Provide the second number:");
        var secondNumber = Integer.parseInt(console.nextLine());
        var finalNumber = finalNumber(firstNumber, secondNumber);
        System.out.println("The largest number is: " + finalNumber);
    }
    
    public static int finalNumber(int firstNumber, int secondNumber){
        if (firstNumber > secondNumber){
            return firstNumber;
        }else{
            return secondNumber;
        }
    } 
}
