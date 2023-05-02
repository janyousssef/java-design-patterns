package com.jan.abstractfactory.beds;

import com.jan.abstractfactory.interfaces.Bed;

public class WoodenBed implements Bed {
    private final String name;
    private final String color;

    public WoodenBed(String name, String color) {
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
    public void sleepOn() {
        System.out.println("Sleeping on" + this.name + " a " + this.getColor() + " " + this.getClass()
                .getSimpleName() + " chair.");
    }
}
