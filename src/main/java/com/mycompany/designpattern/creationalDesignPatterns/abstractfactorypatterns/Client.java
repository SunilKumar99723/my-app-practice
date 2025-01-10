package com.mycompany.designpattern.creationalDesignPatterns.abstractfactorypatterns;

import com.mycompany.designpattern.creationalDesignPatterns.abstractfactorypatterns.productsinterfacesandclasses.Chair;
import com.mycompany.designpattern.creationalDesignPatterns.abstractfactorypatterns.productsinterfacesandclasses.Table;
import com.mycompany.designpattern.creationalDesignPatterns.abstractfactorypatterns.factories.FurnitureFactory;
import com.mycompany.designpattern.creationalDesignPatterns.abstractfactorypatterns.factories.ModernFurnitureFactory;
import com.mycompany.designpattern.creationalDesignPatterns.abstractfactorypatterns.factories.VictorianFurnitureFactory;

public class Client {
    private Chair chair;
    private Table table;

    public Client(FurnitureFactory factory) {
        chair = factory.createChair();
        table = factory.createTable();
    }

    public void useFurniture() {
        chair.sitOn();
        table.placeItemsOn();
    }

    public static void main(String[] args) {
        FurnitureFactory factory = new ModernFurnitureFactory();
        Client client = new Client(factory);
        client.useFurniture();  // Output: Sitting on a modern chair. Placing items on a modern table.

        factory = new VictorianFurnitureFactory();
        client = new Client(factory);
        client.useFurniture();  // Output: Sitting on a Victorian chair. Placing items on a Victorian table.
    }
}

//Benefits
//        Flexibility: Easily switch between different product families.
//        Consistency: Ensures that related products are used together.
//        Decoupling: Decouples client code from concrete classes, promoting loose coupling and easier maintenance.
//
//        The Abstract Factory Pattern is particularly useful when you need to create families of
//        related objects and want to ensure consistency across the application.