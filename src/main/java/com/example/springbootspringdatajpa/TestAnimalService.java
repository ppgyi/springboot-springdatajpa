package com.example.springbootspringdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestAnimalService implements TestAnimalServiceImplement {

    @Autowired
    private TestAnimalRepository repository;

    @Override
    public List<TestEntityAnimal> getAll() {
        return this.repository.findAll();
    }

    @Override
    public TestEntityAnimal create(TestAnimalRequest request) {
        TestEntityAnimal newAnimal = new TestEntityAnimal();
        newAnimal.setSpecies(request.getSpecies());
        return this.repository.save(newAnimal);
    }
}
