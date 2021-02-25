package com.company.state;

import com.company.animal.Animal;

public class EatingState extends State {

    public EatingState(Animal animal) {
        super(animal);
        animal.setSound("...Omnomnom...");
    }
}
