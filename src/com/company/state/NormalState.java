package com.company.state;

import com.company.animal.Animal;

public class NormalState extends State {

    public NormalState(Animal animal) {
        super(animal);
        animal.setSound(animal.getDefaultSound());
    }
}
