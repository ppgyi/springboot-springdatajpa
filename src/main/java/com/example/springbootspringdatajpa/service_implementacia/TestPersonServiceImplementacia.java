package com.example.springbootspringdatajpa.service_implementacia;

import com.example.springbootspringdatajpa.entity.TestEntityPerson;

import java.util.List;

public interface TestPersonServiceImplementacia {

    List<TestEntityPerson> findAll();
    TestEntityPerson getById(long id);
    TestEntityPerson save(TestEntityPerson p);

}
