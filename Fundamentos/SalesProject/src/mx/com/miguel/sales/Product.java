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
public class Product {
    private final int idProduct;
    private String name;
    private double price;
    private static int countProduct;

    
    private  Product(){
        this.idProduct = ++Product.countProduct;
    }
    public Product(String name, double price) {
        this();
        this.name = name;
        this.price = price;
    }

    public int getIdProduct() {
        return this.idProduct;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Product{idProduct=").append(idProduct);
        sb.append(", name=").append(name);
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
