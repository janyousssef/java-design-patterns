package com.jan.prototype;

public class PrototypeRunner {
    public static void main(String[] args) {
        Shape c1 = new Circle("Circy the Circle", "10", "Red");
        Shape c2 = c1.customClone(c1);

        System.out.println("-----------Original circle-----------");
        c1.draw();
        System.out.println("\n-----------Cloned circle-----------");
        c2.draw();
        System.out.println("\nAre both circles the same object? " + (c1 == c2));
        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
    }
}
