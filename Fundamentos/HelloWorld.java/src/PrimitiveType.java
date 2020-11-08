/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author miguel
 */
public class PrimitiveType {
    public static void main(String args[]){
        
        ////type int
        
        byte numByte = 12;
        System.out.println("numByte = " + numByte);
        System.out.println("minByte = " + Byte.MIN_VALUE);
        System.out.println("maxByte = " + Byte.MAX_VALUE);
        int numInt = 12;
        System.out.println("numInt = " + numInt);
        System.out.println("minInt = " + Integer.MIN_VALUE);
        System.out.println("maxInt = " + Integer.MAX_VALUE);
        short numShort = 12;
        System.out.println("numShort = " + numShort);
        System.out.println("minShort = " + Short.MIN_VALUE);
        System.out.println("maxShort = " + Short.MAX_VALUE);
        long numLong = 12;
        System.out.println("numLong = " + numLong);
        System.out.println("minLong = " + Long.MIN_VALUE);
        System.out.println("maxLong = " + Long.MAX_VALUE);
        
        // type float and double
        
        float numFloat = 10.1F;
        System.out.println("numFloat = " + numFloat);
        System.out.println("minFloat = " + Float.MIN_VALUE);
        System.out.println("maxFloat = " + Float.MAX_VALUE);
        double numDouble = (double)10.1;
        System.out.println("numDouble = " + numDouble);
        System.out.println("minDouble = " + Double.MIN_VALUE);
        System.out.println("maxDouble = " + Double.MAX_VALUE);
    }
}
