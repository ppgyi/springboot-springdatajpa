package com.example.springbootspringdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TestAnimalService implements TestAnimalServiceImplement {

    @Autowired
    private TestAnimalRepository repository;

    @Override
    public List<TestEntityAnimal> getAll() {
        return this.repository.findAll();
    }
}
