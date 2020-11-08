
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
public class TriangleArea {
    public static void main(String args[]){
        var console = new Scanner(System.in);
        System.out.println("Provide the height");
        var height = Integer.parseInt(console.nextLine());
        System.out.println("Provide the width");
        var width = Integer.parseInt(console.nextLine());
        var area = area(height,width);
        var perimeter = perimeter(height,width);
        
        System.out.println("Area:  " + area + "\nPerimeter: " + perimeter);
    }
    
    public static int area(int height, int width ){
         var finalArea = height * width;
        return finalArea;
    }
    
    public static int perimeter(int height, int width ){
         var finalPerimeter = (height + width) * 2;
        return finalPerimeter;
    }
}
