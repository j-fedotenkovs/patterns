package com.company.decorators;

import com.company.animal.Animal;

public class RussianSpeakingAnimalDecorator extends AnimalVoiceBaseDecorator {

    private final Animal animal;

    public RussianSpeakingAnimalDecorator(Animal animal) {
        this.animal = animal;
    }

    @Override
    public String makeSound() {
        return animal.makeSound() + " Я говорю по-русски! " + getDefaultSound();
    }

    @Override
    public String getDefaultSound() { return animal.getDefaultSound(); }
}
