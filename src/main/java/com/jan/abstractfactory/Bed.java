package com.jan.abstractfactory;

public class Bed {
    private final String name;
    private final String color;

    public Bed(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
}
