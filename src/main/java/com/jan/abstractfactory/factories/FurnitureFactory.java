package com.jan.abstractfactory.factories;

import com.jan.abstractfactory.interfaces.Bed;
import com.jan.abstractfactory.interfaces.Chair;
import com.jan.abstractfactory.interfaces.Table;

public interface FurnitureFactory {
    Bed createBed(String name, String color);
    Chair createChair(String name, String color);
    Table createTable(String name, String color);
    default FurnitureFactory getFactory(String type) {
        if (type.equals("wood")) {
            return new WoodFurnitureFactory();
        } else if (type.equals("sturdy")) {
            return new SturdyFurnitureFactory();
        } else {
            return null;
        }
    }

}
