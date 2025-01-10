package com.mycompany.designpattern.creationalDesignPatterns.abstractfactorypatterns.factories;

import com.mycompany.designpattern.creationalDesignPatterns.abstractfactorypatterns.productsinterfacesandclasses.Chair;
import com.mycompany.designpattern.creationalDesignPatterns.abstractfactorypatterns.productsinterfacesandclasses.ModernChair;
import com.mycompany.designpattern.creationalDesignPatterns.abstractfactorypatterns.productsinterfacesandclasses.ModernTable;
import com.mycompany.designpattern.creationalDesignPatterns.abstractfactorypatterns.productsinterfacesandclasses.Table;

public class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Table createTable() {
        return new ModernTable();
    }
}


