package com.company;

import com.company.animal.domesticated.DomesticatedAnimal;

import java.util.ArrayList;
import java.util.List;

public class Owner {

    private List<DomesticatedAnimal> animals = new ArrayList<>();

    public Owner() {
    }

    public void adoptAnimal(DomesticatedAnimal animal) {
        animals.add(animal);
    }

    public List<DomesticatedAnimal> getAnimals() {
        return animals;
    }

    public String interactWithAnimal(String name) {
        return animals.stream()
                .filter(animal -> animal.getName().equalsIgnoreCase(name))
                .findFirst()
                .map(DomesticatedAnimal::takeAction)
                .orElseThrow(() -> new IllegalArgumentException(String.format("Animal with name %s not found", name)));
    }
}
