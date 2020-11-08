/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.miguel.sales;

/**
 *
 * @author miguel
 */
public class Order {

    private int idOrder;
    private Product products[];
    private static int ordersCount;
    private int productsCount;
    final static int MAX_PRODUCTS = 10;

    public Order() {
        this.idOrder = ++Order.ordersCount;
        this.products = new Product[Order.MAX_PRODUCTS];
    }

    public void addProduct(Product product) {
        if (this.productsCount < 10) {
            this.products[this.productsCount++] = product;
        } else {
            System.out.println("You exceed the number of products ");
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (int i = 0; i < this.productsCount; i++) {
            total += this.products[i].getPrice();
        }
        return total;
    }

    public void showOrder() {
        System.out.println("Id Order: " + this.idOrder);
        System.out.println("Tolal price: $" + this.calculateTotal());
        for (int i = 0; i < this.productsCount; i++) {
            System.out.println("Producto #" + (i + 1) + " = " + products[i]);
        }
    }

}
