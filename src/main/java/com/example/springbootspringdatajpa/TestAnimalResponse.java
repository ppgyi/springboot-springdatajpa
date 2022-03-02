package com.example.springbootspringdatajpa;

import lombok.Getter;

@Getter
public class TestAnimalResponse {

    private long id;

    private String species;

    public TestAnimalResponse(TestEntityAnimal a) {
        this.id = a.getId();
        this.species = a.getSpecies();
    }
}
