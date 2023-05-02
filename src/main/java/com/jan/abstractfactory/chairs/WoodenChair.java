package com.jan.abstractfactory.chairs;

import com.jan.abstractfactory.interfaces.Chair;

public class WoodenChair implements Chair {
    private final String name;
    private final String color;

    public WoodenChair(String name, String color) {
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
    public void sitOn() {
        System.out.println("Sitting on " + this.name + " a " + this.getColor() + " " + this.getClass()
                .getSimpleName());
    }
}
