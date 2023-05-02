package com.jan.abstractfactory.factories;

import com.jan.abstractfactory.beds.SturdyBed;
import com.jan.abstractfactory.chairs.SturdyChair;
import com.jan.abstractfactory.tables.SturdyTable;

public class SturdyFurnitureFactory implements FurnitureFactory {
    SturdyFurnitureFactory() {
    }

    @Override
    public SturdyBed createBed(String name, String color) {
        return new SturdyBed(name, color);
    }

    @Override
    public SturdyChair createChair(String name, String color) {
        return new SturdyChair(name, color);
    }

    @Override
    public SturdyTable createTable(String name, String color) {
        return new SturdyTable(name, color);
    }
}
