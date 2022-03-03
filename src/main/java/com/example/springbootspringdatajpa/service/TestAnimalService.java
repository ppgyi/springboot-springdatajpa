package com.example.springbootspringdatajpa.service;

import com.example.springbootspringdatajpa.TestAnimalRequest;
import com.example.springbootspringdatajpa.entity.TestEntityPerson;
import com.example.springbootspringdatajpa.service_implementacia.TestAnimalServiceImplement;
import com.example.springbootspringdatajpa.entity.TestEntityAnimal;
import com.example.springbootspringdatajpa.repository.TestAnimalRepository;
import com.example.springbootspringdatajpa.service_implementacia.TestPersonServiceImplementacia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class TestAnimalService implements TestAnimalServiceImplement {

    @Autowired
    private TestAnimalRepository repository;

    @Autowired
    private TestPersonServiceImplementacia serviceImplement;

    @Override
    public List<TestEntityAnimal> getAll() {
        return this.repository.findAll();
    }

    @Override
    public TestEntityAnimal create(TestAnimalRequest request) {
        TestEntityAnimal newAnimal = new TestEntityAnimal();
        newAnimal.setSpecies(request.getSpecies());
        newAnimal.setName(request.getName());
        return this.repository.save(newAnimal);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Optional<TestEntityAnimal> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<TestEntityAnimal> getAllByName(String meno) {
        return this.repository.findByName(meno);
    }

    @Override
    public TestEntityAnimal addPersonToAnimal(long animalId, long personId) {
        Optional<TestEntityAnimal> animalOpt = this.repository.findById(animalId);
        TestEntityAnimal animal = animalOpt.get();

        TestEntityPerson person = this.serviceImplement.getById(personId);

        animal.setPerson(person);

        return this.repository.save(animal);
    }
}
