package com.company.animal;

public class Cow extends Animal {

    public Cow(String name) {
        super(name);
    }

    @Override
    public String getDefaultSound() {
        return "Moo!";
    }
}
