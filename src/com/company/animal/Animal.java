package com.company.animal;

import com.company.state.NormalState;
import com.company.state.State;

public abstract class Animal {

    protected String sound;

    protected String name;

    protected State state;

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
        return String.format("%s says: %s", name, sound);
    }

    public abstract String getDefaultSound();
}
