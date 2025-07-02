package com.jitendra.dp.usecase.builder;

//Concrete builder class
public class LuxuryVillaBuilder extends HouseBuilder {

    void buildFoundation() {
        house.foundation = "Built Concrete Foundation with Basement";
    }
    void buildStructure() {
        house.structure = "Built with Marble and Steel Walls";
    }
    void buildRoof() {
        house.roof = "Built Tiled Roof with Solar Glass Panels";
    }
    
}
