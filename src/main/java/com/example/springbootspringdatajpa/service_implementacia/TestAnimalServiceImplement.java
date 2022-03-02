package com.example.springbootspringdatajpa.service_implementacia;

import com.example.springbootspringdatajpa.TestAnimalRequest;
import com.example.springbootspringdatajpa.entity.TestEntityAnimal;

import java.util.List;
import java.util.Optional;

public interface TestAnimalServiceImplement {

    List<TestEntityAnimal> getAll();
    TestEntityAnimal create(TestAnimalRequest request);
    void deleteById(Long id);
    Optional<TestEntityAnimal> findById(Long id);
    List<TestEntityAnimal> getAllByName(String meno);
}
