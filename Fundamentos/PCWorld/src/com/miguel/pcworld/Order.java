/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miguel.pcworld;

/**
 *
 * @author miguel
 */
public class Order {
    private final int idOrder;
    private Computer computers[];
    private int countOrders;
    private int countComputers;
    private final int MAX_COMPUTERS = 10;
    
    public Order(){
       this.idOrder= ++countOrders;
       this.computers= new Computer[MAX_COMPUTERS];
    }
    
    public void addComputer(Computer computer){
        if (this.countComputers < this.MAX_COMPUTERS) {
            this.computers[this.countComputers++] = computer; 
        }else{
            System.out.println("You exceed the number of products");
        }
    }
    
    public void showOrder(){
        System.out.println("Id Order: " + this.idOrder);
        for (int i = 0; i < this.countComputers; i++) {
            System.out.println(this.computers[i]);
        }
    }
}
