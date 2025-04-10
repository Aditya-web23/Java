/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Test;

/**
 *
 * @author aditya
 */
public class Food {
    String name;
    double price;

    public Food(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    public String toString(){
        return "name: "+this.name+"price: "+this.price;
    }
}
