package com.company.state;

import com.company.animal.Animal;

/**
 * State pattern base class
 */

public abstract class State {

    private Animal animal;

    public State(Animal animal) {
        this.animal = animal;
    }
}
