package com.company.animal.domesticated;

import com.company.Owner;
import com.company.animal.Animal;

public class DomesticatedDog extends DomesticatedAnimal {

    public DomesticatedDog(Animal animal, Owner owner) {
        super(animal, owner);
    }

    @Override
    public String takeAction() {
        return String.format("%s is running after a stick", name);
    }
}
