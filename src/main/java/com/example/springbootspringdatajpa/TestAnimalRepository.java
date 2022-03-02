package com.example.springbootspringdatajpa;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestAnimalRepository extends
        CrudRepository<TestEntityAnimal, Long> {
    List<TestEntityAnimal> findAll();
}
