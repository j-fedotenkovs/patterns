package com.company.animal.domesticated;

import com.company.Owner;
import com.company.animal.Animal;

public class DomesticatedCow extends DomesticatedAnimal {

    public DomesticatedCow(Animal animal, Owner owner) {
        super(animal, owner);
    }

    @Override
    public String takeAction() {
        return String.format("%s is giving milk", name);
    }
}
