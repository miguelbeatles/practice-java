/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author miguel
 */
public class Variables {
    public static void main(String args[]){
        //Defined variable
        int myVariableInteger = 21;
        System.out.println(myVariableInteger);
        //Modify la variable
        myVariableInteger = 11;
        System.out.println(myVariableInteger);
        String myVariableString = "Welcome";
        System.out.println(myVariableString);
        myVariableString = "Bye";
        System.out.println(myVariableString);
        
        // var - Inference in types
        var myVariableInteger1 = 1;
        System.out.println(myVariableInteger1);
        var myVariableString1 = 22;
        System.out.println("myVariableString1 = " + myVariableString1);
    }
    
}
