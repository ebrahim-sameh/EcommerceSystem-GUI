/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ecommercesystem;

/**
 *
 * @author hema
 */
public class Product {
    String name;
    int productId;
    double price;
    
    Product(int productId, String name, double price){
        this.productId = Math.abs(productId); 
        this.name = name;
        this.price = Math.abs(price);
    }
    
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setProductId(int productId) {
        this.productId = Math.abs(productId);
    }

    public void setPrice(double price) {
        this.price = Math.abs(price);
    }
}
