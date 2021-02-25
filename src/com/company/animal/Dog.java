package com.company.animal;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public String getDefaultSound() {
        return "Woof!";
    }
}
