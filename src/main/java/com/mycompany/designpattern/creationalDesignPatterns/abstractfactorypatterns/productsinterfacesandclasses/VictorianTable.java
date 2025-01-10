package com.mycompany.designpattern.creationalDesignPatterns.abstractfactorypatterns.productsinterfacesandclasses;

public class VictorianTable implements Table {
    @Override
    public void placeItemsOn() {
        System.out.println("Placing items on a Victorian table.");
    }
}