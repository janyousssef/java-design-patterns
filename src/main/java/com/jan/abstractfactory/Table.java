package com.jan.abstractfactory;

public class Table {
    private final String name;
    private final String color;

    public Table(String name, String color) {
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
