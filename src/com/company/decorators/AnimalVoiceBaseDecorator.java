package com.company.decorators;

import com.company.animal.Animal;

/**
 * Base Decorator Class
 */

public abstract class AnimalVoiceBaseDecorator extends Animal {

    private Animal animal;

    AnimalVoiceBaseDecorator(Animal animal) {
        this.animal = animal;
    }

    @Override
    public String makeSound() {
        return animal.makeSound();
    }

    @Override
    public String getName() {
        return animal.getName();
    }
}
