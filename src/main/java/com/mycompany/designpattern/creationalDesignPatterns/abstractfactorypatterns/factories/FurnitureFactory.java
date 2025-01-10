package com.mycompany.designpattern.creationalDesignPatterns.abstractfactorypatterns.factories;

import com.mycompany.designpattern.creationalDesignPatterns.abstractfactorypatterns.productsinterfacesandclasses.Chair;
import com.mycompany.designpattern.creationalDesignPatterns.abstractfactorypatterns.productsinterfacesandclasses.Table;

public interface FurnitureFactory {
    Chair createChair();
    Table createTable();
}
