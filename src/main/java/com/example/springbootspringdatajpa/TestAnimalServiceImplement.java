package com.example.springbootspringdatajpa;

import java.util.List;
import java.util.Optional;

public interface TestAnimalServiceImplement {

    List<TestEntityAnimal> getAll();
    TestEntityAnimal create(TestAnimalRequest request);
    void deleteById(Long id);
    Optional<TestEntityAnimal> findById(Long id);
}
