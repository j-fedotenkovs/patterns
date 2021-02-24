package com.company.animal;

public abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    protected Animal() {
    }

    public String getName() {
        return name;
    }

    public abstract String makeSound();
}
