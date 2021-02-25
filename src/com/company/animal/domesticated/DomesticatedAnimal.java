package com.company.animal.domesticated;

import com.company.Owner;
import com.company.animal.Animal;

public abstract class DomesticatedAnimal {

    private Owner owner;

    protected String name;

    public DomesticatedAnimal(Animal animal, Owner owner) {
        name = animal.getName();
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public abstract String takeAction();
}
