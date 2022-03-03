package com.example.springbootspringdatajpa.response;

import com.example.springbootspringdatajpa.entity.TestEntityPerson;
import lombok.Getter;

@Getter
public class TestPersonResponse {

    private long id;
    private String name;
    private Long animalId;

    public TestPersonResponse(TestEntityPerson person) {
        this.id = person.getId();
        this.name = person.getName();
        this.animalId = person.getAnimal() != null ? person.getAnimal().getId() : null;
    }
}
