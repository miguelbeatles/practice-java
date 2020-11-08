
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
public class QualificationSystem {

    public static void main(String args[]) {
        var console = new Scanner(System.in);
        System.out.println("Enter your qualification");
        var qualification = Double.parseDouble(console.nextLine());
        calculateQualification(qualification);
    }
    
    public static void calculateQualification(double qualification) {
        if (qualification >= 9 && qualification <= 10) {
            System.out.println("A");
        } else if (qualification >= 8 && qualification < 9) {
            System.out.println("B");
        } else if (qualification >= 7 && qualification < 8) {
            System.out.println("c");
        } else if (qualification >= 6 && qualification < 7) {
            System.out.println("D");
        } else if (qualification >= 0 && qualification < 6) {
            System.out.println("F");
        } else {
            System.out.println("Unknown Value");
        }
    }
}
