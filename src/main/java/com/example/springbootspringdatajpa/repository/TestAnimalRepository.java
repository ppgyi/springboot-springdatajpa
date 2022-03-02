package com.example.springbootspringdatajpa.repository;

import com.example.springbootspringdatajpa.entity.TestEntityAnimal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestAnimalRepository extends
        CrudRepository<TestEntityAnimal, Long> {
    List<TestEntityAnimal> findAll();

    // Sposob na filtrovanie podla mena:
    // Staci si vytvorit metodu tu v repository:
    // Spring si vsetko vie automaticky vygenerovat napr staci takto:
    // List<TestEntityAnimal> findByNameAndId(String name, long Id);
    List<TestEntityAnimal> findByName(String name);
}
