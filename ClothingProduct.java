/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ecommercesystem;

/**
 *
 * @author hema
 */
public class ClothingProduct extends Product{
    String size;
    String fabric;
    
    ClothingProduct(String size,String fabric,int productId,String name, double price){
        super(productId,name,price);
        this.size = size;
        this.fabric = fabric;
    }
    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setFabric(String fabric) {
        this.fabric = fabric;
    }

    public String getFabric() {
        return fabric;
    }
}
