package com.company.decorators;

import com.company.animal.Animal;

/**
 * Base Decorator Class
 */

public abstract class AnimalVoiceBaseDecorator extends Animal {

    public abstract String makeSound();
}
