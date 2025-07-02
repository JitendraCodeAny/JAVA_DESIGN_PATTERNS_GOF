package com.jitendra.dp.usecase.builder;

//Concrete builder class that builds
public class ConcreteHouseBuilder  extends HouseBuilder {

    void buildFoundation() {
        house.foundation = "Built with Concrete and Steel Base";
    }
    void buildStructure() {
        house.structure = "Built with Brick, Sand and Cement Walls";
    }
    void buildRoof() {
        house.roof = "Built with Sand, Concrete Slab Roof";
    }

}
