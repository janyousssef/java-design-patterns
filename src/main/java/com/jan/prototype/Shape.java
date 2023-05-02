package com.jan.prototype;

public abstract class Shape {
    private final String name;


    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract Shape customClone(Shape toBeCloned);

    abstract void draw();

}
