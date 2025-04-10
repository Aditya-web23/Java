/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Test;

/**
 *
 * @author aditya
 */
public class NonVeg extends Food {
    String AnimalSource;

    public NonVeg(String AnimalSource, String name, double price) {
        super(name, price);
        this.AnimalSource = AnimalSource;
    }

    public String toString(){
        return "Animal source: "+this.AnimalSource+ "name: "+this.name+ "price: "+this.price;
    }
}
