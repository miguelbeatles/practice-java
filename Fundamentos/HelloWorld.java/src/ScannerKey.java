
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
public class ScannerKey {

    public static void main(String args[]) {
        System.out.println("Write your name here");
        Scanner console = new Scanner(System.in);
        var user = console.nextLine();
        System.out.println("user = " + user);
        System.out.println("Write you favorite color");
        var color = console.nextLine();
        System.out.println("Color = " + color + "\nUser = " + user);
    }

}
