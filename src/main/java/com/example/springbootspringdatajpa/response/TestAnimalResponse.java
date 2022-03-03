package com.example.springbootspringdatajpa.response;

import com.example.springbootspringdatajpa.entity.TestEntityAnimal;
import lombok.Getter;

@Getter
public class TestAnimalResponse {

    private long id;

    private String species;

    private String name;

    private Long person;

    public TestAnimalResponse(TestEntityAnimal a) {
        this.id = a.getId();
        this.species = a.getSpecies();
        this.name = a.getName();
        this.person = a.getPerson() == null ? null : a.getPerson().getId();
    }
}
