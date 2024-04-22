/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ecommercesystem;

/**
 *
 * @author hema
 */
public class Customer {
    String name;
    String address;
    int customerId;
    
    Customer(String name,String address,int customerId){
        this.name = name;
        this.address = address;
        this.customerId = Math.abs(customerId);
    }
    public int getCustomerId() {
        return customerId;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public void setCustomerId(int customerId) {
        this.customerId = Math.abs(customerId);
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
}
