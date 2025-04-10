/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Test;

/**
 *
 * @author aditya
 */
public class SeaFood extends NonVeg {
    String WaterType;

    public SeaFood(String WaterType, String AnimalSource, String name, double price) {
        super(AnimalSource, name, price);
        this.WaterType = WaterType;
    }

   public String toString(){
        return "Water type: "+this.WaterType+"Animal source: "+this.AnimalSource+ "name: "+this.name; 
    }
}
