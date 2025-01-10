package com.mycompany.designpattern.creationalDesignPatterns.abstractfactorypatterns.factories;

import com.mycompany.designpattern.creationalDesignPatterns.abstractfactorypatterns.productsinterfacesandclasses.Chair;
import com.mycompany.designpattern.creationalDesignPatterns.abstractfactorypatterns.productsinterfacesandclasses.Table;
import com.mycompany.designpattern.creationalDesignPatterns.abstractfactorypatterns.productsinterfacesandclasses.VictorianChair;
import com.mycompany.designpattern.creationalDesignPatterns.abstractfactorypatterns.productsinterfacesandclasses.VictorianTable;

public class VictorianFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Table createTable() {
        return new VictorianTable();
    }
}