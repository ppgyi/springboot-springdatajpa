package com.example.springbootspringdatajpa.repository;

import com.example.springbootspringdatajpa.entity.TestEntityPerson;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestPersonRepository extends CrudRepository<TestEntityPerson, Long> {

    List<TestEntityPerson> findAll();
}
