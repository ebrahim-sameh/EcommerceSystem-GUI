/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ecommercesystem;
/**
 *
 * @author hema
 */
public class Cart {
    int nProducts;
    int customerId;
    Product[] products;
    Cart(int nProducts,int customerId){
        this.customerId = Math.abs(customerId); 
        this.nProducts = Math.abs(nProducts);
        this.products = new Product[nProducts];}  
    public void setNProducts(int nProducts) {
        this.nProducts = Math.abs(nProducts); }
    public int getNProducts() {
        return nProducts;}
    public boolean getProductsN() {
         for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                return false;}}
         return true;}
    public void setCustomerId(int customerId) {
        this.customerId = Math.abs(customerId);}
    public int getCustomerId() {
        return customerId;}
    public void addProduct(Product product){
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                products[i] = product;
                return;
     }
        System.out.println("added product to cart");
    }}
    public void setProducts(Product[] products) {
        this.products = products;
    }

    public Product[] getProducts() {
        return products;
    }
    
    public double getTotalPrice(){
        double total=0;
        for (int i = 0; i < products.length; i++) {
                total = total + products[i].price;
    }
        return total;
}
    
    public void removeProduct(Product productToRemove) {
    for (int i = 0; i < products.length; i++) {
        if (products[i] != null && products[i].equals(productToRemove)) {
            products[i] = null;
            System.out.println("product removed from cart: " + productToRemove.getName());
            return; }}
    System.out.println("product not found in cart: " + productToRemove.getName());
}}