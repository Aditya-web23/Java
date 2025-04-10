/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Test;

/**
 *
 * @author aditya
 */
public class Veg extends Food {
 boolean PlantBased;

    public Veg(boolean PlantBased, String name, double price) {
        super(name, price);
        this.PlantBased = PlantBased;
    }
 
  
    public String toString(){
        return "is it plant based: "+ this.PlantBased+"name: "+this.name+"price: "+this.price;
    }
    
}
