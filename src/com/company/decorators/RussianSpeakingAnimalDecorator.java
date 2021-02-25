package com.company.decorators;

import com.company.animal.Animal;

public class RussianSpeakingAnimalDecorator extends AnimalVoiceBaseDecorator {

    public RussianSpeakingAnimalDecorator(Animal animal) {
        super(animal);
    }

    @Override
    public String makeSound() {
        return super.makeSound() + " Я говорю по-русски!";
    }

    @Override
    public String getDefaultSound() { return null; }
}
