package com.example.springbootspringdatajpa.response;

import com.example.springbootspringdatajpa.entity.TestEntityPerson;
import lombok.Getter;

@Getter
public class TestPersonResponse {

    private long id;
    private String name;

    public TestPersonResponse(TestEntityPerson person) {
        this.id = person.getId();
        this.name = person.getName();
    }
}
