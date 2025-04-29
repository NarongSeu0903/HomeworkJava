package model;

import java.util.Arrays;

public enum VehicleOfModel {
    TOYOTA("Offroad"),
    HONDA("Sport Car"),
    BMW("Super Car"),
    FORD("Offroad", "Truck"),
    TESLA("Super Car", "Electric");

    private final String[] categories;

    VehicleOfModel(String... categories) {
        this.categories = categories;
    }

    public String[] getCategories() {
        return categories;
    }

    @Override
    public String toString() {
        return this.name() + " " + Arrays.toString(categories);
    }
}
