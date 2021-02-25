package com.company.decorators;

import com.company.animal.Animal;

public class SpeakingAnimalDecorator extends AnimalVoiceBaseDecorator {

    private final Animal animal;

    public SpeakingAnimalDecorator(Animal animal) {
        this.animal = animal;
    }

    @Override
    public String makeSound() {
        return animal.makeSound() + " Now I can speak! " + getDefaultSound();
    }

    @Override
    public String getDefaultSound() { return animal.getDefaultSound(); }
}
