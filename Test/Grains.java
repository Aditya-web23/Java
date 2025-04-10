/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Test;

/**
 *
 * @author aditya
 */
public class Grains extends Veg {
    boolean isProtein;

    public Grains(boolean isProtein, boolean PlantBased, String name, double price) {
        super(PlantBased, name, price);
        this.isProtein = isProtein;
    }
    
    public String toString(){
        return "\n do it have protein:"+ this.isProtein +"is it plant based: "+ this.PlantBased+"name: "+this.name+"price: "+this.price;
    }
    
    
}
