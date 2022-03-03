package com.example.springbootspringdatajpa.response;

import com.example.springbootspringdatajpa.entity.TestEntityAnimal;
import com.example.springbootspringdatajpa.entity.TestEntityPerson;
import lombok.Getter;

@Getter
public class TestAnimalResponse {

    private long id;

    private String species;

    private String name;

//    private Long person;
    private TestPersonResponse person;

    public TestAnimalResponse(TestEntityAnimal a) {
        this.id = a.getId();
        this.species = a.getSpecies();
        this.name = a.getName();
//        this.person = a.getPerson() == null ? null : a.getPerson().getId();
        this.person = a.getPerson() != null ? new TestPersonResponse(a.getPerson()) : null;
    }
}
