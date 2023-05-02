package com.jan.prototype;

public class Circle extends Shape {
    private final String radius;
    private final String color;

    public Circle(String name, String radius, String color) {
        super(name);
        this.radius = radius;
        this.color = color;
    }

    public String getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    @Override
    Circle customClone(Shape toBeCloned) {
        return new Circle(this.getName(), this.getRadius(), this.getColor());
    }

    @Override
    void draw() {
        System.out.println("Drawing "+this.getName()+" a " + this.getColor() + " " + this.getClass()
                .getSimpleName() + " with radius " + this.getRadius());
    }
}
