package com.jitendra.dp.usecase.builder;

//abstract builder class
public abstract class HouseBuilder {
    protected House house = new House();

    abstract void buildFoundation();
    abstract void buildStructure();
    abstract void buildRoof();

    House getHouse() {
        return house;
    }
}
