package com.company.animal;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public String getDefaultSound() {
        return "Meow!";
    }
}
