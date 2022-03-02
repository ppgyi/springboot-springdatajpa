package com.example.springbootspringdatajpa;

import lombok.Getter;

@Getter
public class TestAnimalResponse {

    private String species;

    public TestAnimalResponse(TestEntityAnimal a) {
        this.species = a.getSpecies();
    }
}
