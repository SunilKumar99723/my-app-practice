package com.mycompany.designpattern.creationalDesignPatterns.abstractfactorypatterns.productsinterfacesandclasses;

public class ModernTable implements Table {
    @Override
    public void placeItemsOn() {
        System.out.println("Placing items on a modern table.");
    }
}