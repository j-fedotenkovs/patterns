package com.company;

import com.company.animal.*;
import com.company.decorators.AnimalVoiceBaseDecorator;
import com.company.decorators.RussianSpeakingAnimalDecorator;
import com.company.decorators.SpeakingAnimalDecorator;
import com.company.factory.MotherNature;

public class Main {

    public static void main(String[] args) {
        MotherNature motherNature = MotherNature.getInstance();

        Owner owner = new Owner();

        Animal barsik = motherNature.giveBirth(AnimalSpecies.CAT, "Barsik");
        Animal sharik = motherNature.giveBirth(AnimalSpecies.DOG, "Sharik");
        Animal burenka = motherNature.giveBirth(AnimalSpecies.COW, "Burenka");

        owner.petAnimal(barsik);

        singTogether(barsik.makeSound(), sharik.makeSound(), burenka.makeSound());

        AnimalVoiceBaseDecorator voiceDecorator = new SpeakingAnimalDecorator(
                new RussianSpeakingAnimalDecorator(barsik));
        System.out.println(voiceDecorator.makeSound());
    }

    static void singTogether(String... animalSounds) {
        System.out.println(String.format("Animal song: %s", String.join(" ", animalSounds)));
    }
}
