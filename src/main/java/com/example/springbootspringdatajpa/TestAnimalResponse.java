package com.example.springbootspringdatajpa;

import lombok.Getter;

@Getter
public class TestAnimalResponse {

    private long id;

    private String species;

    private String name;

    public TestAnimalResponse(TestEntityAnimal a) {
        this.id = a.getId();
        this.species = a.getSpecies();
        this.name = a.getName();
    }
}
