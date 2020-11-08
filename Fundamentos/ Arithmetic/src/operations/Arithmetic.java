/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operations;

/**
 *
 * @author miguel
 */
public class Arithmetic {

    int a;
    int b;

    //empty constructor
    public Arithmetic() {
        System.out.println("Running constructor");
    }

    public Arithmetic(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("Running constructor with arguments");
        
    }

    public void add() {
        var result = this.a + this.b;
        System.out.println("result = " + result);
    }

    public int addWithReturn() {
        return this.a + this.b;
    }

    public int addArgument(int arg1, int arg2) {
        this.a = arg1;
        this.b = arg2;
        return this.addWithReturn();
    }

}
