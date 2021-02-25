package com.company.state;

import com.company.animal.Animal;

public abstract class State {

    private Animal animal;

    public State(Animal animal) {
        this.animal = animal;
    }
}
