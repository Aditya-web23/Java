/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Test;

/**
 *
 * @author aditya
 */
public class Meat extends NonVeg {
    double ProteinContent;

    public Meat(double ProteinContent, String AnimalSource, String name, double price) {
        super(AnimalSource, name, price);
        this.ProteinContent = ProteinContent;
    }

  
    public String toString(){
        return "Protein content: "+this.ProteinContent +"Animal source: "+this.AnimalSource+ "name: "+this.name; 
    }
}
