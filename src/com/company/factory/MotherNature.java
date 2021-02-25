package com.company.factory;

import com.company.animal.*;
import com.company.state.State;

public class MotherNature implements Fertility {

    private static MotherNature instance;

    private MotherNature() {}

    /**
     * Singleton pattern
     */

    public static MotherNature getInstance() {
        if (instance == null) {
            instance = new MotherNature();
        }
        return instance;
    }

    /**
     * Factory Method pattern
     */

    @Override
    public Animal giveBirth(AnimalSpecies species, String name) {
        switch (species) {
            case CAT:
                return new Cat(name);
            case DOG:
                return new Dog(name);
            case COW:
                return new Cow(name);
            default:
                throw new IllegalArgumentException("Unknown species!");
        }
    }
}
