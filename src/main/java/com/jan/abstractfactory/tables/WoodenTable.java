package com.jan.abstractfactory.tables;

import com.jan.abstractfactory.interfaces.Table;

public class WoodenTable implements Table {
    private final String name;
    private final String color;

    public WoodenTable(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void sitAt() {
        System.out.println("Sitting at " + this.name + " a " + this.getColor() + " " + this.getClass()
                .getSimpleName());
    }
}
