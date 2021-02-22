package com.company.factory;

import com.company.animal.Animal;
import com.company.animal.AnimalSpecies;

public interface Fertility {

    Animal giveBirth(AnimalSpecies species, String name);
}
