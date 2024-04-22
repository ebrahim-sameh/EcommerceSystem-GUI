/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ecommercesystem;

/**
 *
 * @author hema
 */
public class ElectronicProduct extends Product {
    String brand;
    int warrantyPeriod;
    
    ElectronicProduct(String brand,int warrantyPeriod,int productId,String name, double price){
        super(productId,name,price);
        this.brand = brand;
        this.warrantyPeriod = Math.abs(warrantyPeriod);
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = Math.abs(warrantyPeriod);
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }
}
