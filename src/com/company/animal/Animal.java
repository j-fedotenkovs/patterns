package com.company.animal;

import com.company.state.NormalState;
import com.company.state.State;

public abstract class Animal {

    protected String sound;

    private String name;

    private State state;

    public Animal(String name) {
        this.name = name;
        state = new NormalState(this);
    }

    protected Animal() {
    }

    public void setState(State state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String makeSound() {
        return sound;
    };

    public abstract String getDefaultSound();
}
