package com.company.state;

import com.company.animal.Animal;

public class SleepingState extends State {

    public SleepingState(Animal animal) {
        super(animal);
        animal.setSound("...ZzZzzZzZzz...");
    }
}
