
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
public class BookStore {
    public static void main(String args[]){
        var console = new Scanner(System.in);
        System.out.println("Provide the name;");
        var name = console.nextLine();
        System.out.println("Provide the id;");
        var id = Integer.parseInt(console.nextLine());
        System.out.println("Provide the price;");
        var price = Double.parseDouble(console.nextLine());
        System.out.println("Provide yes if  free shipping;");
        var shipping = console.nextLine().charAt(0);
        var freeShipping = freeShipping(shipping);
        
        System.out.println(name + " #" + id + "\nPrice:" + price + "\nFree Shipping:" + freeShipping);
    }
    
    public static boolean freeShipping(char shipping){
        if(shipping == 'y' || shipping == 'Y')
            return true;
        else
            return false;
        
    }
}
