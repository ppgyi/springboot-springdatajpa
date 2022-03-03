package com.example.springbootspringdatajpa.response;

import com.example.springbootspringdatajpa.entity.TestEntityAnimal;
import com.example.springbootspringdatajpa.entity.TestEntityPerson;
import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
public class TestAnimalResponse {

    private long id;

    private String species;

    private String name;

//    private Long person;
    private TestPersonResponse person;

    private List<TestPersonResponse> personList;

    public TestAnimalResponse(TestEntityAnimal a) {
        this.id = a.getId();
        this.species = a.getSpecies();
        this.name = a.getName();
//        this.person = a.getPerson() == null ? null : a.getPerson().getId();
        this.person = a.getPerson() != null ? new TestPersonResponse(a.getPerson()) : null;
        this.personList = a.getPersonList().stream().map(TestPersonResponse::new).collect(Collectors.toList());
    }
}
