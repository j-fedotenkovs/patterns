package com.company.decorators;

import com.company.animal.Animal;

public class SpeakingAnimalDecorator extends AnimalVoiceBaseDecorator {

    public SpeakingAnimalDecorator(Animal animal) {
        super(animal);
    }

    @Override
    public String makeSound() {
        return learnToSpeak(super.makeSound());
    }

    private String learnToSpeak(String voice) {
        return String.format("My name is %s, now I can speak! %s", super.getName(), voice);
    }

    @Override
    public String getDefaultSound() { return null; }
}
