package com.example.springbootspringdatajpa;

import java.util.List;

public interface TestAnimalServiceImplement {

    List<TestEntityAnimal> getAll();
    TestEntityAnimal create(TestAnimalRequest request);

}
