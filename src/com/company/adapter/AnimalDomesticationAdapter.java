package com.company.adapter;

import com.company.Owner;
import com.company.animal.Animal;
import com.company.animal.Cat;
import com.company.animal.Cow;
import com.company.animal.Dog;
import com.company.animal.domesticated.DomesticatedAnimal;
import com.company.animal.domesticated.DomesticatedCat;
import com.company.animal.domesticated.DomesticatedCow;
import com.company.animal.domesticated.DomesticatedDog;

/**
 * Adapter pattern
 */

public class AnimalDomesticationAdapter {

    public AnimalDomesticationAdapter() {
    }

    public DomesticatedAnimal domesticateAnimal(Animal animal, Owner owner) {
        DomesticatedAnimal domesticatedAnimal;

        if (animal instanceof Cat) {
            domesticatedAnimal = new DomesticatedCat(animal, owner);
        } else if (animal instanceof Dog) {
            domesticatedAnimal = new DomesticatedDog(animal, owner);
        } else if (animal instanceof Cow) {
            domesticatedAnimal = new DomesticatedCow(animal, owner);
        } else { throw new IllegalArgumentException("Invalid Animal type!"); }

        owner.adoptAnimal(domesticatedAnimal);

        return domesticatedAnimal;
    }
}
