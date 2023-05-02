package com.jan.abstractfactory.factories;

import com.jan.abstractfactory.beds.WoodenBed;
import com.jan.abstractfactory.chairs.WoodenChair;
import com.jan.abstractfactory.tables.WoodenTable;

public class WoodFurnitureFactory implements FurnitureFactory {

    @Override
    public WoodenBed createBed(String name, String color) {
        return new WoodenBed(name, color);
    }

    @Override
    public WoodenChair createChair(String name, String color) {
        return new WoodenChair(name, color);
    }

    @Override
    public WoodenTable createTable(String name, String color) {
        return new WoodenTable(name, color);
    }
}
