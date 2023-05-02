package com.jan.abstractfactory;

public class Chair {
    private final String name;
    private final String color;

    public Chair(String name, String color) {
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
