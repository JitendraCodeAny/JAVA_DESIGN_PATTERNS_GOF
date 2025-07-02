package com.jitendra.dp.usecase.builder;

// Director class that manage the building process
public class CivilEngineer {
    private HouseBuilder builder;

    CivilEngineer(HouseBuilder builder) {
        this.builder = builder;
    }

    House buildHouse() {
        builder.buildFoundation();
        builder.buildStructure();
        builder.buildRoof();
        return builder.getHouse();
    }
}
