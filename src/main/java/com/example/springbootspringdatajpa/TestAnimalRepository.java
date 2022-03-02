package com.example.springbootspringdatajpa;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestAnimalRepository extends
        CrudRepository<TestEntityAnimal, Long> {
}
