package com.company;

import com.company.animal.Animal;

public class Owner {

    public Owner() {}

    public void petAnimal(Animal animal) {
        System.out.println(String.format("%s says: %s", animal.getName(), animal.makeSound()));
    }
}
