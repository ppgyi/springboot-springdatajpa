package com.example.springbootspringdatajpa.service;

import com.example.springbootspringdatajpa.entity.TestEntityPerson;
import com.example.springbootspringdatajpa.repository.TestPersonRepository;
import com.example.springbootspringdatajpa.service_implementacia.TestPersonServiceImplementacia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestPersonService implements TestPersonServiceImplementacia {

    @Autowired
    private TestPersonRepository repository;

    // Konstruktor sme vytvorili len preto aby sme mohli do databazy na
    // zaciatok nieco vlozit
    public TestPersonService(TestPersonRepository repository) {
        this.repository = repository;
//              Pridat na tvrdo persons:
//        this.repository.save(new TestEntityPerson("Emil"));
//        this.repository.save(new TestEntityPerson("Jakub"));
//        this.repository.save(new TestEntityPerson("Andrej"));
    }

    @Override
    public List<TestEntityPerson> findAll() {
        return this.repository.findAll();
    }

    @Override
    public TestEntityPerson getById(long id) {
        return this.repository.findById(id).get();
    }

    @Override
    public TestEntityPerson save(TestEntityPerson p) {
        return this.repository.save(p);
    }
}
