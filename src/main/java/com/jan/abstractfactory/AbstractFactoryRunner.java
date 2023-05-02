package com.jan.abstractfactory;

import com.jan.abstractfactory.factories.FurnitureFactory;
import com.jan.abstractfactory.interfaces.Bed;
import com.jan.abstractfactory.interfaces.Chair;
import com.jan.abstractfactory.interfaces.Table;

public class AbstractFactoryRunner {
    public static void main(String[] args) {
        FurnitureFactory woodFactory = FurnitureFactory.getFactory("wood");
        FurnitureFactory sturdyFactory = FurnitureFactory.getFactory("sturdy");

        //wooden items
        Bed woodenBed = woodFactory.createBed("Murphy", "brown");
        Table woodenTable = woodFactory.createTable("Michael", "blue");
        Chair woodenChair = woodFactory.createChair("Nina", "red");
        System.out.println("Wooden items:");
        woodenBed.sleepOn();
        woodenTable.sitAt();
        woodenChair.sitOn();

        //sturdy items
        Bed sturdyBed = sturdyFactory.createBed("Murphy", "brown");
        Table sturdyTable = sturdyFactory.createTable("John", "blue");
        Chair sturdyChair = sturdyFactory.createChair("Ted", "red");

        System.out.println("Sturdy items:");
        sturdyBed.sleepOn();
        sturdyTable.sitAt();
        sturdyChair.sitOn();
    }
}
