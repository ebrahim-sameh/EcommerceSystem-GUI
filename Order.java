/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ecommercesystem;

/**
 *
 * @author hema
 */
public class Order {
    int customerId;
    int orderId;
    Product[] products;
    double totalPrice;
    
    Order(int customerId, int orderId, Product[] products, double totalPrice) {
        this.customerId = Math.abs(customerId); // Ensure positive value
        this.orderId = Math.abs(orderId); // Ensure positive value
        this.products = products;
        this.totalPrice = Math.abs(totalPrice); // Ensure positive value
    }
    public int getOrderId(){
        return orderId;}
    public int getCustomerId(){
        return customerId;}
    public Product[] getProducts(){
        return products;}
    public double getTotalPrice(){
        return totalPrice;}
    public void printOrderInfo() {
    System.out.println("Order ID: " + orderId);
    System.out.println("Customer ID: " + customerId);
    System.out.println("Products:");
    for (Product product : products) {
        System.out.println("Name: " + product.getName());
        System.out.println("Price: $" + product.getPrice());
    }
    System.out.println("Total Price: $" + totalPrice);
}
}

