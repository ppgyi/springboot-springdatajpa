package com.example.springbootspringdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestAnimalService implements TestAnimalServiceImplement {

    @Autowired
    private TestAnimalRepository repository;
}
