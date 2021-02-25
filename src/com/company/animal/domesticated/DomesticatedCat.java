package com.company.animal.domesticated;

import com.company.Owner;
import com.company.animal.Animal;

public class DomesticatedCat extends DomesticatedAnimal {

    public DomesticatedCat(Animal animal, Owner owner) {
        super(animal, owner);
    }

    public String takeAction() {
        return String.format("%s is scratching owner's hand", name);
    }
}
