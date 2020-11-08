/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.miguel.test;

import mx.com.miguel.sales.Order;
import mx.com.miguel.sales.Product;

/**
 *
 * @author miguel
 */
public class SalesTest extends Order {
    public static void main(String[] args) {
        Product product = new Product("PS5", 13000.12);
        Product product1 = new Product("XBOX S", 8888.71);
        Product product2 = new Product("HEADPHONES", 7555.12);
        Product product3 = new Product("IMAC", 33330.13);
        
        Order order = new Order();
        order.addProduct(product);
        order.addProduct(product1);
        order.addProduct(product2);
        order.addProduct(product3);
        order.showOrder();
        
        
    }
}
