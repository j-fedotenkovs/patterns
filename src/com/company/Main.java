package com.company;

import com.company.adapter.AnimalDomesticationAdapter;
import com.company.animal.Animal;
import com.company.animal.AnimalSpecies;
import com.company.animal.domesticated.DomesticatedAnimal;
import com.company.decorators.AnimalVoiceBaseDecorator;
import com.company.decorators.RussianSpeakingAnimalDecorator;
import com.company.decorators.SpeakingAnimalDecorator;
import com.company.factory.MotherNature;
import com.company.state.EatingState;
import com.company.state.SleepingState;

public class Main {

    public static void main(String[] args) {
        MotherNature motherNature = MotherNature.getInstance();

        Animal cat = motherNature.giveBirth(AnimalSpecies.CAT, "Barsik");
        Animal dog = motherNature.giveBirth(AnimalSpecies.DOG, "Sharik");
        Animal cow = motherNature.giveBirth(AnimalSpecies.COW, "Burenka");

        cat.setState(new SleepingState(cat));
        System.out.println(cat.makeSound());

        cow.setState(new EatingState(cow));
        System.out.println(cow.makeSound());

        AnimalVoiceBaseDecorator voiceDecorator = new SpeakingAnimalDecorator(
                new RussianSpeakingAnimalDecorator(dog));
        System.out.println(voiceDecorator.makeSound());


        Owner owner = new Owner();
        AnimalDomesticationAdapter adapter = new AnimalDomesticationAdapter();

        DomesticatedAnimal barsik = adapter.domesticateAnimal(cat, owner);
        DomesticatedAnimal sharik = adapter.domesticateAnimal(dog, owner);
        DomesticatedAnimal burenka = adapter.domesticateAnimal(cow, owner);

        owner.getAnimals().forEach(animal -> System.out.println(owner.interactWithAnimal(animal.getName())));


    }
}
