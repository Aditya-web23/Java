/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Test;

/**
 *
 * @author aditya
 */
public class Vegetables extends Veg {
    String colour;

    public Vegetables(String colour, boolean PlantBased, String name, double price) {
        super(PlantBased, name, price);
        this.colour = colour;
    }
    
     
    public String toString(){
        return "colour: "+ this.colour +"is it plant based: "+ this.PlantBased+"name: "+this.name+"price: "+this.price;
    }
    
}
